import java.util.ArrayList;
import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salario = new ArrayList<>();

        System.out.println("Quantos vendedores? ");
            int vendedores = scanner.nextInt();

        double sal = 0;
        for(int i = 0;i < vendedores;i++){
            System.out.println("Qual o salario? ");
                sal = scanner.nextDouble();
                double n = 200+0.09*sal;
                salario.add(n);
        }
        scanner.close();

        int um = 0;
        for (Double a : salario) {
            if(a >= 200 && a <= 299)
            um++;
        }
        int dois = 0;
        for (Double b : salario) {
            if(b >= 300 && b <= 399)
            dois++;
        }
        int tres = 0;
        for (Double a : salario) {
            if(a >= 400 && a <= 499)
            tres++;
        }
        int quatro = 0;
        for (Double a : salario) {
            if(a >= 500 && a <= 599)
            quatro++;
        }
        int cinco = 0;
        for (Double a : salario) {
            if(a >= 600 && a <= 699)
            cinco++;
        }
        int seis = 0;
        for (Double a : salario) {
            if(a >= 700 && a <= 799)
            seis++;
        }
        int sete = 0;
        for (Double double1 : salario) {
            if(double1 >= 800 && double1 <= 899)
            sete++;
        }
        int oito = 0;
        for (Double double1 : salario) {
            if(double1 >= 900 && double1 <= 999)
            oito++;
        }
        int nove = 0;
        for (Double double1 : salario) {
            if(double1 >= 1000)
            nove++;
        }

        System.out.println("$200 - 299: " + um);
        System.out.println("$300 - 399: " + dois);
        System.out.println("$400 - 499: " + tres);
        System.out.println("$500 - 599: " + quatro);
        System.out.println("$600 - 699: " + cinco);
        System.out.println("$700 - 799: " + seis);
        System.out.println("$800 - 899: " + sete);
        System.out.println("$900 - 999: " + oito);
        System.out.println("$1000 pra mais: " + nove);
    }
}
