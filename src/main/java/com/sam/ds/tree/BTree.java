package com.sam.ds.tree;

import java.util.*;

public class BTree {

  public Map<Integer, List<Integer>> toList() {
    if(root == null ){
      return null;
    }
    Map<Integer, List<Integer>> masterList = new HashMap();
    Map<Node, Integer> nodeLevelMap = new HashMap<>();
    Queue<Node> queue1 = new LinkedList();
    queue1.add(root);
    nodeLevelMap.put(root, 0);
    while(!queue1.isEmpty()){
      Node temp = queue1.poll();
      int level = nodeLevelMap.get(temp);
      List<Integer> levelList = masterList.get(level);
      if(levelList == null){
        levelList = new LinkedList<>();
      }
      levelList.add(temp.data);
      masterList.put(level, levelList);
      if(temp.left != null){
        queue1.add(temp.left);
        nodeLevelMap.put(temp.left, level+1);
      }
      if(temp.right != null){
        queue1.add(temp.right);
        nodeLevelMap.put(temp.right, level+1);
      }
    }

    return masterList;
  }

  private class Node {
    private Integer data;
    private Node left;
    private Node right;

    public Node(Integer data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }


  private Node root;

  public void add(Integer data) {
    Node node = new Node(data, null, null);
    if (root == null) {
      root = node;
      return;
    }
    addHelper(root, node);
  }

  private void addHelper(Node node, Node newNode) {
    if (node.data >= newNode.data) {
      if (node.left == null) {
        node.left = newNode;
      } else {
        addHelper(node.left, newNode);
      }
    } else {
      if (node.right == null) {
        node.right = newNode;
      } else {
        addHelper(node.right, newNode);
      }
    }

  }

  public void traverse() {
    inorder(root);
    System.out.println();
    preOrder(root);
    System.out.println();
    postOrder(root);
  }

  private void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }
  }

  private void preOrder(Node root) {
    if (root == null)
      return;
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  private void postOrder(Node root) {
    if (root == null)
      return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }
}


