package Ex_02;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(11,1000,"Ana");
        Conta conta2 = new Conta(325,100,"Bruno");

        conta1.pedirEmprestimo(900);

    }
}
