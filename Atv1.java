import java.util.ArrayList;
import java.util.Scanner;

public class Atv1 {
    public static String mesExtenso(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1]; 
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Double> temps = new ArrayList<Double>();


        for(int i = 0;i<12; i++){
            System.out.println("Digite a temperatura do " + (i + 1) + " mes: ");
            double temp = scanner.nextDouble();
            temps.add(temp);
        }
    scanner.close();
        double soma = 0;
    for ( double temp : temps) {
        soma += temp;
    }
    double mediaA = soma / temps.size();
    System.out.println("Média anual de temperatura: " + mediaA + "°C");

    System.out.println("Temperaturas acima da media: ");
        for(int i = 0;i<temps.size();i++){
            if(temps.get(i)>mediaA){
                System.out.println(mesExtenso(i + 1) + " - " + temps.get(i) + "°C");
            }
        }   
    }
    
}