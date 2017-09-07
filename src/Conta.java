
public class Conta {
	
	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	public static int totalDeContas;
	
	Conta(Cliente titular){
		this.titular = titular;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	Conta(int numero, Cliente titular){
		this(titular);	//Chama o construtor que foi declarado acima
		this.numero = numero;
	}
	
	public int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}
