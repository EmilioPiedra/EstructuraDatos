public class runMAt {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        int[][] b = new int[3][3];
        int[][] c = new int[4][3];
        matrices objeto = new matrices(4 , 4);
        menu obj = new menu();
            int op;
        do {
            op = obj.menusss();
            switch (op) {
                case 1:
                    System.out.println("Matriz A");
                  objeto.leerMat(a);
                    System.out.println("Matriz B");
                    objeto.leerMat(b);

                    break;
                case 2:
                    objeto.presentarMatrices(a);
                    System.out.println("----------------------------");
                    objeto.presentarMatrices(b);
                    System.out.println("----------------------------");
                    objeto.presentarMatrices(c);
                    System.out.println("----------------------------");
                    break;
                case 3:
                    //faltametodoTrasponer
                    break;
                case 4:
                    objeto.mulMatrices(a,b,c);
                    break;
                case 5:
                    System.out.println("Matriz A");
                    objeto.leerMat(a);
                    objeto.presentarMatrices(a);
                    System.out.println("----------------------------");
                    objeto.determinadnte(a);
                    break;
            }
        }while (op!=5);
    }
}
