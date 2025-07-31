import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senhaOficial = "SKILLO123456";
        String senhaUsuario = "";

        System.out.println("""
                *******************************************
                
                Insira a sua senha:
                
                *******************************************
                """);

        senhaUsuario = leitura.nextLine();

        while (!senhaUsuario.equals(senhaOficial)) {
            System.out.println("""
               *******************************************
                    
               Acesso negado ❌
                    
               *******************************************
               """);

            System.out.println("""
                *******************************************
                
                Insira novamente a sua senha:
                
                *******************************************
                """);
            senhaUsuario = leitura.nextLine();

        }
        if (senhaUsuario.equals(senhaOficial)) {
            System.out.println("""
               *******************************************
                    
               Acesso permitido ✅
                    
               *******************************************
               """);
        }

    }
}