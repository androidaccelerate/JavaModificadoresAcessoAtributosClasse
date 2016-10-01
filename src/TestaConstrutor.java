/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaConstrutor {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Amarelo", "Camaro", 400);

        System.out.println("MeuCarro: ");
        System.out.println("- Cor: " + meuCarro.getCor());
        System.out.println("- Modelo: " + meuCarro.getModelo());
        System.out.println("- V. Máxima: " + meuCarro.getVelocidadeMaxima());
    }
}
