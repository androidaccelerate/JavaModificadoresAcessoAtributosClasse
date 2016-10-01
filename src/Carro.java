/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Carro {

    private static int quantidadeDeCarros;

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    public Carro(String cor, String modelo, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;

        System.out.println("Criando um carro.");
        Carro.quantidadeDeCarros = Carro.quantidadeDeCarros + 1;
    }

    public Carro() {
        System.out.println("Criando um carro.");
        Carro.quantidadeDeCarros = Carro.quantidadeDeCarros + 1;
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if (verificaVelocidadeMáxima(velocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }

    private boolean verificaVelocidadeMáxima(double velocidade) {
        return velocidade < velocidadeMaxima;
    }
}
