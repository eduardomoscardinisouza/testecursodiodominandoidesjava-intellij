package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
        /*int a = 3;
        int b = 5;
        System.out.println("Hello World! " + (a+b));*/
    }
}
    class Livro{
        private String nome;
        private Integer NumPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            NumPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return NumPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            NumPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", NumPaginas=" + NumPaginas +
                    '}';
        }
    }