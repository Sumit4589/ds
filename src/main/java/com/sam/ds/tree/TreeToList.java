package com.sam.ds.tree;

import java.util.List;
import java.util.Map;

public class TreeToList {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.add(5);
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(7);
        Map<Integer, List<Integer>> levelWiseMap =  tree.toList();
        for(List<Integer> child : levelWiseMap.values()){
            child.stream().forEach(ele -> System.out.print(ele+ " "));
            System.out.println("");
            System.out.println("====");
        }
    }
}
