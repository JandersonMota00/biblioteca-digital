public class Pesquisar {
    String encontrar;

    Autor autor;
    Livro livro;

    autor.getNome(encontrar);

    //if(autor.getNome() != null){}

    public Pesquisar(String encontrar) { //Construtor
        this.encontrar = encontrar;
    }

    public String getEncontrar() {
        return this.encontrar;
    }

    public void setEncontrar(String encontrar) {
        this.encontrar = encontrar;
    }

    public static void verificaSeAutorExiste() {
        //this.autor = Autor.getNome();
    }
}
