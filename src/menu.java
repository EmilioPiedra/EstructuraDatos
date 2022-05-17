import java.util.Scanner;

public class menu {
    Scanner leer = new Scanner(System.in);
    public int menusss (){
            int n;
        System.out.println("Leer Matriz          [1]");
        System.out.println("Presentar Matriz     [2]");
        System.out.println("Trasnponer Matriz     [3]");
        System.out.println("Multiplicar Matriz     [4]");
        System.out.println("Salir                   [5]");
            n= leer.nextInt();
    return n;
    }
}
