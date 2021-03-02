package ru.levshakov;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String str = "string";
        ArrayList<String> strings = new ArrayList<String>();
        while (str!="") {
            Scanner input = new Scanner(System.in);
            str = input.nextLine();
            strings.add(str);
        }
        for(String string: strings) {
            System.out.println(string);
        }

    }
}
