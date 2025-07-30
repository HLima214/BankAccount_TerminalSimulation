import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Criando a classe Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao JavaBank!");

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt(); // Lê o número da conta como um inteiro

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // Permite nome completo

        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        // Exibindo os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");

        
        
    }
}