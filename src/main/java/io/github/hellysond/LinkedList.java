package io.github.hellysond;

import java.security.PublicKey;

/***
 * This is a lightweight implementation of a LinkedList.
 * @param <T>
 */
public class LinkedList<T> {

    private Node<T> startNode;
    private Node<T> endNode;
    private int size;

    static class Node<T>{
        Node<T> nextNode;
        T value;

        Node(T value){
            this.value = value;
        }
    }

    public LinkedList(T value){
        Node<T> node = new Node<>(value);
        this.startNode = node;
        this.endNode = node;
        size = 1;
    }

    public void prepend(T value){
        Node<T> node = new Node<>(value);
        node.nextNode = startNode;
        startNode = node;
        size+=1;

    }

    public void append(T value){
        Node<T> node = new Node<>(value);

        if(size==0){
            startNode = node;
            endNode = node;
        }else {
            endNode.nextNode = node;
            endNode = node;
        }

        size++;
    }

    public void printList(){
        Node<T> temp = startNode;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }

    public void removeLast(){



    }


}
