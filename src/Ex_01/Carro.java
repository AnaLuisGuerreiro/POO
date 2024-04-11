package Ex_01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private int litros100Km;

    private TipoCombustivel combustivel;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, int litros100Km, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.litros100Km = litros100Km;
        this.combustivel = combustivel;
    }


    public Carro corrida(Carro adversario) {

        if (this.potencia > adversario.potencia) {
            return this;
        } else {
            if (this.cilindrada < adversario.cilindrada) {
                return adversario;
            } else {
                if (this.ano > adversario.ano) {
                    return this;
                } else {
                    if (this.ano < adversario.ano) {
                        return adversario;
                    } else {
                        return null;
                    }
                }
            }

        }
    }

    public void detalhes() {
        System.out.println("Carro : " + this.marca);
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Ano : " + this.ano);
    }

    public int getConsumos(double distancia) {
        return ano;
    }
}


