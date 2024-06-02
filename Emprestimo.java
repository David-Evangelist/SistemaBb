import java.util.Date;

public class Emprestimo {

    //Atributos
    private int codReserva;
    private Livro livro;
    private Usuario usuario;
    private Date dataReserva;
    private Date dataDevolucao;

    //Construtor
    public Emprestimo(int codReserva, Livro livro, Usuario usuario, Date dataReserva, Date dataDevolucao) {
        this.codReserva = codReserva;
        this.livro = livro;
        this.usuario = usuario;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
    }

    //Métodos
    public int getCodReserva() {
        return codReserva;
    }
    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataReserva() {
        return dataReserva;
    }
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
