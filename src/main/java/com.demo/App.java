package com.demo;

class App{

    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        App app = new App();
        System.out.println("Hello World");

        System.out.println("Addition result is: " + app.add(5, 10));
    }
}