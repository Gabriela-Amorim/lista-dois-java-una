import java.util.Scanner;

public class Exer1{

    public static void main(String[] args) {
        
        int numero1, numero2, numero3, mediaAritmetica, maior=0, menor=0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Comparação de números");

        System.out.println("Informe o primeiro número");
        numero1 = sc.nextInt();

        System.out.println("Informe o segundo número");
        numero2 = sc.nextInt();

        System.out.println("Informe o terceiro número");
        numero3 = sc.nextInt();


        if ((numero1 > numero2) && (numero1 > numero3)){
            maior = numero1;

        }else if ((numero2 > numero1) && (numero2 > numero3)){
            maior = numero2;

        }else{
            maior = numero3;
        }
        
        if ((numero1 < numero2) && (numero1 < numero3)){
            menor = numero1;

        }else if ((numero2 < numero1) && (numero2 < numero3)){
            menor = numero2;

        }else{
            menor = numero3;
        }
        
        mediaAritmetica = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("O maior número é: " + maior);

        System.out.println("O menor número é: " + menor);

        System.out.println("A médiaAritmetica é: " + mediaAritmetica);

        sc.close ();

    }
}