# Documentação do Código: **`Carro.java`**

## 1 - Descrição Geral

 A classe `Carro` representa a entidade de um veículo e armazena suas informações básicas, como Renavam, placa, modelo e ano de fabricação. Além de armazenar os dados, a classe oferece funcionalidades para exibir essas informações e verificar se o veículo é considerado antigo com base no seu ano.

## 2 - Requisitos para Desenvolvimento

* Sistema Operacional: Windows
* Versão Java: v24
* Versão JDK: V24
* Aplicativo utilizado: Visual Studio

## 3 - Atributos (Variáveis de Instância)

 Os atributos são as variáveis que definem as características de cada objeto criado a partir da classe `Carro`. Eles são declarados como `private`, o que significa que só podem ser acessados diretamente de dentro da própria classe, garantindo o encapsulamento dos dados.

## 4 - Métodos (Comportamentos)

Os métodos definem as ações que um objeto da classe `Carro` pode executar.

`public void exibirDados(String a, int b, String c, int d)`

Este método tem uma dupla função: ele primeiro atribui os valores passados como parâmetros aos atributos do objeto e, em seguida, imprime esses dados no console.

* **Finalidade:** Inicializar/atualizar os dados do carro e exibi-los.

* **Parâmetros:**

  * **`String a`:** O código Renavam a ser atribuído ao carro.

  * **`int b`:** O número da placa a ser atribuído ao carro.

  * **`String c`:** O modelo a ser atribuído ao carro.

  * **`int d`:** O ano de fabricação a ser atribuído ao carro.

* **Retorno:** Não possui retorno (void).

* **Funcionamento:**

  * **`this.renavam = a;`:** Atribui o valor do parâmetro a ao atributo renavam do objeto.

  * **`this.placa = b;`:** Atribui o valor do parâmetro b ao atributo placa do objeto.

  * **`this.modelo = c;`:** Atribui o valor do parâmetro c ao atributo modelo do objeto.

  * **`this.ano = d;`:** Atribui o valor do parâmetro d ao atributo ano do objeto.

  * **`System.out.println(...)`:** Imprime cada um dos atributos com uma descrição no console.

Nota de Boas Práticas: Geralmente, a atribuição de valores (inicialização) é feita em um método construtor, e a exibição de dados é feita em um método separado (como `toString()` ou um método `get` para cada atributo). O método `exibirDados` como está combina duas responsabilidades, o que pode ser separado para um melhor design do código.

`public boolean verificarCarroAntigo()`

Este método verifica se o ano de fabricação do carro é anterior ao ano 2000.

* **Finalidade:** Checar a "idade" do carro com base em um critério fixo.

* **Parâmetros:** Não recebe parâmetros.

* **Retorno:**

  * **true:** Se o ano do carro for menor que 2000.

  * **false:** Se o ano do carro for igual ou maior que 2000.

* Funcionamento:

  1. `return this.ano < 2000;`: Compara o valor do atributo ano do objeto com 2000 e retorna o resultado booleano da comparação.

`public static void main(String[] args)`

Este é o método principal, o ponto de entrada para a execução do programa. É aqui que a classe `Carro` é utilizada.

* **Finalidade:** Demonstrar o uso da classe Carro, criando um objeto e utilizando seus métodos.

* **Funcionamento:**

  * **`Carro carro1 = new Carro();`:** Cria uma nova instância (um objeto) da classe Carro e a armazena na variável carro1.

  * **`carro1.exibirDados("123456", 12445, "Fiat", 1999);`:** Chama o método exibirDados para o objeto carro1, passando os valores para Renavam, placa, modelo e ano. Isso irá configurar e imprimir os dados de carro1.

  * **`if (carro1.verificarCarroAntigo()) { ... }`:** Chama o método verificarCarroAntigo para o objeto carro1.

 * Se o método retornar true (o que acontecerá, pois o ano é 1999), a mensagem "Seu carro é antigo." será impressa no console.

 * Se o método retornasse false, a mensagem "Seu carro não é antigo." seria impressa.

## Saída Esperada do Programa

Ao executar este código, a saída no console será:

`Renavam: 123456
Placa: 12445
Modelo: Fiat
Ano: 1999
Seu carro é antigo.`
