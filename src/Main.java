
public class Main {
	
	public static void main(String[] args) {
		Conta minhaconta = new Conta();
		
		minhaconta.titular.nome = "Duke";
		minhaconta.saldo = 1000.0;
		
		System.out.println("Dono da conta: " + minhaconta.titular.nome);
		System.out.println("Saldo atual: " + minhaconta.saldo);
	}
	
}
