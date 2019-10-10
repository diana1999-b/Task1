package com.company;

public class Main {

    public static void main(String[] args){
        // write your code here
    double t=10;//1-ый день task 1
        double sum=0;
        for (int i=1;i<=7;i++) {
            t = (t + (t * 0.1));
            sum = sum + t;
        }
        //104.358881
        System.out.println("Суммарный путь за 7 дней : " + sum + "км");
        }
}