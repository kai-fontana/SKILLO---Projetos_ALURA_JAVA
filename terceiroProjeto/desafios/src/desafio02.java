import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroUsuario1 = 0;
        System.out.println("Insira um número aleatório: ");
        numeroUsuario1 = leitura.nextInt();

        int numeroUsuario2 = 0;
        System.out.println("Insira outro número aleatório: ");
        numeroUsuario2 = leitura.nextInt();

        if (numeroUsuario1 == numeroUsuario2) {
            System.out.println(String.format("Os números %s e %s são iguais.", numeroUsuario1, numeroUsuario2));
        } else {
            System.out.println(String.format("Os números %s e %s são diferentes.", numeroUsuario1, numeroUsuario2));
        }

        if (numeroUsuario1 > numeroUsuario2) {
            System.out.println(String.format("O primeiro número %s é maior que o segundo número %s.", numeroUsuario1, numeroUsuario2));
        } else if (numeroUsuario1 == numeroUsuario2) {
            System.out.println(String.format("O primeiro número %s e o segundo número %s são iguais.", numeroUsuario1, numeroUsuario2));
        } else {
            System.out.println(String.format("O segundo número %s é maior que o primeiro número %s.", numeroUsuario2, numeroUsuario1));
        }
    }

}
