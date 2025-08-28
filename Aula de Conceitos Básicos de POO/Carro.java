public class Carro {
    private String renavam;
    private int placa;
    private String modelo;
    private int ano;

    // Método para exibir os dados do carro
    public void exibirDados(String a, int b, String c, int d) {
        this.renavam = a;
        this.placa = b;
        this.modelo = c;
        this.ano = d;

        System.out.println("Renavam: " + this.renavam);
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    // Método para verificar se o carro é antigo (ano anterior a 2000)
    public boolean verificarCarroAntigo() {
        return this.ano < 2000;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.exibirDados("123456", 12445, "Fiat", 1999);
        
        if (carro1.verificarCarroAntigo()) {
            System.out.println("Seu carro é antigo.");
        } else {
            System.out.println("Seu carro não é antigo.");
        }
    }

}