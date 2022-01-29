package com.sam.ds.expression;

import java.util.Stack;

public class PostfixPrefixTest {
  public static int pri(char op) {
    switch (op) {
      case '$':
        return 8;
      case '*':
        return 5;
      case '/':
        return 5;
      case '+':
        return 2;
      case '-':
        return 2;
    }
    return 0;
  }

  public static String infixToPostfix(String in) {
    Stack<Character> s = new Stack<Character>();
    StringBuilder post = new StringBuilder();
    // 1. traverse infix expr from left to right
    for (int i = 0; i < in.length(); i++) {
      char sym = in.charAt(i);
      // 2. if operand, append to postfix
      if (Character.isDigit(sym))
        post.append(sym);
      // 5. if opening (, push it on stack
      else if (sym == '(')
        s.push(sym);
      // 6. if closing ), then pop all ops from stack & append to postfix, until opening ( is found
      else if (sym == ')') {
        while (s.peek() != '(')
          post.append(s.pop());
        s.pop(); // also pop & discard (
      }
      // 3. if operator, push on stack. but if pri(topmost op) >= pri(cur op), then pop and append
      // to postfix expr
      else { // if operator
        while (!s.isEmpty() && pri(s.peek()) >= pri(sym))
          post.append(s.pop());
        s.push(sym);
      }
    }
    // 4. when all syms from infix are done, append all ops from stack and append to postfix
    while (!s.isEmpty())
      post.append(s.pop());
    return post.toString();
  }

  public static void main(String[] args) {
    String infix = "5+9-4*(8-6/2)+1$(7-3)";
    String postfix = "", prefix = "";
    System.out.println("Infix:   " + infix);
    postfix = infixToPostfix(infix);
    System.out.println("Postfix: " + postfix);
    int output = evaluatePostFix(postfix);
    System.out.println(output);
  }

  private static int evaluatePostFix(String postfix) {
    Stack<Integer> operants = new Stack();
    for (int i = 0; i < postfix.length(); i++) {
      char ch = postfix.charAt(i);
      if (Character.isDigit(ch)) {
        int x = Integer.parseInt(Character.toString(ch));
        operants.push(x);
      } else {
        int right = operants.pop();
        int left = operants.pop();
        int op = eval(left, right, ch);
        operants.push(op);
      }
    }

    return operants.pop();
  }

  private static int eval(int left, int right, char ch) {
    Integer val = 0;
    switch (ch) {
      case '+':
        val = left + right;
        break;
      case '-':
        val = left - right;
        break;
      case '*':
        val = left * right;
        break;
      case '/':
        val = left / right;
        break;
      case '$':
        int power = right;
        int num = left;
        val = (int) Math.pow(num, power);
        break;
    }
    return val;
  }

  private static int intVal(char c) {
    return Integer.parseInt(Character.toString(c));
  }
}
