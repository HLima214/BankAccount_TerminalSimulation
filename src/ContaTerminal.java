import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao JavaBank!");

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // Permite nome completo

        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");

        
        
    }
}