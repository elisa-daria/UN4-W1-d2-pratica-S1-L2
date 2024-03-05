package es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digita un numero intero");
        int selectedNumber= scanner.nextInt();
        for(int i=selectedNumber;i>=0;i--){
            System.out.println(i);
        }
        scanner.close();
    }
}
