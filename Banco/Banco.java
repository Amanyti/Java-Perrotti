package banco;

public abstract class Conta(){
    private String cpf;
    private double saldo; 
}

    Conta(String cpf, double saldo){
        this.cpf = cpf;
        this.saldo = saldo;
    }

    