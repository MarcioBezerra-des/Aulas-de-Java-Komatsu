import java.util.ArrayList;

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return 0;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}

class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ana", 8000));
        funcionarios.add(new Gerente("Bruno", 9000));
        funcionarios.add(new Programador("Carlos", 5000));
        funcionarios.add(new Programador("Daniela", 4800));
        funcionarios.add(new Programador("Eduardo", 5100));

        double somaBonus = 0;

        System.out.println("Nome\t\tSalário\t\tBônus");
        for (Funcionario f : funcionarios) {
            double bonus = f.calcularBonus();
            somaBonus += bonus;
            System.out.printf("%s\t\tR$ %.2f\tR$ %.2f%n", f.nome, f.salario, bonus);
        }
        System.out.printf("Soma dos bônus: R$ %.2f%n", somaBonus);
    }
}