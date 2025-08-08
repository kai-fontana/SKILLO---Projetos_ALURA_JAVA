package br.com.alura.exercicios03.carro.modelo;

public class ModeloCarro extends Carro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Onix");
        meuCarro.definirPreco(90.000, 110.000, 120.000);
        meuCarro.exibirInfo();
    }
}
