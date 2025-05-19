package toString;

public class ManipString {
    public static void main(String[] args) {
        String string = "Programação Orientada a Objetos";

        System.out.println(string.length());
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length()-1));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
    }
}
