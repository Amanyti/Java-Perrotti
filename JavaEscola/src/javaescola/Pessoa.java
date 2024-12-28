
package javaescola;


public abstract class Pessoa {
 
    private String nome,rg;   

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
          }

       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void Mostrar(){
    
        System.out.println("NOME; "+ nome);
        System.out.println("RG: " + rg);
        }
    
    
}
