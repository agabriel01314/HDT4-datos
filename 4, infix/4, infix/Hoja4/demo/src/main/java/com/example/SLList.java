package com.example;

public class SLList<T> implements UVGLList<T>{

    private class Node<T>{
        /*
        Single Linked List Node
        No utiliza key, solo guarda data, porque no voy a hacer
        search.
         */
        public T data;
        public Node<T> next = null;
        public Node(T cData){
            data = cData;
        }
    }

    private Node<T> head = null;
    public boolean isEmpty(){
        return (head == null);
    }

    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public void removeFirst(){
        if (head!= null){
            head = head.next;
        }
    }

    public void addLast(T x){
        Node <T> newNode = new Node<T>(x);
        if (head == null){
            head = newNode;
        } else {
            Node <T> curr = head;
            while (curr.next!= null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public String toString(){
        String txt = "Head:";
        Node<T> x = head;
        while (x!=null){
            txt += "[" + x.data + "]->";
            x = x.next;
        }
        txt += "null";
        return txt;
    }
}
