import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoUsuario = 0;
        System.out.println("""
                **************************************
                Digite abaixo como deseja prosseguir:
                
                1. Calcular área do quadrado;
                2. Calcular área do círculo;
                
                **************************************
                """);
        opcaoUsuario = leitura.nextInt();

        if (opcaoUsuario == 1) {
            int ladoQuadrado = 5;
            int areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println(String.format("""
        **************************************
        Vamos calcular a área do quadrado:
        
        Área = lado²;
        Lado = 5cm;
        Resultado = %scm;
        
        **************************************
        """, areaQuadrado));
        } else if (opcaoUsuario == 2) {
            int raioCirculo = 5;
            double areaCirculo =  Math.PI * (raioCirculo * raioCirculo);
            System.out.println(String.format("""
        **************************************
        Vamos calcular a área do círculo:
        
        Área = π * raio²;
        Raio = %scm;
        Resultado = %scm²;
        
        **************************************
        """, raioCirculo, areaCirculo));
        } else {
            System.out.println("""
        **************************************
        
        O valor inserido é inválido! 
        Tente novamente!
        
        **************************************
        """);
        }
    }
}
