import java.util.ArrayList;
import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> resp = new ArrayList<>();
        

    System.out.println("Telefonou para a vítima? \n(1)Sim ou (2)Não \nResposta: " ); 
        resp.add(scanner.nextInt());
    System.out.println("Esteve no local do crime? \n(1)Sim ou (2)Não \nResposta: ");
        resp.add(scanner.nextInt());
    System.out.println("Mora perto da vítima? \n(1)Sim ou (2)Não \nResposta: ");
        resp.add(scanner.nextInt());
    System.out.println("Devia para a vítima? \n(1)Sim ou (2)Não \nResposta: ");
        resp.add(scanner.nextInt());
    System.out.println("Já trabalhou com a vítima? \n(1)Sim ou (2)Não \nResposta: ");
        resp.add(scanner.nextInt());

    scanner.close();
    
    int positivas = 0;
    for (int i : resp) {
        if(i == 1){
            positivas++;
        }
    }

    String classificacao;
    if(positivas == 2){
        classificacao = "Suspeito...";
    } else if(positivas >= 3 && positivas <= 4){
        classificacao = "Cumplice...";
    } else if(positivas == 5){
        classificacao = "Assassino...";
    } else {
        classificacao = "Inocente...";
    }
 
    System.out.println("A pessoa é " + classificacao);

    }
}
