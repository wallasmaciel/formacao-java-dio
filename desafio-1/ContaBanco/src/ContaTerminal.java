import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        try {
            System.out.println("Por favor, digite o seu número da conta!");
            conta.setNumero(Integer.parseInt(scan.nextLine()));
            System.out.println("Qual a Agência?");
            conta.setAgencia(scan.nextLine());
            System.out.println("Qual o seu nome?");
            conta.setNomeCliente(scan.nextLine());
            System.out.println("Qual o seu saldo?");
            conta.setSaldo(Double.parseDouble(scan.nextLine()));

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
