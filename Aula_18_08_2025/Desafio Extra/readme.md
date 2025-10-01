#  Documentação: `BonusSalarial.java`

### Visão Geral do Módulo `BonusSalarial`
Este módulo implementa um sistema de cálculo de bônus para funcionários, utilizando conceitos de herança e polimorfismo para criar uma estrutura extensível e de fácil manutenção. O design permite que diferentes cargos (Gerente, Programador) tenham regras de bonificação distintas, enquanto o sistema principal pode tratar todos os funcionários de maneira uniforme.

### Arquitetura das Classes

* **`Funcionario` (Classe Base Abstrata)**
  
  * **Propósito**: Serve como a classe fundamental que define a estrutura comum a todos os funcionários.
  * **Atributos**:
    * `protected String nome`: Nome do funcionário.
    * `protected double salario`: Salário base do funcionário.
  * **Métodos**:
    * `public Funcionario(String nome, double salario)`: Construtor para inicializar os atributos básicos.
    * `public double calcularBonus()`: Método base para o cálculo de bônus. Retorna `0` por padrão e deve ser sobrescrito (`@Override`) pelas classes filhas para implementar a lógica de negócio específica de cada cargo.
    
* **`Gerente` (Classe Derivada)**

  * **Herança**: Estende `Funcionario`.
  * **Lógica de Negócio**: A regra de bônus para um `Gerente` corresponde a 20% do seu salário base.
  * **Implementação**: Sobrescreve o método `calcularBonus()` para retornar `salario * 0.20`.

* **`Programador (Classe Derivada)`**

  * **Herança**: Estende `Funcionario`.
  * **Lógica de Negócio**: A regra de bônus para um `Programador` corresponde a 10% do seu salário base.
  * **Implementação**: Sobrescreve o método `calcularBonus()` para retornar `salario * 0.10`.

### Ponto de Execução (`Main`)
A classe `Main` demonstra o uso polimórfico do sistema.

1. **Estrutura de Dados**: Um `ArrayList<Funcionario>` é utilizado para armazenar objetos de diferentes tipos de funcionários (`Gerente`, `Programador`) em uma única coleção. Isso é possível porque ambos são subtipos de `Funcionario`.
2. **Processamento em Lote**: O código itera sobre a lista de funcionários. Para cada `Funcionario` `f` na lista, a chamada `f.calcularBonus()` invoca dinamicamente a versão correta do método, dependendo do tipo real do objeto (se é `Gerente` ou `Programador`).
3. **Saída**: O programa gera um relatório no console listando o nome, o salário e o bônus calculado para cada funcionário, além de apresentar a soma total dos bônus distribuídos.

Este design facilita a adição de novos cargos no futuro (ex: `Analista`, `Designer`). Bastaria criar uma nova classe que herda de `Funcionario` e sobrescrever o método `calcularBonus` com a nova regra, sem a necessidade de alterar o código que processa a lista de funcionários.
