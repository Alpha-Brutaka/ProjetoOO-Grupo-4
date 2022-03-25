import java.util.Scanner;

public class GerenciarLocartario {
    private Pessoa pessoas[];
    private int clientes = 0;


    public GerenciarLocartario(int clientes){
        this.clientes = clientes;
        pessoas = new Pessoa[clientes-1];

    }
    public boolean cadastrarPessoaJuridica(){
        return true;

    }
    public void cadastrarPessoaFisica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome completo");
        String nomeCompleto = sc.nextLine();
        System.out.println("Insira seu Email");
        String email = sc.next();
        System.out.println("Insira seu nome telefone");
        String telefone = sc.next();
        System.out.println("Insira o nome de sua Rua");
        String rua = sc.next();
        System.out.println("Insira o número");
        String numero = sc.next() ;
        System.out.println("Insira seu Bairro");
        String bairro = sc.next();
        System.out.println("Insira sua Cidade");
        String cidade = sc.next();
        System.out.println("Insira seu Estado");
        String estado = sc.next();
        System.out.println("Insira seu CEP");
        String cep = sc.next();
        System.out.println("Insira seu CPF");
        String cpf = sc.next();
        System.out.println("Insira seu Estado Civil: Solteiro/Casado");
        String estadoCivil = sc.next();
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        Pessoa pessoa = new PessoaFisica(nomeCompleto, email, telefone, endereco, cpf, estadoCivil);
        this.pessoas[clientes-1] = pessoa;
        this.clientes--;
        System.out.println("Pessoa cadastrada");
    }


    public boolean alteraLocatario(){
        return true;
    }
    public boolean excluirLocatario(){
        return true;
    }
    public boolean pesquisarLocatario(){
        return true;
    }
}
