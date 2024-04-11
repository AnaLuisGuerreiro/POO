package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal macaco = new Animal("zézé","macaco","Espanha",10,Alimentacao.BANANA);

      macaco.comer(Alimentacao.FOLHAS,0.9);
    }
}
