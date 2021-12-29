package com.company;

import org.w3c.dom.Node;

public class LinkedListStack<T> {

    private final LinkedList<T> linkedList = new LinkedList<>(); //2

    private int elemsCount = 0;//2


    public int getElemsCount() { //0
        Global.Nop++;
        return elemsCount;//2
    }//=2

    public void push(T data) {//1
        linkedList.addFirst(data);//2
        elemsCount++;//1
        Global.Nop++;
    }//=4

    public T pop() {//0
        elemsCount--;//1
        Global.Nop++;
        Global.Nop++;
        return linkedList.removeFirst();//2

    }//=3

    public boolean isEmpty() {//0
        Global.Nop++;
        return linkedList.isEmpty();//2
    }//=2

    @Override
    public String toString() {//0
        Global.Nop++;
        return linkedList.toString();//2
    }//=2

    public T see(){//0
        Global.Nop++;
        return linkedList.showFirst();//2
    }//=2

    public LinkedListStack<Integer> sort(LinkedListStack<Integer> stack) {//1
        Global.Nop++;
        LinkedListStack<Integer> bufferStack = new LinkedListStack<>();//2
        Global.Nop++;
        LinkedListStack<Integer> stack2 = new LinkedListStack<>();//2
        Global.Nop++;
        int t=stack.getElemsCount();//4
        Global.Nop++;
        Global.Nop++;
        for (int j=0; j<stack.getElemsCount()+t-1; j++){

            if (stack2.isEmpty()){stack2.push(stack.pop());}
            Global.Nop++;
            int n= stack.getElemsCount();
            Global.Nop++;
            Global.Nop++;
            for (int i=0; i<n; i++){
                Global.Nop++;
                if (stack2.see()<stack.see()){
                    stack2.push((stack.pop()));
                }
                else {
                    Global.Nop++;
                    int buffer=stack2.pop();
                    stack2.push((stack.pop()));
                    stack2.push(buffer);
                }


            }
            bufferStack.push(stack2.pop());
            Global.Nop++;
            stack=stack2;
            Global.Nop++;
            stack2=new LinkedListStack<>();
        }
        Global.Nop++;
        stack=new LinkedListStack<>();
        Global.Nop++;
        int k= bufferStack.getElemsCount();
        Global.Nop++;
        Global.Nop++;
        for (int o=0; o<k; o++){
            stack.push(bufferStack.pop());
        }
        Global.Nop++;
        return stack;
    }
}

class LinkedList<T> {

    //элемент списка
    private static class Node<T> {

        // значени е элемента стека
        private T data;
        // указатель на следующий элемент
        private Node<T> next;

        public Node(T data) {

            Global.Nop++;
            this.data = data;
        }

        @Override
        public String toString() {
            Global.Nop++;
            return data.toString();
        }

    }

    private Node<T> first = null;

    public void addFirst(T data) {
        Global.Nop++;
        Node<T> newFirst = new Node<T>(data);
        Global.Nop++;
        newFirst.next = first;
        Global.Nop++;
        first = newFirst;
    }
    public T showFirst(){
        Global.Nop++;
        return first.data;
    }

    public T removeFirst() {
        Global.Nop++;
        Node<T> oldFirst = first;
        Global.Nop++;
        first = first.next;
        Global.Nop++;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        Global.Nop++;
        StringBuilder listBuilder = new StringBuilder();
        Global.Nop++;
        Node currentNode = first;
        Global.Nop++;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            Global.Nop++;
            currentNode = currentNode.next;
        }
        Global.Nop++;
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        Global.Nop++;
        return first == null;
    }

}
