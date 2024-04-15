package Ex_04;

public class Imovel {

    private String rua;
    private int n_porta;
    private String cidade;
    private CasaTipo tipo;
    private Acabamento acabamento;
    private double area;
    private int n_quartos;
    private int n_wcs;
    private double area_piscina;

    public double getValorImovel(Imovel imovel){
        double valor_final = 0;
        if(tipo.equals(CasaTipo.APARTAMENTO)){
            valor_final = area * 1000;
        } else if(tipo.equals(CasaTipo.CASA)){
            valor_final = area * 3000;
        } else if(tipo.equals(CasaTipo.MANSAO)){
            valor_final = area * 5000;
        }

        if(acabamento.equals(Acabamento.PARA_RESTAURO)){
            valor_final -= valor_final * 0.5;
        }

        return valor_final;
    }
}
