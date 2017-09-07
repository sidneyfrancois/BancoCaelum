
public class Funcionario {
	
	private double salario;
	private String nome;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double ganhoAnul() {
		return this.salario * 12;
	}
	
	void mostraNome() {
		System.out.println("Nome: " + this.nome);
	}
	
	double getSalario() {
		return this.salario;
	}
	
}
