package Abstrato;

public class FuncionarioHorista extends Funcionario{
    public double valorHora;
    public int horasTrabalhadas;

    @Override
    public double calcularSalario(){
        return valorHora * horasTrabalhadas;
    }


}
