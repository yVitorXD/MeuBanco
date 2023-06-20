package src.model;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String agencia, String conta, int digito, String cliente, Double saldoInicial) {
		super(agencia, conta, digito, cliente, saldoInicial);

		this.setConta("Conta Poupança");
		
		
		
		
		
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	
}