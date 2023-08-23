import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = Integer.parseInt(scan.nextLine());
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = Integer.parseInt(scan.nextLine());

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++)
            System.out.printf("Imprimindo o número %d\n", (i + 1));
    }
}
