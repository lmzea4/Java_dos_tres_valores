import java.util.Scanner;

public class TresValores {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        int A, B, C;
        System.out.println("Ingrese un número para la variable A");
        A = numero.nextInt();
        System.out.println("Ingrese un número para la variable B");
        B = numero.nextInt();
        System.out.println("Ingrese un número para la variable C");
        C = numero.nextInt();

        if (A == B || A == C || B==C){
            System.out.println("los valores introducidos deben ser distintos");
        }
        else {
            if (A>B && A>C){
                System.out.println(A + " Es el mayor" );
            }
            else if ( B > A && B > C){
                System.out.println(B + " Es el mayor");
            } else {
                System.out.println(C + " Es el mayor");
            }
            if (A < B && A < C){
                System.out.println(A+ " Es el menor");
            }else if (B < A && B < C){
                System.out.println(B+ " Es el menor");
            }else {
                System.out.println(C+ " Es el menor");
            }


        }


    }
}
