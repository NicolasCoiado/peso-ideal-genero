import java.util.Scanner;
public class PesIdealGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 13");
        System.out.println("Diga sua altura:");
        double altura = Double.parseDouble(scanner.next());
        double pesoIdealHomens = (72.7*altura)-58;
        double pesoIdealMulheres = (62.1*altura)-44.7;
        System.out.println("O seu peso ideal é de...");
        System.out.println("Caso seja um homem:");
        System.out.println(pesoIdealHomens+" kg");
        System.out.println("Caso seja uma mulher");
        System.out.println(pesoIdealMulheres+" kg");
        System.out.println("=====================================");
    }
}
