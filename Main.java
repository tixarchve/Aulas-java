package Heranca;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Preto", "AUDI", 6);
        Aviao aviao = new Aviao("Branco", "Boeing", "Fixas");
        System.out.println(carro.toString());
        aviao.apresentacao(); 
    }
    
}
