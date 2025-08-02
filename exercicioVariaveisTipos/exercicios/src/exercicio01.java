public class exercicio01 {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        boolean eEstudante = true;

        System.out.println(String.format("""
                Nome: %s
                Idade: %d
                Altura: %2f
                É estudante: %b
                """, nome, idade, altura, eEstudante));
    }
}
