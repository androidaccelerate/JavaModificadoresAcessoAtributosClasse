/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaAcesso {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setCor("Branco");
        meuCarro.setModelo("BMW");
        //meuCarro.velocidadeAtual = 0;
        meuCarro.setVelocidadeMaxima(120);

        meuCarro.acelera(100);

        System.out.println("MeuCarro Acelerando: " + meuCarro.getVelocidadeAtual());
        System.out.println("MeuCarro: " + meuCarro.getModelo());

        meuCarro.acelera(30);

        System.out.println("MeuCarro Acelerando: " + meuCarro.getVelocidadeAtual());
    }
}
