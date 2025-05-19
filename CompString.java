package toString;

public class CompString {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "Java"; 
        String s3 = new String("Java");

        boolean palavraIguais = s1.equals(s3) && s1.equals(s2) && s2.equals(s3);

        if(palavraIguais == false){
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são diferentes.");
        }else{
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são iguais.");
        }

         boolean palavraIguais2 = s1.equalsIgnoreCase(s3) && s1.equalsIgnoreCase(s2) && s2.equalsIgnoreCase(s3);

        if(palavraIguais2 == false){
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são diferentes.");
        }else{
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são iguais");
        }

        boolean palavraIguais3 = (s1 == s2) && (s1 == s3) && (s2 == s3);

         if(palavraIguais3 == false){
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são diferentes.");
        }else{
            System.out.println("As palavras " + s1 + ", " + s2 + " e " + s3 + " são iguais");
        }
    }      
}
