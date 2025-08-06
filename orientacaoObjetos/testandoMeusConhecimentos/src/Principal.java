public class Principal {
    /*Criando um objeto e definindo valores para os atributos e assim executando metodo*/
    public static void main(String[] args) {
        Pessoas kai = new Pessoas();

        kai.nome = "Kai";
        kai.idade = 20;
        kai.carreiraProfissional = "Desenvolvedor Back-end JAVA";
        kai.cnh = false;

        kai.dirigirUmCarro(true);
        System.out.println(kai.nome);
        System.out.println(kai.idade);
    }
}
