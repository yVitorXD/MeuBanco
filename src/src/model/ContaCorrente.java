package src.model;
import src.utils.DataUtil;


public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String agencia, String conta, int digito, String cliente, Double saldoInicial) {
		super(agencia, conta, digito, cliente, saldoInicial);
		
		this.setConta("ContaCorrente");
		
	
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	
	
}
