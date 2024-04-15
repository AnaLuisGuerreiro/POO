package Ex_02;

public class Conta {

    private int n_conta;
    private double saldo;
    private String titular;
    private int ano_abertura = 2023;
    private double margem_emprestimo = 0;
    private double divida = 0;

    public Conta(int n_conta, double saldo, String titular) {
        this.n_conta = n_conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margem_emprestimo = 0.9 * this.saldo;
    }

    public void transferencia(double valor, Conta conta) {

        if (this.saldo >= valor) {
            System.out.println(this.n_conta + " - Transferencia efetuada: " + valor + " -> " + conta.n_conta);
            this.saldo -= valor;
            conta.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo" + saldo);
        }

    }

    public void depositar(double valor){
        System.out.println(this.n_conta + " - Deposito efetuado: " + valor);
        this.saldo += valor;
    }

    public void levantar(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo indisponível!");
            System.out.println("Saldo atual: " + saldo);
        } else{
            System.out.println(this.n_conta + " - Levantamento efetuado: -" + valor);
            this.saldo -= valor;
        }
    }

    public void mostrarSaldo(){
        System.out.println(this.n_conta + " | Saldo atual: " + saldo);
    }

    public void pedirEmprestimo(double valor){
        if(this.divida == 0){
            // Não tem divida
            if(this.margem_emprestimo >= valor){
                // Valor valido
                this.setSaldo(this.saldo + valor);
                this.divida = valor;
            } else{
                System.out.println("Margem de empréstimo insuficiente.");
            }
        } else{
            // Temp divida
            System.out.println("Dividas pendentes. Não é possivel fazer outro emprestimo.");
        }
    }

}
