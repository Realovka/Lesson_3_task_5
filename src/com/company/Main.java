package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> array= new ArrayList<>();
        int i;

        for ( i=1; i<=n; i++){
            if (i%2!=0 & i%3!=0 & i%5!=0 ){
                array.add(i);
            }
        }
        System.out.println(array.size());

    }
}
