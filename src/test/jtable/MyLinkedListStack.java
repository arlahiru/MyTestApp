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

    public static void main(String[] args) {
        try {
            MyLinkedListStack myStack = new MyLinkedListStack();

            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
            myStack.push(40);
            myStack.push(50);

            System.out.println("print stack");
            myStack.print();

            System.out.println("pop:" + myStack.pop());


            System.out.println("print stack");
            myStack.print();

            System.out.println("pop:" + myStack.pop());

            System.out.println("print stack");
            myStack.print();

            System.out.println("pop:" + myStack.pop());

            System.out.println("pop:" + myStack.pop());

            System.out.println("pop:" + myStack.pop());

            myStack.push(60);

            System.out.println("pop:" + myStack.pop());

            System.out.println("pop:" + myStack.pop());

        } catch (Exception ex) {
            Logger.getLogger(MyLinkedListStack.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
}
