package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	public void imprimirConta () {
		System.out.println("=== Conta Poupanca ===");
		imprimirDados();
	}
}
