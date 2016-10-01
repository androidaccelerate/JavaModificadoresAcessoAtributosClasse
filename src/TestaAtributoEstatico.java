/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaAtributoEstatico {
    public static void main(String[] args) {

        System.out.println("Quantidade de Carros: " + Carro.getQuantidadeDeCarros());

        Carro carro1 = new Carro("Branco", "C4", 140);
        Carro carro2 = new Carro("vermelho", "Uno", 100);

        System.out.println("Quantidade de Carros: " + Carro.getQuantidadeDeCarros());

        System.out.println("MeuCarro Quantidade: " + carro1.getQuantidadeDeCarros());
    }
}
