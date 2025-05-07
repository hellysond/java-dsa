package io.github.hellysond;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> ea888 = new LinkedList<>("VW GOLF GTI");

        ea888.append("VW PASSAT");


        ea888.append("AUDI A3");


        ea888.prepend("VW JETTA");


        ea888.removeLast();

        ea888.printList();



    }
}