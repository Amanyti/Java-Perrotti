
package javaescola;


public class Aluno extends Pessoa {
    
private String ra, turno, status;

    public Aluno(String ra, String turno, String nome, String rg) {
        super(nome, rg);
        this.ra = ra;
        this.turno = turno;
        
        this.status = "Ativo";
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
public void Trancar(){ 
    
    if (status == "Ativo"){
        
        this.status = "Trancado";
        }
}
public void Destrancar(){
    
     if (status == "Trancado"){
        
        this.status = "Trancado";
        }
    
}
public void Formar(){
     if (status == "Ativo"){
        
        this.status = "egressos";
        }
    

}
public void Desistir(){

       if (status != "egressos"){
        
        this.status = "desisitir";
        
        }


}

    @Override
    public void Mostrar() {
      super.Mostrar();
      
    System.out.println("RA; "+ ra);
    System.out.println("TURNO: " + turno);
    System.out.println("STATUS: " + status);
    
    }

    
    
    
    
    
    
}
