package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        LinkedListStack<Integer> stack = new LinkedListStack<>();
        Random r = new Random();
        for (int i=0; i<30; i++){
            stack.push(r.nextInt(1000));
        }
        System.out.println(stack);
        long start = System.currentTimeMillis();
        System.out.println(stack.sort(stack).toString());
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
        System.out.println(Global.Nop);

}}
