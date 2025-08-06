public class Pessoas {

    //Atributos
    String nome;
    int idade;
    boolean cnh;
    String carreiraProfissional;

    //Métodos
    void dirigirUmCarro(boolean carro) {
        if (cnh && carro) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Ainda não pode dirigir");
        }
    }
}

    /*
     void trabalharComProgramacao() {
        String = "Desenvolvedor Back-end JAVA";
    }
    */