package ru.levshakov;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	for (int i=1; i<=10; ++i) {
	    String line = "";
	    for (int k=1; k<=10; ++k) {
	        String number = Integer.toString(i*k);
	        if (number.length()==2)
                line += number + " ";
	        else
                line += number + "  ";
        }
        System.out.println(line);
    }
    }
}
