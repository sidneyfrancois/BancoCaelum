
public class Empresa {
	Funcionario[] empregados;
	String cnpj;
	String nome;
	int numfuncionarios;
	
	Empresa(String nome, String cnpj){
		empregados = new Funcionario[10];
		numfuncionarios = 0;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	void adiciona(Funcionario f) {
		if(numfuncionarios < 10) {
			empregados[numfuncionarios] = f;
			numfuncionarios ++;
		}
	}
	
	
	
}
