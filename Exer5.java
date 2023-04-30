import java.util.Scanner; 

public class Exer5 {
    
    public static void main(String[] args) {

        double numero1, numero2, soma, subtracao, multiplicacao, divisao,potencia;
        String operacao;

        Scanner sc = new Scanner (System.in);

System.out.println("Operações. ");

System.out.println("Digite o primeiro número: ");
numero1 = sc.nextDouble();

System.out.println("Digite o segundo número: ");
numero2 = sc.nextDouble();

System.out.println("Para soma, digite '+': ");
System.out.println("Para subitração, digite '-': "); 
System.out.println("Para multiplicação, digite '*': "); 
System.out.println("Para divisão, digite '/': ");
System.out.println("Para potenciação, digite '^': ");
operacao = sc.next();

soma = numero1 + numero2;
subtracao = numero1 - numero2;
multiplicacao = numero1 * numero2;
divisao = numero1 / numero2;
potencia=Math.pow(numero1, numero2);

switch(operacao){
case "+":
   System.out.println("A soma é: " + soma);  
break;

case "-":
   System.out.println("A subitração é: " + subtracao);  
break;

case "*":
   System.out.println("A multiplicação é: " + multiplicacao);  
break;

case "/":
   System.out.println("A divisão é: " + divisao);  
break;

case "^":
   System.out.println("A potenciação é: " + potencia);  
break;

default:
System.out.println("O símbolo da operação é inválido.");
break;
}

sc.close();

    }
}
