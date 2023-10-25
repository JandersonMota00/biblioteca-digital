import java.util.ArrayList;

public class Pesquisar {
    String encontrar;

    Autor autor;
    Livro livro;

    public Pesquisar() { //Construtor        
    }

    public Autor pesquisar02(Filtro filtro) {

        if(filtro.getNomeAutor() != null) {

            if(filtro.getNomeAutor().equalsIgnoreCase("Joedson")) {

                Autor autor = new Autor();

                autor.setNome("Joedson");

                ArrayList<Livro> livros =  new ArrayList<>();
                Livro livro = new Livro();

                livro.setAno(2022);

                ArrayList<Catrgorias> listarcategorias = new ArrayList<>();
                Catrgorias categorias = new Catrgorias();

                categorias.setNomeCategoria("Terror");
                listarcategorias.add(categorias);

                categorias = new Catrgorias();
                categorias.setNomeCategoria("LGBT");
                listarcategorias.add(categorias);

                livro.setCategoria(listarcategorias);
                livro.setEditora("Editora Janderson");
                livro.setTitulo("Teste 01");
                
                livros.add(livro);

                // declara/inicializa o objeto
                livro = new Livro();
                // carregar os valores nas variaveis SET
                livro.setAno(2023);
                livro.setCategoria(null);
                livro.setEditora("Editora Janderson  e outros");
                livro.setTitulo("Teste 02");
                // adciona o libro na lista
                livros.add(livro);
                autor.setLivros(livros);        

                return autor;
            }
        }

        if(filtro.getCategoria() != null) {

            Autor autor = new Autor();

            autor.setNome("Joedson");

            ArrayList<Livro> livros =  new ArrayList<>();
            Livro livro = new Livro();

            livro.setAno(2022);

            ArrayList<Catrgorias> listarcategorias =  new ArrayList<>();
            Catrgorias categorias = new Catrgorias();

            categorias.setNomeCategoria("Terror");
            listarcategorias.add(categorias);

            categorias = new Catrgorias();
            categorias.setNomeCategoria("LGBT");
            listarcategorias.add(categorias);

            livro.setCategoria(listarcategorias);
            livro.setEditora("Editora Janderson");
            livro.setTitulo("Teste 01");
            
            livros.add(livro);

            // declara/inicializa o objeto
            livro = new Livro();
            // carregar os valores nas variaveis SET
            livro.setAno(2023);
            livro.setCategoria(null);
            livro.setEditora("Editora Janderson  e outros");
            livro.setTitulo("Teste 02");
            // adciona o libro na lista
            livros.add(livro);

            autor.setLivros(livros);        

            for (Catrgorias categor : autor.getLivros().get(0).getCategoria()) {
                if(categor.getNomeCategoria().equalsIgnoreCase(filtro.getCategoria())) {
                    return autor;
                }
            }

            System.out.println("Não existe livros nesta categoria");
            return null;
        }
        return null;
    }

    public String getEncontrar() {
        return this.encontrar;
    }

    public void setEncontrar(String encontrar) {
        this.encontrar = encontrar;
    }
}
