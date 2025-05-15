package ExercicioFuncionario;
public class Endereco {
    String rua;
    String cidade;
    int numero;

    public Endereco(){
    }

public Endereco(String rua, String cidade, int numero){
     this.rua = rua;
     this.cidade = cidade;
     this.numero = numero;
    }

public void armazenarEndereco(String rua, String cidade, int numero){
    this.rua = rua;
    this.cidade = cidade;
    this.numero = numero;
    }
    public void imprimirEndereco(){
    System.out.println(" | Endereço: " + rua + ", Número " + numero + " - " + cidade);
   
    }

}

