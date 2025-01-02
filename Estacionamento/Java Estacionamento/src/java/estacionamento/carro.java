/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.estacionamento;


public class carro {
    
    public String placa;
    public int anoDeFabricação;
    public String modelo;
    public boolean disponivel;
     public String vendedor;

    public carro(String placa, int anoDeFabricação, String modelo, boolean disponivel, String vendedor) {
        this.placa = placa;
        this.anoDeFabricação = anoDeFabricação;
        this.modelo = modelo;
        this.disponivel = disponivel;
        this.vendedor = vendedor;
    }
}

