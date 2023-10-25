import java.util.ArrayList;

public class Livro {

    public int id;


    public String titulo;
    public ArrayList<Catrgorias> categoria;
    public String editora;
    public int ano;

    Autor autor;

    public Livro() { //Construtor

    }    




 public ArrayList<Catrgorias> getCategoria() {
        return categoria;
    }


    public void setCategoria(ArrayList<Catrgorias> categoria) {
        this.categoria = categoria;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
