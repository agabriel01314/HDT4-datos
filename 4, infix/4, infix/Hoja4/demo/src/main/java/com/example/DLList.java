package com.example;
public class DLList<T> implements UVGLList<T>{
    private class Node<T>{
        /*
        Single Linked List Node
        No utiliza key, solo guarda data, porque no voy a hacer
        search.
         */
        public T data;
        public Node<T> next = null;
        public Node<T> prev = null;
        public Node(T cData){
            data = cData;
        }
    }
    public Node <T> head = null;
    public Node<T> tail = null;
    public void removeFirst(){
        if (head != null){
            if (head == tail){
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }
    }
    public T getFirst(){
        if (head == null){
            return null;
        }
        return head.data;
    }
    public void addLast(T x){
        Node<T> newNode = new Node<T>(x);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public String toString(){
        String txt = "null<-Head:";
        Node<T> x = head;
        while (x!=null){
            txt += "[" + x.data + "]";
            if (x == tail){
                txt += ":Tail->";
            } else {
                txt += "=>";
            }
            x = x.next;
        }
        txt += "null";
        return txt;
    }
}

