package src.model;

import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

	Double VALOR_MINIMO_DEPOSITO = 10.0;

	protected String agencia;
	
	protected String conta;
	
	protected int digito;
	
	protected String cliente;
	
	protected Double saldo;
	// ** Data Abertura
	protected Date dataAbertura;
	
	

	public ContaBancaria(String agencia, String conta, int digito, String cliente, Double saldoInicial) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.cliente = cliente;
		this.saldo = saldoInicial;
		// ** Data Abertura
		this.dataAbertura = new Date();
		
	}

	public void depositar (Double valor) {
		
		if(valor < VALOR_MINIMO_DEPOSITO ) {
			throw new InputMismatchException("Valor minimo de Deposito = " + VALOR_MINIMO_DEPOSITO);
		}
				
		this.saldo += valor;
		
	}
	
	public Double sacar(Double valor) {
		
		if(valor > this.saldo) {
			throw new InputMismatchException("Valor Insuficiente ");
		}
		
		this.saldo -= valor;
		
		return valor;
		
	}
	
	public void transferir(Double valor, ContaBancaria contaDestino) {
		
		this.sacar(valor);
		
		contaDestino.depositar(valor);
		
	}
	
	
	
	
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public abstract void imprimirExtrato();

	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	
	
	
	
}
