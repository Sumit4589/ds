package com.sam.ds.tree;

public class BTree {

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


