# Documentação: `Soma.java`

Conceito Teórico: Sobrecarga de Métodos (Overloading)
A sobrecarga de métodos (ou method overloading, em inglês) é um recurso da programação orientada a objetos que permite a uma classe ter múltiplos métodos com o mesmo nome, desde que suas listas de parâmetros sejam diferentes. A diferenciação pode ocorrer pelo número de parâmetros, pelo tipo dos parâmetros ou por ambos.

Este mecanismo promove a legibilidade e a flexibilidade do código, permitindo que um método com uma responsabilidade semântica clara (como "somar") possa operar sobre diferentes tipos ou quantidades de dados. O compilador Java decide qual versão do método invocar com base nos argumentos fornecidos na chamada.

Análise do Código: Soma.java
O arquivo Soma.java ilustra o conceito de sobrecarga de métodos de maneira exemplar através da classe Soma.

Classe Soma:
Esta classe define três métodos distintos, todos nomeados somar, mas com assinaturas diferentes:

public int somar(int a, int b):

Assinatura: Recebe dois parâmetros do tipo int.

Funcionalidade: Retorna a soma de dois números inteiros.

public double somar(double a, double b):

Assinatura: Recebe dois parâmetros do tipo double.

Funcionalidade: Realiza a soma de dois números de ponto flutuante, retornando um double. Este método é diferenciado do anterior pelo tipo dos parâmetros.

public int somar(int a, int b, int c):

Assinatura: Recebe três parâmetros do tipo int.

Funcionalidade: Retorna a soma de três números inteiros. Este método se diferencia dos outros pelo número de parâmetros.

Método main:
O método main, localizado dentro da classe Soma, serve para demonstrar a utilização dos métodos sobrecarregados:

calc.somar(2, 3): O compilador identifica que dois argumentos inteiros foram passados e invoca a versão somar(int a, int b).

calc.somar(2.5, 3.7): Ao receber dois argumentos do tipo double, o compilador seleciona a versão somar(double a, double b).

calc.somar(1, 2, 3): Com três argumentos inteiros, a chamada é direcionada para a versão somar(int a, int b, int c).

Este exemplo prático evidencia como a sobrecarga de métodos permite que o desenvolvedor use um nome de método intuitivo (somar) para diferentes contextos numéricos, deixando que o compilador gerencie a chamada correta com base nos dados fornecidos.
