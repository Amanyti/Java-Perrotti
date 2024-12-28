

package javaescola;



public class JavaEscola {

    
    
    public static void main(String[] args) {  
        
      Professor kayky = new Professor ("Biologia", 5000, 120, "Kayky Medrado", "5257381");
      
      kayky.Mostrar();
      
      
      Aluno Amanda = new Aluno ("73732163712", "Diurno", "Amanda Queiroz", "78271722-444");
      
      Amanda.Mostrar();
      Amanda.Formar();
      Amanda.Mostrar();
      
    }
    
}
