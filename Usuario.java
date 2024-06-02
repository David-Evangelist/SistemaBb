    import java.util.Date;

    public class Usuario extends Pessoa {

        //Atributos
        private int idUsuario;
        private Date dataCadastro;

        //Construtor
        public Usuario(String nome, Date dataNasc, String cpf, String rg, String telefone, String email, String cep, String cidade,
                       String bairro, String logradouro, int idUsuario, Date dataCadastro) {

            super(nome, dataNasc, cpf, rg, telefone, email, cep, cidade, bairro, logradouro);

            this.idUsuario = idUsuario;
            this.dataCadastro = dataCadastro;
        }

        //Métodos
        public int getIdUsuario() {
            return idUsuario;
        }
        public void setIdUsuario(int idUsuario) {
            this.idUsuario= idUsuario;
        }

        public Date getDataCadastro() {
            return dataCadastro;
        }
        public void setDataCadastro(Date dataCadastro) {
            this.dataCadastro= dataCadastro;
        }

    }
