package Ex_03;


public class Animal {

    private String nome;
    private String especie;
    private String pais;
    private int peso;
    private Alimentacao alimentacao;

    public Animal(String nome, String especie, String pais, int peso, Alimentacao alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(Alimentacao alimento, double gramas) {
      for(int i = 0; i < Alimentacao.values().length; i++){
          if(alimento.equals(Alimentacao.values()[i])){
              System.out.println("Animal comeu " + alimento);
              this.peso += gramas;
              break;
          }else{
              System.out.println("O animal recusou a comida.");
          }
      }

    }
}
