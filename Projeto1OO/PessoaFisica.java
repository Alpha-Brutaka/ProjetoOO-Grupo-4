import java.util.Scanner;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String estadoCivil;



    public PessoaFisica(String nomecompleto, String email, String telefone, Endereco endereco, String cpf, String estadoCivil) {
        super(nomecompleto, email, telefone, endereco);
        this.cpf = cpf;
        this.estadoCivil =  estadoCivil;
    }
    
}
