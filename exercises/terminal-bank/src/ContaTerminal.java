import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Receber dados do usuário
    System.out.print("Por favor, digite o número da Agência: ");
    String agencia = scanner.nextLine();

    System.out.print("Por favor, digite o número da Conta: ");
    int numero = scanner.nextInt();

    scanner.nextLine();  // Limpar o buffer do scanner

    System.out.print("Por favor, digite o Nome do Cliente: ");
    String nomeCliente = scanner.nextLine();

    System.out.print("Por favor, digite o Saldo: ");
    double saldo = scanner.nextDouble();

    // Exibir a mensagem com as informações
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo fr R$" + saldo + " já está disponível para saque.");

    // Fechar o scanner
    scanner.close();
  }
}
