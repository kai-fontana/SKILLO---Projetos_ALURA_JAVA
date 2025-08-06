public class Principal {
    public static void main(String[] args) {

        //Objeto da classe Pessoa
        Pessoa textoEspecifico = new Pessoa();

        textoEspecifico.textoOlaMundo = "Olá, mundo!";
        textoEspecifico.exibirNaTela();

        //Objeto da classe Pessoa
        Calculadora dobrandoNumero = new Calculadora();

        dobrandoNumero.dobroDoNumero(2, 10);

    }
}
