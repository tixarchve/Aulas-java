public class Carro {
    private char tipoCombustivel;
    private String modelo;
    private int numPortas;
    private double preco;

    public char getTipoCombustivel(){
        return tipoCombustivel;
    }

    public void setTipoCombustivel(char tipo){
        if(tipo == 'A' || tipo == 'G' || tipo == 'F'){
            this.tipoCombustivel = tipo;
        }
    }

    public String getModelo(){
        return modelo;
    }

    public int getNumPortas(){
        return numPortas;
    }

    public double getPreco(){
        return preco;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setNumPortas(int portas){
        this.numPortas = portas;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


}

