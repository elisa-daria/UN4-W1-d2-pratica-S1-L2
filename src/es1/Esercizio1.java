package es1;


public class Esercizio1 {
    public static void main(String[] args) {
evenOrOddsString("ciaone");
 System.out.println("la stringa è pari? "+ evenOrOddsString("ciaone")) ;
        evenOrOddsString("boh");
         System.out.println("la stringa è pari? "+ evenOrOddsString("boh")) ;

         annoBisestile(2020);
        System.out.println("è bisestile? "+annoBisestile(2020));
        System.out.println("è bisestile? "+annoBisestile(2021));
    }
//    public static void evenOrOddsString(String str){
//        if(str.length() % 2==0) System.out.println("la stringa ha un numero di caratteri pari");
//        else System.out.println("il numero di caratteri è dispari");
//    }    -----> forse non è così la consegna...

     public static boolean evenOrOddsString(String str) {
        return str.length() % 2 == 0;

     }
     public static boolean annoBisestile(int year){
                  if(year%4==0|| year%100==0 && year%400==0){return true;}
                  else{ return false;}
     }
    }
