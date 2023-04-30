import java.util.Scanner; 

public class Exer3 {

    public static void main(String[] args) {

        double valorA, valorB, valorC, delta;

        Scanner sc = new Scanner (System.in);

        System.out.println("Resolução de equação");

        System.out.println("Informe o valor de A: ");
        valorA = sc.nextDouble();

        System.out.println("Informe o valor de B: ");
        valorB = sc.nextDouble();

        System.out.println("Informe o valor de C: ");
        valorC = sc.nextDouble();

        delta = Math.pow (valorB, 2) - 4 * valorA * valorC;

        if (valorA == 0 && valorB == 0 && valorC != 0){
            System.out.println("Coeficientes informados incorretamente.");
        }else if (valorA == 0 && valorB != 0){
            System.out.println("Essa é uma equação de primeiro grau. ");
            double raiz1 = -valorC / valorB;
            System.out.printf("Raiz real da equação: %.2f", raiz1);
        }else if (delta < 0){
            System.out.println("Esta equação nao possui raízes reais. ");
        }else if (delta == 0){
            System.out.println("Esta equação possui duas raízes reais iguais. ");
            double raiz2 = -valorB / (2 * valorA);
            System.out.printf("Raízes da equação: %.2f e %.2f", raiz2, raiz2);
        }else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            double raiz3 = (-valorB + Math.sqrt(delta))/(2*valorA);
            double raiz4 = (-valorB - Math.sqrt(delta))/(2*valorA);
            System.out.printf("Raízes da equação: %.2f e %.2f\n", raiz3, raiz4);
        }

        sc.close();
    }
    
}
