package toString;
import java.util.Scanner;
import java.util.Arrays;
public class OrdString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[3];

        for(int i = 0; i < palavras.length; i++){
            System.out.println("Digite a " + (i+1) + " palavra: ");
            palavras[i] = scanner.nextLine();
        }

        Arrays.sort(palavras);
        System.out.println("\n Palavras em ordem alfabética ");
        for(String palavra : palavras){
            System.out.println(palavra);
        }

        scanner.close();

    }
}
