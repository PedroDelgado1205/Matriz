import java.util.Scanner;

public class Matriz {

    private int f1=0;
    private int c1=0;
    private int f2=0;
    private int c2=0;

    public void generarMatriz(){
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE LAS PROPIEDADES PARA LA 1 MATRIZ");
        System.out.println("Cuantas filas desea:");
        this.f1=input.nextInt();
        System.out.println("Cuantas columnas desea:");
        this.c1=input.nextInt();
        System.out.println("INGRESE LAS PROPIEDADES PARA LA 2 MATRIZ");
        System.out.println("Cuantas filas desea:");
        this.f2=input.nextInt();
        System.out.println("Cuantas columnas desea:");
        this.c2=input.nextInt();
        int [][]A = new int[this.f1][this.c1];
        int [][]B = new int[this.f2][this.c2];
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                System.out.println("Ingrese un valor en "+i+"; "+j+" de la primera matriz:");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("-------------------------------------");
        for (int i=0; i<B.length; i++){
            for (int j=0; j<B[i].length; j++){
                System.out.println("Ingrese un valor en "+i+"; "+j+" de la segunda matriz:");
                B[i][j]=input.nextInt();
            }
        }
        mostrarMatriz(A, B);
        sumaMatrices(A, B, f1, f2, c1, c2);
        restaMatrices(A, B, f1, f2, c1, c2);
        productoMatrices(A, B, f1, f2, c1, c2);
    }

    public static void mostrarMatriz(int [][]A, int [][]B){
        System.out.print("\n");
        System.out.println("MATRIZ 1:");
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("MATRIZ 2:");
        System.out.print("\n");
        for (int i=0; i<B.length; i++){
            for (int j=0; j<B[i].length; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void sumaMatrices(int [][]A, int [][]B, int F1, int C1, int F2, int C2){
        int [][]C = new int[A.length][B[0].length];
        if ((F1==F2)&&(C1==C2)){
            System.out.print("\n");
            System.out.println("La suma es:");
            for (int i=0; i<C.length; i++){
                for (int j=0; j<C[i].length; j++){
                    C[i][j] = A[i][j]+B[i][j];
                    System.out.print(C[i][j]+" ");
                }
                System.out.print("\n");
            }
        }else {
            System.out.print("\n");
            System.out.println("No se puede sumar");
        }


    }

    public static void restaMatrices(int [][]A, int [][]B, int F1, int C1, int F2, int C2){
        int [][]C = new int[A.length][B[0].length];
        if ((F1==F2)&&(C1==C2)) {
            System.out.print("\n");
            System.out.println("La resta es:");
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C[i][j] + " ");
                }
                System.out.print("\n");
            }
        }else {
            System.out.print("\n");
            System.out.println("No se puede restar");
        }
    }

    public static void productoMatrices(int [][]A, int [][]B, int F1, int C1, int F2, int C2){
        int [][]C = new int[A.length][B[0].length];
        if ((F1==C2)||(F2==C1)) {
            System.out.print("\n");
            System.out.println("El producto es:");
            for (int i= 0; i<A.length; i++){
                for (int j=0; j<B[0].length; j++){
                    for (int k=0; k<B.length; k++){
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.print("\n");
            }
        }else {
            System.out.println("No se puede multiplicar");
        }
    }
}
