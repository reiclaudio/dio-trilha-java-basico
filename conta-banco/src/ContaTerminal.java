import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe scanner
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  

        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal
    System.out.println ("Por favor, digite o número da Agência: ");
    String agencia = scanner.next();

    System.out.println("Digite o numero da conta: ");
    int numero = scanner.nextInt();

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite o valor do seu saldo: ");
    double saldo = scanner.nextDouble();
        

        //Exibir a mensagem conta criada
        System.out.println("Olá "+ nome +",obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque.");
    }
}

