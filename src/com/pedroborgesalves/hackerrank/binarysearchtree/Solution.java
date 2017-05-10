package com.pedroborgesalves.hackerrank.binarysearchtree;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 * @author pedroborgesalves
 */
public class Solution {

    private static class Node {

        int data;
        Node left;
        Node right;

        Node() {

        }
    }

    static boolean checkBST(Node node) {
        return checkBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    static boolean checkBST(Node node, int min, int max){
        if(node == null) return true;
        
        return min < node.data && max > node.data &&
                checkBST(node.left, min, node.data) &&
                checkBST(node.right, node.data, max);
    }

    static Node createTree() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();

        node1.data = 4;
        node2.data = 2;
        node3.data = 6;
        node4.data = 1;
        node5.data = 3;
        node6.data = 5;
        node7.data = 7;

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        return node1;
    }

    public static void main(String args[]) {

        System.out.println(checkBST(createTree()));

    }

}
