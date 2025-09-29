# 1. Documentação: `PrecoDeProduto.java`

## Conceito Teórico: Construtores em Java
Em programação orientada a objetos (POO), um construtor é um método especial utilizado para inicializar um objeto recém-criado. Ele é invocado automaticamente no momento da instanciação da classe (usando a palavra-chave new). Os construtores são fundamentais para garantir que os objetos comecem em um estado consistente, com seus atributos devidamente configurados.<br>

Uma classe pode ter múltiplos construtores, desde que suas assinaturas (a lista de parâmetros) sejam diferentes. Essa característica é um exemplo de sobrecarga de métodos aplicada a construtores.

## Análise do Código: `PrecoDeProduto.java`
O arquivo PrecoDeProduto.java demonstra de forma clara e objetiva o uso de construtores sobrecarregados para inicializar objetos da classe Produto.

### Classe `Produto:`
Esta classe modela a entidade "Produto" e possui dois atributos:

* `String nome:` Armazena o nome do produto.
* `double preco:` Armazena o valor monetário do produto.

A classe implementa dois construtores distintos:

1. `public Produto(String nome, double preco):`

  * **Finalidade:** Este construtor permite a criação de um objeto `Produto` com seus dois atributos (`nome` e `preco`) inicializados simultaneamente.
  * **Funcionamento:** Ele recebe dois parâmetros e os atribui aos respectivos atributos do objeto utilizando a palavra-chave `this` para diferenciar o atributo da classe do parâmetro do método.

2. `public Produto(String nome):`

  * **Finalidade:** Este é um construtor sobrecarregado que oferece flexibilidade, permitindo a criação de um objeto `Produto` informando apenas o seu nome.
  * **Funcionamento:** Ele recebe apenas o nome como parâmetro e define um valor padrão (`0.0`) para o atributo `preco`. É útil em cenários onde o preço pode ser definido posteriormente ou é desconhecido no momento da criação.

### Classe `Project`:
A classe `Project` contém o método `main`, que serve como ponto de entrada para a execução do programa. Nele, são criados dois objetos da classe `Produto` para demonstrar o uso dos diferentes construtores:

* `Produto produto1 = new Produto("Notebook", 3500.00);`: Instancia um objeto `Produto` utilizando o primeiro construtor, que inicializa tanto o nome quanto o preço.
* `Produto produto2 = new Produto("Mouse");`: Instancia outro objeto `Produto` utilizando o segundo construtor, que inicializa apenas o nome, atribuindo o valor 0.0 ao preço.

Ao final, o programa imprime os detalhes de cada produto no console, evidenciando os estados iniciais distintos dos objetos, conforme definidos pelos construtores invocados.
