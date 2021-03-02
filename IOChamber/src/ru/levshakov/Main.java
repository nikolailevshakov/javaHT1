package ru.levshakov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        if (args.length == 0) {
           input.getInputPrintOutput();
        } else {
            try (FileReader reader = new FileReader(args[0])){
                BufferedReader in = new BufferedReader(reader);
                String str;

                List<String> list = new ArrayList<String>();
                while((str = in.readLine()) != null){
                    list.add(str);
                }
                for(int i=0; i<list.size(); i+=2) {
                    System.out.println(list.get(i));
                }
            }
            catch(IOException ex) {
                input.getInputPrintOutput();
            }
        }

    }
}

