
public class App {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Wallas");

		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
