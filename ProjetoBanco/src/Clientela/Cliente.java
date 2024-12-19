package Clientela;

import Banco.ContaDeBanco;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ContaDeBanco cliente1 = new ContaDeBanco(1,"cc", "Pedro", true);
		cliente1.abrirConta();
		cliente1.depositar(100);
		System.out.println(cliente1);
		cliente1.sacar(100);
		System.out.println(cliente1);
		cliente1.pagarMensal();
		System.out.println(cliente1);

	}

}
