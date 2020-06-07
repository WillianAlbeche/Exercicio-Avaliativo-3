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


