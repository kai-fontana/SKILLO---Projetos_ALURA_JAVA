import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.nome = "Procurando Nemo";
        meuFilme2.anoDeLancamento = 2003;
        meuFilme2.duracaoEmMinutos = 180;

        System.out.println(meuFilme2.nome);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

    }
}

//Identação
//CTRL + 1 = SELECIONAR TUDO
// CTRL + ALT + I i