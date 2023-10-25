/*
 * Crie um sistema de biblioteca digital com livros, autores e categorias. Os livros pertencem a autores, e cada livro pode ser classificado em uma ou mais categorias. Os usuários podem fazer pesquisas por autor ou categoria e visualizar os livros disponíveis.
 */

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       //  Livro meuLivro = new Livro("Redes de Computadores", null, "Edt Brasil", 2023);

        ArrayList<Livro> livros =  new ArrayList<>();
        Autor autor = new Autor();
        Pesquisar pesrqisarServico = new Pesquisar();

        Filtro filtro  = new  Filtro();

        // filtro.setNomeAutor("Joedson");
        filtro.setCategoria("LGBT");

        autor = pesrqisarServico.pesquisar02(filtro);

        if(autor != null){

            livros =autor.getLivros();

        // ler a lista e printa na tela
            for (Livro livr : livros) {
                System.out.println(livr.getAno()+" | "+livr.getCategoria()+" | "+livr.getEditora()+" | "+livr.getTitulo());
            }
          

        }else{
              System.out.println("Autor não existe");
        }



  
        
        
        
////        System.out.println("Título: " + meuLivro.getTitulo());
////        System.out.println("Categoria: " + meuLivro.getCategoria());
////        System.out.println(Livros.get(0));
    }
}