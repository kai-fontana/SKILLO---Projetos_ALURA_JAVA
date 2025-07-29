

public class Main {
    public static void main(String[] args) {
        // Faça como eu fiz: Conversão de temperaturas
        System.out.println("Sistema conversor de graus Celsius para Fahrenheit: ");
        int temperatura = 14;
        double conversorDeTemperatura = (temperatura * 1.8) + 32;
        System.out.println(conversorDeTemperatura);

        // Desafio 01 -> Média de 2 notas decimais

        double notaUm = 8.6;
        double notaDois = 9.2;
        double mediaDasNotas = (notaUm + notaDois) / 2;
        System.out.println("Média das notas: " + mediaDasNotas);

        // Desafio 02 -> Fazer um casting de double para int
        double variavelDouble = 5.6;
        int variavelInt = (int) variavelDouble;
        System.out.println(variavelInt);

        // Desafio 03:
        char variavelChar = 'A';
        String variavelString = "A nota obtida por Jack foi: ";
        String mensagem = variavelString + variavelChar;
        System.out.println(mensagem);

        //Desafio 04
        double precoProduto = 52.8;
        int quantidadeProduto = 10;
        double valorTotal = precoProduto * quantidadeProduto;
        System.out.println(valorTotal);

        //Desafio 05
        double valorEmDolares = 4.94;
        int valorEmReais = 5;
        int conversaoDeDinheiro = (int) valorEmDolares * valorEmReais;
        System.out.println("O valor obtido em dólares dos R$5 foi de: " + conversaoDeDinheiro);

        //Desafio 06
        double precoOriginal = 20;
        double porcentagem = 0.5;
        double percentualDesconto = precoOriginal * porcentagem;
        double precoDesconto = precoOriginal - percentualDesconto;
        System.out.println("O valor com desconto é de:" + precoDesconto);



    }
}




