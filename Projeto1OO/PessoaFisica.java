public class PessoaFisica extends Pessoa{
    private String cpf;
    private String estadoCivil;



    public PessoaFisica(String nomecompleto, String email, String telefone, Endereco endereco, String cpf, String estadoCivil) {
        super(nomecompleto, email, telefone, endereco);
        this.cpf = cpf;
        this.estadoCivil =  estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
        System.out.println("Estado Civil modificado com sucesso !!!");
    }

    public String getCpf() {
        return this.cpf;
    }


    public String getEstadoCivil(){
        return this.estadoCivil;
    }
}
