public class Carro {

    // Atributos

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    // Construtor

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;

    }

    // Metodo para ligar o carro

    public void ligar() {
        if (!ligado) {
            System.out.println("Carro Ligado");
            ligado = true;
        } else {
            System.out.println("O Carro já está ligado ");
        }
    }

    // Método para desligar o Carro

    public void desliga() {
        if (ligado) {
            System.out.println("Carro Desligado");
            ligado = false;
        } else {
            System.out.println("O Carro já está Desligado");
        }
    }

    // Método para exibir informações do carro

    public void exibirInformações() {
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.err.println("Ano:" + ano);
        System.out.println("Status:" + (ligado ? "Ligado" : "Desligado"));
    }

    public static void main(String[] args) {

        // Criando um objeto Carro

        Carro meuCarro = new Carro("Lamborghini", "Huracan", 2024);

        meuCarro.ligar();

        // Exibir informações Iniciais

        meuCarro.exibirInformações();
    }
}