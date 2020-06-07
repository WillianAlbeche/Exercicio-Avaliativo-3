<<<<<<< HEAD:src/Palindromo.java
import java.util.Arrays;
import java.util.LinkedList;

public class Palindromo {
    private  LinkedList<Character> list = new java.util.LinkedList<>();

    public Palindromo(){

    }
    public void addList(char c){
        c= Character.toUpperCase(c);
        list.add(c);
    }

    public void mostrar(){
        System.out.println(Arrays.toString(list.toArray()));
        int j= list.size()-1;
        System.out.println("reverse:");
        System.out.print("[");
        for (int i = 0; i <list.size() ; i++) {
            if(i== 0){
                System.out.print(list.get(j)+",");
            }
            else if(i>0 && i <list.size()-1){
                System.out.print(" "+list.get(j)+",");
            }
            else{
                System.out.print(" "+list.get(j));
            }
            j--;
        }
        System.out.println("]");
    }

    public boolean ePalindromo(){
        int j=list.size()-1;
        boolean confere=false;
        for (int i = 0; i <list.size()/2 ; i++) {
            if(list.get(j) == list.get(i)){
                confere = true;

            }
            else{
                confere = false;
                 return confere;
            }
            j--;
        }
        if(confere == true){
            return true;
        }
        return false;
    }

}


=======
import java.util.Arrays;
import java.util.LinkedList;

public class Palindromo {
    private  LinkedList<Character> list = new java.util.LinkedList<>();

    public Palindromo(){

    }
    public void addList(char c){
        c= Character.toUpperCase(c);
        list.add(c);
    }

    public void mostrar(){
        System.out.println(Arrays.toString(list.toArray()));
        int j= list.size()-1;
        System.out.println("reverse:");
        System.out.print("[");
        for (int i = 0; i <list.size() ; i++) {
            if(i== 0){
                System.out.print(list.get(j)+",");
            }
            else if(i>0 && i <list.size()-1){
                System.out.print(" "+list.get(j)+",");
            }
            else{
                System.out.print(" "+list.get(j));
            }
            j--;
        }
        System.out.println("]");
    }

    public boolean ePalindromo(){
        int j=list.size()-1;
        boolean confere=false;
        for (int i = 0; i <list.size()/2 ; i++) {
            if(list.get(j) == list.get(i)){
                confere = true;
                j--;
            }

        }
        if(confere == true){
            return true;
        }
        return false;
    }

}


>>>>>>> 5cb5b68bffbd63febdb41d6b0498a413a0acbb18:Exercicio Avaliativo 3/src/Palindromo.java
