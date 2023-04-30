
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int indicador, raio;
        Double perimetro, areaDoCirculo, volumeDaEsfera;
        String titulo = "Calculadora de Perímetro, Área, e Volume";

        System.out.println(titulo);

        System.out.println("Digite o indicador da operação: ");
        indicador = sc.nextInt();

        System.out.println("Digite o raio: ");
        raio = sc.nextInt();

        switch (indicador) {
            case 1:
                indicador = 1;
                perimetro = (2 * Math.PI * raio);
                System.out.printf("O perímetro do circulo é: %.2f", perimetro);
                break;
            case 2:
                indicador = 2;
                areaDoCirculo = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f", areaDoCirculo);
                break;
            case 3:
                indicador = 3;
                volumeDaEsfera = (4 / 3 * Math.PI * Math.pow(raio, 3));
                System.out.printf("O volume da esfera é: %.2f", volumeDaEsfera);
                break;
            default:
                sc.close();
        }
    }
}