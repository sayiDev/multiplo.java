import java.util.Scanner;

public class multiplo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numeroP, numeroS;

        System.out.println("ingrese un numero");
        numeroP=sc.nextInt();

        System.out.println("ingrese un numero");
        numeroS=sc.nextInt();
        if (numeroP%numeroS==0) {
            System.out.println(numeroP + " es multiplo de " + numeroS);

        }

        else if (numeroS%numeroP==0) {
            System.out.println(numeroS + " es multiplo de " + numeroP);

        }

        else {
            System.out.println("no hay multiplo entre los dos numeros");
        }

    }
}