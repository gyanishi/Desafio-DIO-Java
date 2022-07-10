package banco;

public abstract class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	protected final static int agen = 1111;
	private static int seq = 1;

	public Conta(Cliente cliente) {
		this.agencia = agen;
		this.numero = seq++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) this.saldo -= valor;
		else System.out.println("Valor de saque maior que o saldo da conta\n");
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		if (valor <= this.saldo) this.sacar(valor);
		else System.out.println("Valor de transferencia maior que o saldo da conta\n");
		contaDestino.depositar(valor);
	}

	protected void imprimirDados() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
}
