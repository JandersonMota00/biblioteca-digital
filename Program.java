/*
 * Crie um sistema de biblioteca digital com livros, autores e categorias. Os livros pertencem a autores, e cada livro pode ser classificado em uma ou mais categorias. Os usuários podem fazer pesquisas por autor ou categoria e visualizar os livros disponíveis.
 */

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       //  Livro meuLivro = new Livro("Redes de Computadores", null, "Edt Brasil", 2023);

        ArrayList<Livro> livros =  new ArrayList<>();

        Livro livro = new Livro();
        Autor autor =  new Autor("Leandro");
        Autor autor2 =  new Autor("Leandro2");
        
        livro.setAno(2022);
        livro.setEditora("Edit Brasil");
        livro.setTitulo("Historia do Brasil");
        livro.setAutor(autor2);
        
        livros.add(livro);

        livro = new Livro();
        
        livro.setAno(2023);
        livro.setEditora("Edit Terra Nova");
        livro.setTitulo("Sol e Lua");
        livro.setAutor(autor);
        
        livros.add(livro);
        //buscando livros de um autor com o nome Leandro
        for (Livro livr : livros) {
            if(livr.getAutor().getNome().equals("Leandro")){
                System.out.println("Ano: " + livr.getAno() + "\tCategoria: " + livr.getCategoria() + "\t\tEditora: "+livr.getEditora() + "\tTitulo: " + livr.getTitulo());
            }
        }

        for (Livro livr : livros) {
            if(livr.getCategoria().contains("categoria")){
                System.out.println("Ano: " + livr.getAno() + "\tCategoria: " + livr.getCategoria() + "\t\tEditora: "+livr.getEditora() + "\tTitulo: " + livr.getTitulo());
            }
        }
        
    }
}