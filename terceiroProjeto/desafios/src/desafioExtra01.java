import java.util.Scanner;

public class desafioExtra01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senhaOficial = "SKILLO123456";
        String senhaUsuario = " ";

        System.out.println("""
                *******************************************
                
                Insira a sua senha:
                
                *******************************************
                """);

        while (senhaUsuario != senhaOficial) {
            senhaUsuario = leitura.nextLine();
        }

    }
}
