package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Funcionario;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
	
		
			
		System.out.print("Name: ");
		func.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		func.taxa = sc.nextDouble();
		
		// System.out.println("Dados: " + func.toString());
		System.out.println("Dados: " + func);
		System.out.println("Informe percentual aumento: ");
		double percent = sc.nextDouble();
		
		func.IncreaseSalary(percent);
		
		System.out.println("Dados alterados: " + func.toString());
		
		
		
		sc.close();

	}

}
