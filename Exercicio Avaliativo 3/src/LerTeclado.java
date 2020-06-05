

import java.io.*;


public class LerTeclado {


    public static void main(String[] args) {
            Palindromo list = new Palindromo();
        int c = 0;
        System.out.println("==============================================================================================");
        System.out.println("Digite os caracteres e pressione enter, após isso, digite 0 para ver se é um palindromo ou não");
        System.out.println("==============================================================================================");
        do {
            try {
                System.out.print("hit a key: ");

                c = System.in.read();
                System.out.println("Tecla pressionada: " + c);
                System.out.println("Tecla pressionada: " + (char)c);
                c = Character.toUpperCase(c);
                if(c!= 48 && c>=65 && c<=90){
                    list.addList((char)c);
                }
            }
            catch(IOException e) {
                System.out.println("Exceção: " + e);
            }
        }while(c != 48);	// Tecla 0
        System.out.println("printando array:");
        list.mostrar();
        if(list.ePalindromo() == true){
            System.out.println("\nÉ palindromo? Sim!");
        }
        else{
            System.out.println("É palindromo? Não!");
        }


    }


}
