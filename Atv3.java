import java.util.ArrayList;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int num1 = 0;

        System.out.println("Escreva uma nota qualquer, quando quiser continuar escreva (-1).  \nResposta: ");
        while (true) {
            num1 = scanner.nextInt();
            if (num1 == -1) {
                break;
            }
            num.add(num1);
        }
        scanner.close();
        System.out.println("Quantidade de valores recebidos: " + num.size());
        System.out.println("Valores informados: ");
            for (int n : num) {
                System.out.print(n + "," + "");
            }
            System.out.println();

        System.out.println("Valores informados inversos: ");
            for(int i = num.size() -1; i >= 0; i--){
                System.out.print(num.get(i) + ",");
            }
        
        int soma = 0;
        for (Integer n : num) {
            soma += n;
        }
        System.out.println();
        System.out.println("A soma dos valores é: " + soma);

        int media = soma/num.size();
        System.out.println("A media dos valores é: " + media);

        int acima = 0;
      for (Integer n : num) {
        if(n > media)
            acima++;
      }
        System.out.println("Valores acima da media: " + acima);

        int abaixo = 0;
      for (Integer n : num) {
        if(n < 7)
            abaixo++;
      }
        System.out.println("Valores abaixo de 7: " + abaixo);  

      System.out.println("Obrigado por testar meu programa. ");

    }
}
