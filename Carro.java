package Heranca;

public class Carro extends Veiculo{
    private int numMarchas;

    public Carro(String cor, String marca, int numMarchas){
        super(cor, marca);
        this.numMarchas = numMarchas;
    }


    @Override
    public String toString(){
        super.apresentacao();
        return "Cor:  " + cor + ", Marca: " + marca + ", Marchas: " + numMarchas;
    } 
}
