package com.sam.ds.tree;

public class BTreeTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BTree tree = new BTree();
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(5);
    tree.add(6);
    tree.add(4);
    tree.traverse();
  }

}
