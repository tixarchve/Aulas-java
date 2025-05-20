package Abstrato;

public class Main {
    public static void main(String[] args) {
        FuncionarioMensalista junior = new FuncionarioMensalista();
        junior.salarioMensal = 3000;
        junior.horasExtras = 10;
        System.out.println("Salario: " + junior.calcularSalario());

        FuncionarioHorista maria = new FuncionarioHorista();
        maria.valorHora = 50.0;
        maria.horasTrabalhadas = 160;
        System.out.println("Salario: " + maria.calcularSalario());

    }
}
