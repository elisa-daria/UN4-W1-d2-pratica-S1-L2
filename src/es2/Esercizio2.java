package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digita un numero intero!");
        int selectedNumber= scanner.nextInt();
        switch (selectedNumber){
            case 0:
                System.out.println("ZERO");
                break;
                case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("ERROR");

        }

        scanner.close();
    }

}
