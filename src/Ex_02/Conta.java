package Ex_02;

public class Conta {

    private int n_conta;
    private double saldo;
    private String titular;
    private int ano_abertura = 2023;
    private int margem_emprestimo = 90;
    private int divida;

    public Conta(int n_conta, double saldo, String titular) {
        this.n_conta = n_conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void mostrarSaldo(){
        System.out.println(this.n_conta + " | Saldo atual: " + saldo);
    }

    public void pedirEmprestimo(double valor){
       double percent;
        if(this.saldo > valor){
           percent = saldo - (saldo * margem_emprestimo);
        }
    }

}
