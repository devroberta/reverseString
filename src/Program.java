import java.util.Scanner;

public class Program {

    static ReverseString reverse = new ReverseString();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String text = sc.nextLine();
        char vetor[] = text.toCharArray();
        String result = reverse.reverseString(text);

        System.out.println("\nTexto Invertido: " + result );
    }
}