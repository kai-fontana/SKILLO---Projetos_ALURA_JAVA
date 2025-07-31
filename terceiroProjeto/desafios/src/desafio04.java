import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroUsuario = 0;

        System.out.println("""
   *********************************************************
                
                Insira um número aleatório para 
                saber a tabuada de 1 a 10:
                
  *********************************************************
                """);
        numeroUsuario = leitura.nextInt();

       for (int i = 0; i <= 10; i++) {
           int tabuadaNumero = numeroUsuario + i;
           System.out.println(String.format("""
                   Tabuada de %s: 
                   %s + %s = %s
                   """, numeroUsuario, numeroUsuario, i, tabuadaNumero));
       }
    }
}
