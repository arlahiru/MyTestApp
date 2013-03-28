/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.jtable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lahiru Ruhunage
 */
public class MyLinkedListStack {

    private Node head;

    class Node {

        private Node next;
        private int data;

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public MyLinkedListStack() {

        head = null;
    }

    public void push(int data) {

        Node newNode = new Node();

        newNode.data = data;

        newNode.next = head;

        head = newNode;

    }

    public Node pop() throws Exception {

        //when stack is empty
        if (head == null) {

            throw new Exception("Stack is empty");

        }

        Node popNode = head;

        head = head.next;

        return popNode;

    }

    public void print() {

        Node current = head;

        while (current != null) {

            System.out.println(current.data);

            current = current.next;
        }
    }   
}
