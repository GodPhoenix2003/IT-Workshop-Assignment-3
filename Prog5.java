/*

Question:-

Implementation of this keyword to pass as an argument in the method.

*/

public class Prog5 {
    public void hola(Prog5 obj){
        System.out.println("\nHola\n");
    }
    public void holaa(){
        hola(this);
    }
    public static void main(String []args){
        Prog5 obj = new Prog5();
        obj.holaa();
    }
}

/*

Output:-

Hola

*/