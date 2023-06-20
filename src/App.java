import src.model.ContaBancaria;
import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.utils.DataUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("***** Vitor Bank *****");
		System.out.println();
		System.out.println("-- Seja Bem-Vindo! --");
		System.out.println();
		
		
		ContaCorrente cliente1 = new ContaCorrente("0001",null, 4, "Vitor Abreu de Araujo", 50.0);
		
		// Conta Corrente
		System.out.println("**************************************");
		System.out.println();
		System.out.println("Dados do cliente!");
		System.out.println("Cliente: " + cliente1.getCliente());
		System.out.println("Agencia: " + cliente1.getAgencia());
		System.out.println("Conta: " + cliente1.getConta());
		System.out.println("Saldo da conta: " + cliente1.getSaldo());
		System.out.println("Tipo Conta: " + cliente1.getConta());
		var f1 = DataUtil.converterDateParaDataEHora(cliente1.getDataAbertura());
		System.out.println("Data Atual = " + f1);
		System.out.println();
		System.out.println("**************************************");
		cliente1.depositar(52.0);
		
		// Conta Poupança
		
		ContaPoupanca cliente2 = new ContaPoupanca("0002", null, 8, "Leda Marcia", 100.0);
		
		System.out.println("**************************************");
		System.out.println();
		System.out.println("Dados do cliente!");
		System.out.println("Cliente: " + cliente2.getCliente());
		System.out.println("Agencia: " + cliente2.getAgencia());
		System.out.println("Conta: " + cliente2.getConta());
		System.out.println("Saldo da conta: " + cliente2.getSaldo());
		System.out.println("Tipo Conta: " + cliente2.getConta());
		var f2 = DataUtil.converterDateParaDataEHora(cliente1.getDataAbertura());
		System.out.println("Data Atual = " + f1);
		System.out.println();
		System.out.println("**************************************");
		
		System.out.println();
		
		
		System.out.println("Saldo Atual: " + cliente1.getCliente() + ": " + cliente1.getSaldo());
		System.out.println("Saldo Atual: " + cliente2.getCliente() + ": " + cliente1.getSaldo());
		
		
		
		
	}
}
