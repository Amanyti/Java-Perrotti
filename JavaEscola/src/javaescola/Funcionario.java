
package javaescola;


public class Funcionario extends Pessoa {
    
    private double salarioHora;
    private int horaMes;

    public Funcionario(double salarioHora, int horaMes, String nome, String rg) {
        super(nome, rg);
        this.salarioHora = salarioHora;
        this.horaMes = horaMes;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHoraMes() {
        return horaMes;
    }

    public void setHoraMes(int horaMes) {
        this.horaMes = horaMes;
    }
    
    
    @Override
    public void Mostrar (){
    
    super.Mostrar();
    System.out.println("Salario "+ salarioHora);
    System.out.println("Horas trabalhadas no MES: " + horaMes);

    }
    
    
}
