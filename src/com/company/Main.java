package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listA = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                listA.add(scanner.next());
            }
            System.out.println(listA);
            ArrayList<String> listB = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                listB.add(scanner.next());
            }
            System.out.println(listB);
            ArrayList<String> listC = new ArrayList<>();
            for (int q = 0; q < listB.size(); q++) {
                listC.add( listA.get(q) );
                listC.add( listB.get(q) );
            }
            System.out.println(listC);
            for (int i = 0; i < 10; i++) {
                for (int m = 0; m < listC.size(); m++) {
                    try {
                        if (listC.get(m).length() > listC.get(m + 1).length()) {
                            String nextValue = listC.get(m + 1);
                            String previousValue = listC.get(m);
                            listC.set(m, nextValue);
                            listC.set(m+1,previousValue);
                        }
                    } catch (IndexOutOfBoundsException e) {}
                }
            }
            System.out.println(listC);
        }
    }
}