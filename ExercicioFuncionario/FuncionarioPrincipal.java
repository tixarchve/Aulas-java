package ExercicioFuncionario;
import java.util.Scanner;
public class FuncionarioPrincipal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        System.out.println("Digite os dados: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Sexo: ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.println("Ano de contratação: ");
        int ano = scanner.nextInt();
        System.out.println("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Rua: ");
        String rua = scanner.nextLine();
        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Número: ");
        int numero = scanner.nextInt();
       
        funcionario1.armazenar(nome, sexo, ano, salario, rua, cidade, numero);
        funcionario1.imprimir();
        
        scanner.close();
    }
}

