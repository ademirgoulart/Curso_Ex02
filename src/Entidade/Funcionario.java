package Entidade;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double NetSalary() {
		return salarioBruto - taxa ;
	}

	public void IncreaseSalary(double percentagem) {
		salarioBruto += salarioBruto * percentagem /100;
	
	}

	
	public String toString() {
		return nome + ",   $ " + String.format("%.2f", (salarioBruto - taxa)) ;
	}
	
	
}
