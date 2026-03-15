import java.util.Scanner;

public class ContaBanco {
    Scanner input = new Scanner(System.in);
    int num;
    Double saldo;
    public static void main(String[]Args){
        new ContaBanco().App();
    }

    public void App(){
        System.out.print("Por favor, digite o número da agência: ");
        num = input.nextInt();
        input.nextLine();

        System.out.print("A agência: ");
        String ag = input.nextLine();

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.println("Saldo");
        saldo = input.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar a sua conta");
        System.out.println("sua agência é " + ag + ", conta " + num);
        System.out.println("seu saldo é de " + saldo + " já está disponível para saque");
    }

}
