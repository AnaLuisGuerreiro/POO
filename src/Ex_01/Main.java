package Ex_01;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("VW","Polo", 2001,190,1600,6,TipoCombustivel.DIESEL);
        Carro carro2 = new Carro("Mini","Cooper", 2011,280,1900,6,TipoCombustivel.GASOLINA);


        Carro vencedor1 =  carro1.corrida(carro2);

        if(vencedor1 == null){
            System.out.println("Empate");
        } else{
            System.out.println("*** Vencedor ***");
            vencedor1.detalhes();
        }

    }
}
