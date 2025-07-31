import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numerosUsuario = 0;
        int somaNumerosUsuario = 0;

        while (somaNumerosUsuario <= 100) {
            System.out.println("""
                *******************************************
                
                Insira um número aletório:
                
                *******************************************
                    """);
            numerosUsuario = leitura.nextInt();
            somaNumerosUsuario = numerosUsuario + numerosUsuario;

            if (somaNumerosUsuario >= 100) {
                System.out.println(String.format("""
                *******************************************
                
                A soma total dos seus números foi de: %s
                
                *******************************************
                        """, somaNumerosUsuario));
            }
        }
    }
}
