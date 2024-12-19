package Banco;

public class ContaDeBanco {
public int numConta;
protected String tipo;
private String dono;
private double saldo;
private boolean status;
public ContaDeBanco(int numConta, String tipo, String dono, boolean status) {
	this.numConta = numConta;
	this.tipo = tipo;
	this.dono = dono;
	this.status = status;
}
public int getNumConta() {
	return numConta;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDono() {
	return dono;
}
public void setDono(String dono) {
	this.dono = dono;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}


public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	if(this.getTipo() == "cc") {
		this.saldo = 50;		
	}else {
		this.saldo = 150;
	}
	
	
}

public void abrirConta() {
	this.status = true;
	this.setSaldo(saldo);
	System.out.println("Conta aberta:");
	System.out.println("Seja-Bem vindo" + this.getDono());
	System.out.println("Seu número de conta é: " + this.getNumConta());
	System.out.println("O seu saldo está no valor de: " + this.saldo);
	
	
}

public void fecharConta() {
	if(this.getSaldo() >0) {
		System.out.println("Você não pode fechar a conta!");
		
	}else {
		this.status = false;
	}
	

}

public void depositar(double depositar) {
	this.saldo += depositar;
	
	
}

public void sacar(double saque) {
	if(this.status == true && this.saldo >0) {
		
		this.saldo -= saque   ;
	}else {
		System.out.println("erro");
	}
	
}

public void pagarMensal() {
	if(this.tipo == "cc") {
		this.saldo =- 12;
		
		
	}else {
		this.saldo -=28;
	}
	
}
@Override
public String toString() {
	return "ContaDeBanco [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status="
			+ status + "]";
}
	


}
