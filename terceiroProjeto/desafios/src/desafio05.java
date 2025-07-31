import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroUsuario = 0;

        System.out.println("""
                *******************************************
                
                Insira um número aleatório para 
                saber se ele é par ou ímpar:
                
                *******************************************
                """);

        numeroUsuario = leitura.nextInt();

        if (numeroUsuario % 2 == 0) {
            System.out.println(String.format("O número %s é par.", numeroUsuario));
        } else {
            System.out.println(String.format("O número %s é ímpar.", numeroUsuario));
        }
    }
}
