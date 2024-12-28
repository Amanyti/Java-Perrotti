
package javaescola;


public class Professor extends Funcionario {
    
    private String areaAtuacao;

    public Professor(String areaAtuacao, double salarioHora, int horaMes, String nome, String rg) {
        super(salarioHora, horaMes, nome, rg);
        this.areaAtuacao = areaAtuacao;
    }
      

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    @Override
    public void Mostrar (){
    
    super.Mostrar();
     System.out.println("aREA DE aTUACAO: " + areaAtuacao);

    }
    
}
