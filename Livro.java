import java.util.Date;

public class Livro {

    //Atributos
    private String titulo;
    private String autor;
    private String categoria;
    private Date ano;
    private String situacao;
    private int tombo;

    //Construtor
    public Livro(String titulo, String autor, String categoria, Date ano, String situacao, int tombo) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ano = ano;
        this.situacao = situacao;
        this.tombo = tombo;
    }

    //Métodos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getAno() {
        return ano;
    }
    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getTombo() {
        return tombo;
    }
    public void setTombo(int tombo) {
        this.tombo = tombo;
    }
}
