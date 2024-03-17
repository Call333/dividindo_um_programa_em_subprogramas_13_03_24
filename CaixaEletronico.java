import java.util.Scanner;
public class CaixaEletronico {
    static double saldo = 1000.00;
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		CaixaEletronico c = new CaixaEletronico();
    	int opcao;
    	double valor = 0;
    	System.out.println("Bem-vindo ao Caixa Eletrônico");
    	System.out.println("Seu saldo atual é: R$" + saldo);
    	System.out.println("Escolha uma opção:");
    	System.out.println("1 - Saque");
    	System.out.println("2 - Depósito");
    	System.out.println("3 - Consultar Saldo");
    	opcao = scanner.nextInt();
    	if (opcao == 1) {
			c.sacar(saldo, valor, scanner);
    	} else if (opcao == 2) {
        	c.depositar(saldo, valor, scanner);
    	} else if (opcao == 3) {
			c.consultarSaldo(saldo);
    	} else {
        	System.out.println("Opção inválida.");
    	}

    	scanner.close();
    }
	
    void sacar(double saldo, double valor, Scanner scanner){
		System.out.println("Digite o valor do saque:");
        valor = scanner.nextDouble();
        if (valor > saldo) {
        	System.out.println("Saldo insuficiente.");
        } else {
        	saldo -= valor;
        	System.out.println("Saque de R$" + valor + " realizado.");
        }
    }

	void depositar(double saldo, double valor, Scanner scanner){
		System.out.println("Digite o valor do depósito:");
        valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
	}

	void consultarSaldo(double saldo){
		System.out.println("Seu saldo atual é: R$" + saldo);
	}
}

