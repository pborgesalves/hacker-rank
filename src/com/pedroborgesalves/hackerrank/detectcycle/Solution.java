package com.pedroborgesalves.hackerrank.detectcycle;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-linked-list-cycle
 *
 * @author pedroborgesalves
 */
public class Solution {

    class Node {

        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        List<Node> nodes = new LinkedList();
        while (head != null) {
            if (nodes.contains(head)) {
                return true;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
