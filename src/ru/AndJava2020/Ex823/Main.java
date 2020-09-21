package ru.AndJava2020.Ex823;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex8.2 picture == 2");
        System.out.println("Ex8.3 animation == 3");
        int a=new Scanner(System.in).nextInt();

        if(a==3) {
            ThreadAnimation animation = new ThreadAnimation(args);
            animation.run();
        }
        else{
            new Window(args[0]);
        }
    }
}
