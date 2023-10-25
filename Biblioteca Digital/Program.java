/*
 * Crie um sistema de biblioteca digital com livros, autores e categorias. Os livros pertencem a autores, e cada livro pode ser classificado em uma ou mais categorias. Os usuários podem fazer pesquisas por autor ou categoria e visualizar os livros disponíveis.
 */

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       //  Livro meuLivro = new Livro("Redes de Computadores", null, "Edt Brasil", 2023);

        ArrayList<Livro> livros =  new ArrayList<>();

        Livro livro = new Livro();
        
        livro.setAno(2022);
        livro.setCategoria(null);
        livro.setEditora("Edit Brasil");
        livro.setTitulo("Historia do Brasil");
        
        livros.add(livro);

        livro = new Livro();
        
        livro.setAno(2023);
        livro.setCategoria(null);
        livro.setEditora("Edit Terra Nova");
        livro.setTitulo("Sol e Lua");
        
        livros.add(livro);

        for (Livro livr : livros) {
            System.out.println("Ano: " + livr.getAno() + "\tCategoria: " + livr.getCategoria() + "\t\tEditora: "+livr.getEditora() + "\tTitulo: " + livr.getTitulo());
        }
    }
}