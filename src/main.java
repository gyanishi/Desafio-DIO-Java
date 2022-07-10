import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Gabriel");
		ContaCorrente contaC = new ContaCorrente(cliente);
		ContaPoupanca contaP = new ContaPoupanca(cliente);
		contaC.depositar(2000);
		contaC.sacar(400);
		contaC.imprimirConta();
		contaC.transferir(900, contaP);
		contaC.imprimirConta();
		contaP.imprimirConta();
		System.out.println("\n\n");

		ContaCorrente[] contas = new ContaCorrente[10];
		for (int i = 0; i < 10; i++) {
			Cliente nome = new Cliente(String.valueOf(i + 1));
			contas[i] = new ContaCorrente(nome);
			contas[i].depositar(i * 85);
			contas[i].imprimirConta();
		}
	}
}
