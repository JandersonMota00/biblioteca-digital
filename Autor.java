import java.util.ArrayList;

public class Autor {

    
    public int id;
    public String nome;
    public ArrayList <Livro> livros;
    


    public Autor() { //Construtor
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }


    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
