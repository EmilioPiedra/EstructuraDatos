import java.util.Scanner;

public class matrices {

    Scanner leer ;
    int [][] matriz;
    public matrices(int fil , int col){
        this.leer = new Scanner(System.in);
        this.matriz = new int [fil][col];

    }

    public void leerMat (int [][]x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                x[i][j] = leer.nextInt();
            }
        }
    }

    public void presentarMatrices (int [][]x) {
        for (int i=0; i < x.length; i++) {
            System.out.print("|");
            for (int j=0; j < x[i].length; j++) {
                System.out.print (x[i][j]);
                if (j!=x[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    public int determinadnte (int [][]x) {
        int sp=0, sn=0, Ap, An, j, l;
        for (int k=0;k< x.length;k++){
                j=x.length -1 - k;
                l=x.length -1-k;
                Ap=1; An=1;
            for (int i=0;i<x.length;i++){
                Ap*=x[i][j];
                An*=x[i][l];

                    if(j==3)
                        j=0;
                    else
                        j++;
                    if (l==0)
                        l=3;
                    else
                        l--;
            }
            sp+=Ap;
            sn+=An;
        }
    return sp-sn;
    }
    public void mulMatrices (int [][] A, int [][]B, int [][] C) {
            int s =0;
        for (int i=0;i<A.length;i++){
            for (int l=0;l<B[0].length;l++){
                    s=0;
                for (int j=0;j<A[0].length;j++){
                    s+= A[i][j]*B[j][l];
                }
                C[i][l]=s;
            }
        }
    }

}
