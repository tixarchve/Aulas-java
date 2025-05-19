package toString;
import java.util.Scanner;
public class SubstString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine(); 

        System.out.println(frase.replace("a", "@"));

        scanner.close();
    }
}
