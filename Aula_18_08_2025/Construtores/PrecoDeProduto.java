public class Project {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse");

        System.out.println("Produto 1: " + produto1.nome + " - R$ " + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + " - R$ " + produto2.preco);
    }
}

class Produto {
    String nome;
    double preco;

    // Construtor que inicializa nome e preco
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor que inicializa apenas o nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }
}