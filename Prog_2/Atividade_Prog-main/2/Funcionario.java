public abstract class Funcionario{

    Integer dias;
    Double salario_dia;

    public double calcularSalario(Integer diasTrabalhados, Double salario_dia){
        this.dias = diasTrabalhados;
        this.salario_dia = salario_dia;
        double salario = salario_dia*diasTrabalhados;
        return salario;
    }

}

class Diarista extends Funcionario{
    @Override
    public double calcularSalario(Integer diasTrabalhados, Double salario_dia) {
        return super.calcularSalario(diasTrabalhados, salario_dia);
    }
}

class Gerente extends Funcionario{
    @Override
    public double calcularSalario(Integer diasTrabalhados, Double salario_dia) {
        double salario_mes = super.calcularSalario(diasTrabalhados, salario_dia);
        return salario_mes+(salario_mes*0.1);
    }
}