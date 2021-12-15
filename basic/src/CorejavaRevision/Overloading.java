package CorejavaRevision;

public class Overloading {
	private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
    private  void display(String s){
        System.out.println("Arguments: " +s);
    }
   private static float display( float a,float b){
        return (a+b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        Overloading o=new Overloading();
        o.display("prasanna");
       
    }
}
