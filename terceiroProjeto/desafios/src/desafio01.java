import java.util.Scanner;

public class desafio01 {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            int numeroUsuario = 0;
            System.out.println("Escolha um número aleatório: ");
            numeroUsuario = leitura.nextInt();
            if (numeroUsuario >= 0) {
                System.out.println(String.format("O número %d é positivo", numeroUsuario));
            } else {
                System.out.println(String.format("O número %d é negativo.", numeroUsuario));
            }

    }

}
