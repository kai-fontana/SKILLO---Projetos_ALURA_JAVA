/* import java.util.Scanner;

public class desafio06 {
    public int fatorialInterativo(int n){
        Scanner leitura = new Scanner(System.in);
        int numeroUsuarioFatorial = 1;

        System.out.println("""
                *******************************************
                
                Insira um número para 
                saber o fatorial dele:
                
                *******************************************
                """);
        numeroUsuarioFatorial = leitura.nextInt();

        for (int i = 1; i <= n; i++) {
            numeroUsuarioFatorial = numeroUsuarioFatorial * i;
        }
        return System.out.println(String.format("%s! = %s", numeroUsuarioFatorial, numeroUsuarioFatorial));
    }
}
*/

