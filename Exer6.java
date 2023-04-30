import java.util.Scanner;
import java.util.Random;

public class Exer6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random gerador = new Random();

    int maior, menor, numeroUm, numeroDois;

    System.out.println("Sorteio de um Número Aleatório");

    System.out.println("Informe o primeiro número:");
    numeroUm = sc.nextInt();

    System.out.println("Informe o segundo número:");
    numeroDois = sc.nextInt();

    if (numeroUm < numeroDois) {
      menor = numeroUm;
      maior = numeroDois;
    } else {
      menor = numeroDois;
      maior = numeroUm;
    }

    int numeroAleatorio = gerador.nextInt(maior - menor) + menor;

    System.out.println("Número aleatório: " + numeroAleatorio);

    if (numeroAleatorio % 2 == 0) {
      System.out.println("O número é par!");
    } else {
      System.out.println("O número é ímpar!");
    }

    sc.close();
  }
}