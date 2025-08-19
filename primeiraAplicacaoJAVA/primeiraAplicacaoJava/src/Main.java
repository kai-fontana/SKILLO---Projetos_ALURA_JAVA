public class Main {
    public static void main(String[] args) {
        //Comentários
        System.out.println("Esse é o Screen Match!");
        System.out.printf("Filme: Elementos");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme:
                Elementos
                
                Descrição:
                Em uma cidade onde os habitantes de fogo, água, terra e ar convivem, uma
                jovem mulher flamejante e um rapaz que vive seguindo o fluxo descobrem algo
                surpreendente, porém elementar: o quanto eles têm em comum.
                
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
        }
}
