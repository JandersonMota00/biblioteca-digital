import java.util.ArrayList;

public class Livro {
    String titulo;
    ArrayList<String> categoria;
    String editora;
    int ano;

    Autor autor;

    public Livro() { //Construtor

    }    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getCategoria() {
        return this.categoria;
    }

    public void setCategoria(ArrayList<String> categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
