public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

     // Método para exibir os dados da pessoa
    public void exibirDados(String a, int b, String c) {
        this.nome = a;
        this.idade = b;
        this.cpf = c;

        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("cpf: " + this.cpf);
    }

    // Método para atualizar a idade da pessoa
    public void atualizarIdade(int novaIdade) {} 

    // Método para verificar se a pessoa é maior de idade
    public boolean verificarMaioridade() {
        return this.idade >= 18;
    }



    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibirDados("Marcio",20,"000.000.000-00");
        System.out.println("Maior de idade: " + pessoa1.verificarMaioridade());
    }
}
