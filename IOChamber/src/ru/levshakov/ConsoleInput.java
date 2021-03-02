package ru.levshakov;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput {
    ArrayList<String> strings = new ArrayList<String>();
    void getInput() {
        System.out.println("Файл не распознан. Введите ваши сообщения");
        String str = "string";

        while (str!="") {
            Scanner input = new Scanner(System.in);
            str = input.nextLine();
            strings.add(str);
        }
    }
    void printOutput() {
        for(int i=0; i<this.strings.size(); i+=2) {
            System.out.println(this.strings.get(i));
        }
    }
    void getInputPrintOutput() {
        this.getInput();
        this.printOutput();
    }
}
