package Ex_03;


public class Animal {

    private String nome;
    private String especie;
    private String pais;
    private double peso;
    private String [] alimentacao;

    public Animal(String nome, String especie, String pais, int peso, String [] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;

    }

    public void comer(String alimento, double pesoAlimento) {
       boolean alimentoPermitido = false;

        // Iterar o array de alimentação
        for(int i = 0; i < this.alimentacao.length; i++){
            if(this.alimentacao[i].equalsIgnoreCase(alimento)){
                alimentoPermitido = true;
                break;
            }
        }

        if(alimentoPermitido){
            this.peso += pesoAlimento / 1000;
            System.out.println("O animal comeu");
        } else{
            System.out.println("O animal recusou a comida");
        }

    }

    public void getDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especie: " + this.especie);
        System.out.println("Peso: " + this.peso);

    }


}
