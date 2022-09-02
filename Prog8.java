/*

Question:-

Prove that this keyword refers to the current class instance variable.

*/

public class Prog8 {
    public void display(){
        System.out.println("\nthis = " + this + "\n");
    }
    public static void main(String []args){
        Prog8 obj = new Prog8();
        System.out.println("\nobj = " + obj + "\n");
        obj.display();
    }
}

/*

Output:-

obj = Prog8@41629346


this = Prog8@41629346

*/