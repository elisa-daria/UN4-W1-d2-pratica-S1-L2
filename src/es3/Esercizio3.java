package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digita una stringa");
        String selectedString=scanner.nextLine();
while (!(selectedString.equals(":q"))){
    for(int i=0;i<selectedString.length();i++){
        System.out.println(selectedString.charAt(i)+",");
    }
    System.out.println("Digita :q per chiudere");
    selectedString=scanner.nextLine();
    scanner.close();

}


    }
}
