public class exercicio05 {
    public static void main(String[] args) {
        String titulo = "O Pequeno Princípe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroDePaginas = 96;
        double precoDoLivro = 39.99;

        char categoria = 'F';
        String categoriaDescricao;

        if (categoria ==
        'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H'){
            categoriaDescricao = "História";
        } else {
            System.out.println("Categoria inválida");
        }


        System.out.println(String.format("""
                Livro cadastrado: "%s", de %s.
                Ele possui %d páginas, custa %f
                e pertence à categoria %s
                """, titulo, autor, numeroDePaginas, precoDoLivro, precoDoLivro, categoriaDescricao));
}
}
