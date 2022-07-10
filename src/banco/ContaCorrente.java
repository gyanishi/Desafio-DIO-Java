package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirConta () {
		System.out.println("=== Conta Corrente ===");
		imprimirDados();
	}

}
