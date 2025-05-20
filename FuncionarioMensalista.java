package Abstrato;

public class FuncionarioMensalista extends Funcionario{
    public double salarioMensal;
    public int horasExtras;

    @Override
    public double calcularSalario(){
        return salarioMensal + (horasExtras * (salarioMensal / 160));
    }
    
}
