import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, valordaCompra, valorPago, troco;

        System.out.println("Máquina de Venda Automática");

        System.out.println("Informe o valor da compra:");
        valorPago = sc.nextInt();

        System.out.println("Informe o valor de pagamento:");
        valordaCompra = sc.nextInt();

        if (valordaCompra < valorPago) {
            System.out.println("A quantia de pagamento é insuficiente para realizar o pagamento.");
            troco = 0;

        } else {
            troco = (valordaCompra - valorPago);
            System.out.println("O troco é: " + troco);
            nota50 = (troco / 50);
            troco = troco % 50;
            nota20 = (troco / 20);
            troco = troco % 20;
            nota10 = (troco / 10);
            troco = troco % 10;
            nota5 = (troco / 5);
            troco = troco % 5;
            nota2 = (troco / 2);
            troco = troco % 2;
            nota1 = (troco / 1);

            System.out.println("Quantidade de notas necessárias:");
            System.out.println("R$ 50,00: " + nota50);
            System.out.println("R$ 20,00: " + nota20);
            System.out.println("R$ 10,00: " + nota10);
            System.out.println("R$ 5,00: " + nota5);
            System.out.println("R$ 2,00: " + nota2);
            System.out.println("R$ 1,00: " + nota1);
        }

        sc.close();
    }
}
