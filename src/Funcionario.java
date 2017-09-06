
public class Funcionario {
	
	double salario;
	String nome;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double ganhoAnul() {
		return this.salario * 12;
	}
	
	void mostraNome() {
		System.out.println("Nome: " + this.nome);
	}
	
}
