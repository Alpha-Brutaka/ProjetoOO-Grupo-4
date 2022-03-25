public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeSocial;
    private PessoaFisica pessoasF;
    public PessoaJuridica(String nomecompleto, String email, String telefone, Endereco endereco, String cnpj, String nomeSocial, PessoaFisica pessoasF) {
        super(nomecompleto, email, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeSocial = nomeSocial;
        this.pessoasF = pessoasF;

    }
    
}


