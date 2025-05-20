package Heranca;

public class Aviao extends Veiculo{
    private String tipoAsas;

    public Aviao(String cor, String marca, String tipoAsas){
        super(cor, marca);
        this.tipoAsas = tipoAsas;
    }
    

    @Override
    public void apresentacao(){
        super.apresentacao();
        System.out.println("Cor: " + cor + ", Marca: " + marca + ", Asas: " + tipoAsas);
    }
}
