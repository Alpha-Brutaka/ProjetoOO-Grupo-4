import java.net.PortUnreachableException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeSocial;
    private List <PessoaFisica> pessoasF;
    public PessoaJuridica(String nomecompleto, String email, String telefone, Endereco endereco, String cnpj, String nomeSocial, List pessoasF) {
        super(nomecompleto, email, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeSocial = nomeSocial;
        this.pessoasF = pessoasF;
    }
 
    public void imprimirFuncionarios(){
        for(Pessoa a : pessoasF){
            System.out.println(a.getNome());
        }
    }

    public Pessoa pesquisarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar funcionário por Nome, CPF ou Email:");
        String pesquisa = sc.nextLine();
        while(pesquisa.isEmpty()){
        try{
        if(pesquisa.isEmpty()){
        throw new CampoEmBrancoException(pesquisa);  
        }} catch (CampoEmBrancoException e ){ }
        pesquisa = sc.nextLine();}
        boolean re = false;
        Pessoa resposta = null; 
           for (Pessoa t : pessoasF){
               //para pesquisa por nome
                if(t.getNome().equalsIgnoreCase(pesquisa)){
                    resposta = t;
                    re = true;
                    break;
                }
                //para pesquisa por Email
                if(t.getEmail().equalsIgnoreCase(pesquisa)){
                    resposta = t;
                    re = true;
                    break;
                }
                //pesquisa por cpf
                Endereco endereco = t.getEndereco(); 
                PessoaFisica pft = new PessoaFisica("", "" ,"",endereco, "", "");
                if(t.getClass() == pft.getClass()){
                    pft = (PessoaFisica)t;
                    if(pft.getCpf().equalsIgnoreCase(pesquisa)){
                        resposta = pft;
                        re = true;
                        break;
                    }
                }
           }
           try{
            if(resposta == null){
                re = false;
                throw new CObjetoNaoEncontradoException(pesquisa);  
                }}catch (CObjetoNaoEncontradoException e ){}
            if(resposta != null){
                System.out.println("Pessoa encontrada!!!\n" +"Nome Completo: "+ resposta.getNome() + "\nEmail: " + resposta.getEmail()+"\n");
            }
        return resposta;
    } 

    public String getCnpj(){
        return this.cnpj;
    }
}


