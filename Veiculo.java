package Heranca;

public class Veiculo {
    protected String cor;
    protected String marca;

    public Veiculo(String cor, String marca){
        this.cor = cor;
        this.marca = marca;
    }

    public void apresentacao(){
        System.out.println("Mensagem generica");
    }
}
