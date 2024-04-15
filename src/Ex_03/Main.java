package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal macaco = new Animal("zézé","macaco","Espanha",10,new String[]{"Banana", "Maça", "Nozes"});

        macaco.comer("Banana",400);
        macaco.getDetalhes();
    }
}
