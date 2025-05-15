package ExercicioFuncionario;
public class Funcionario {
    String nome;
    char sexo;
    int anoContratacao;
    double salario;
    Endereco endereco;

    public Funcionario(){
        this.endereco = new Endereco();
    }

    public void armazenar(String nome, char sexo, int anoContratacao, double salario, String rua, String cidade, int numero){
        this.nome = nome;
        this.sexo = sexo;
        this.anoContratacao = anoContratacao;
        this.salario = salario;
        this.endereco.armazenarEndereco(rua, cidade, numero);
    }
    public void imprimir(){
        System.out.print("Nome: " + this.nome + " | Sexo: " + this.sexo + " | Ano de contratação; " + this.anoContratacao + " | Salário: R$" + this.salario);
        endereco.imprimirEndereco();
    }

}