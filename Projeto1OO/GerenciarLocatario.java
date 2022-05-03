
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GerenciarLocatario {
    private List <Pessoa> pessoas;

    
    public GerenciarLocatario(){
        this.pessoas = new LinkedList<Pessoa>();
    }
    public List getPessoas(){
        return pessoas;
    }

    public boolean cadastrarPessoaJuridica(){
        boolean re = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome completo");
        String nomeCompleto = sc.nextLine();
        while(nomeCompleto.isEmpty()){
        try{
        if(nomeCompleto.isEmpty()){
        throw new CampoEmBrancoException(nomeCompleto);  
        }} catch (CampoEmBrancoException e ){ }
        nomeCompleto = sc.nextLine();}
        System.out.println("Insira seu Email");
        String email = sc.nextLine();
        while(email.isEmpty()){
        try{
        if(email.isEmpty()){
        throw new CampoEmBrancoException(email);  
        }} catch (CampoEmBrancoException e ){ }
        email = sc.nextLine();}
        System.out.println("Insira seu numero de telefone");
        String telefone = sc.nextLine();
        while(telefone.isEmpty()){
        try{
        if(telefone.isEmpty()){
        throw new CampoEmBrancoException(telefone);  
        }} catch (CampoEmBrancoException e ){ }
        telefone = sc.nextLine();}
        System.out.println("Insira o nome de sua Rua");
        String rua = sc.nextLine();
        while(rua.isEmpty()){
        try{
        if(rua.isEmpty()){
        throw new CampoEmBrancoException(rua);  
        }} catch (CampoEmBrancoException e ){ }
        rua = sc.nextLine();}
        System.out.println("Insira o número");
        String numero = sc.nextLine();
        while(numero.isEmpty()){
        try{
        if(numero.isEmpty()){
        throw new CampoEmBrancoException(numero);  
        }} catch (CampoEmBrancoException e ){ }
        numero = sc.nextLine();}
        System.out.println("Insira seu Bairro");
        String bairro = sc.nextLine();
        while(bairro.isEmpty()){
        try{
        if(bairro.isEmpty()){
        throw new CampoEmBrancoException(bairro);  
        }} catch (CampoEmBrancoException e ){ }
        bairro = sc.nextLine();}
        System.out.println("Insira sua Cidade");
        String cidade = sc.nextLine();
        while(cidade.isEmpty()){
        try{
        if(cidade.isEmpty()){
        throw new CampoEmBrancoException(cidade);  
        }} catch (CampoEmBrancoException e ){ }
        cidade = sc.nextLine();}
        System.out.println("Insira seu Estado");
        String estado = sc.nextLine();
        while(estado.isEmpty()){
        try{
        if(estado.isEmpty()){
        throw new CampoEmBrancoException(estado);  
        }} catch (CampoEmBrancoException e ){ }
        estado = sc.nextLine();}
        System.out.println("Insira seu CEP");
        String cep = sc.nextLine();
        while(cep.isEmpty()){
        try{
        if(cep.isEmpty()){
        throw new CampoEmBrancoException(cep);  
        }} catch (CampoEmBrancoException e ){ }
        cep = sc.nextLine();}
        System.out.println("Insira seu CNPJ");
        String cnpj = sc.nextLine();
        while(cnpj.isEmpty()){
        try{
        if(cnpj.isEmpty()){
        throw new CampoEmBrancoException(cnpj);  
        }} catch (CampoEmBrancoException e ){ }
        cnpj = sc.nextLine();}
        System.out.println("Insira seu nome Social");
        String nomeSocial = sc.nextLine();
        while(nomeSocial.isEmpty()){
        try{
        if(nomeSocial.isEmpty()){
        throw new CampoEmBrancoException(nomeSocial);  
        }} catch (CampoEmBrancoException e ){ }
        nomeSocial = sc.nextLine();}
        System.out.println("Deseja cadastrar quantos funcionários?");
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        PessoaJuridica pessoaj;
        String nn = sc.nextLine();
        while(nn.isEmpty() | nn.matches("[a-zA-Z]+") ){
        try{
        if(nn.isEmpty()){
        throw new CampoEmBrancoException(nn);  
        }} catch (CampoEmBrancoException e ){ }
        try{
        if(nn.matches("[a-zA-Z]+")){
        throw new DigitosException(nn);  
        }} catch (DigitosException e ){ }
        if(nn.matches("[a-zA-Z]+") |nn.isEmpty()){
        nn = sc.nextLine();}
        }
        int n = Integer.parseInt(nn);
        List <PessoaFisica> pessoasF = new LinkedList<PessoaFisica>();
        for(int i = 0; i < n; i++){
            System.out.println("Proximo cadastro:\n");
            PessoaFisica temppessoa = this.cadastrarPessoaFisica();
            pessoasF.add(temppessoa);
        }
        pessoaj = new PessoaJuridica(nomeCompleto, email, telefone, endereco, cnpj, nomeSocial, pessoasF);
        pessoas.add(pessoaj);
        

        return true;

    }



    public PessoaFisica cadastrarPessoaFisica(){
        boolean re = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome completo");
        String nomeCompleto = sc.nextLine();
        while(nomeCompleto.isEmpty()){
        try{
        if(nomeCompleto.isEmpty()){
        throw new CampoEmBrancoException(nomeCompleto);  
        }} catch (CampoEmBrancoException e ){ }
        nomeCompleto = sc.nextLine();}
        System.out.println("Insira seu Email");
        String email = sc.nextLine();
        while(email.isEmpty()){
        try{
        if(email.isEmpty()){
        throw new CampoEmBrancoException(email);  
        }} catch (CampoEmBrancoException e ){ }
        email = sc.nextLine();}
        System.out.println("Insira seu numero de telefone");
        String telefone = sc.nextLine();
        while(telefone.isEmpty()){
        try{
        if(telefone.isEmpty()){
        throw new CampoEmBrancoException(telefone);  
        }} catch (CampoEmBrancoException e ){ }
        telefone = sc.nextLine();}
        System.out.println("Insira o nome de sua Rua");
        String rua = sc.nextLine();
        while(rua.isEmpty()){
        try{
        if(rua.isEmpty()){
        throw new CampoEmBrancoException(rua);  
        }} catch (CampoEmBrancoException e ){ }
        rua = sc.nextLine();}
        System.out.println("Insira o número");
        String numero = sc.nextLine();
        while(numero.isEmpty()){
        try{
        if(numero.isEmpty()){
        throw new CampoEmBrancoException(numero);  
        }} catch (CampoEmBrancoException e ){ }
        numero = sc.nextLine();}
        System.out.println("Insira seu Bairro");
        String bairro = sc.nextLine();
        while(bairro.isEmpty()){
        try{
        if(bairro.isEmpty()){
        throw new CampoEmBrancoException(bairro);  
        }} catch (CampoEmBrancoException e ){ }
        bairro = sc.nextLine();}
        System.out.println("Insira sua Cidade");
        String cidade = sc.nextLine();
        while(cidade.isEmpty()){
        try{
        if(cidade.isEmpty()){
        throw new CampoEmBrancoException(cidade);  
        }} catch (CampoEmBrancoException e ){ }
        cidade = sc.nextLine();}
        System.out.println("Insira seu Estado");
        String estado = sc.nextLine();
        while(estado.isEmpty()){
        try{
        if(estado.isEmpty()){
        throw new CampoEmBrancoException(estado);  
        }} catch (CampoEmBrancoException e ){ }
        estado = sc.nextLine();}
        System.out.println("Insira seu CEP");
        String cep = sc.nextLine();
        while(cep.isEmpty()){
        try{
        if(cep.isEmpty()){
        throw new CampoEmBrancoException(cep);  
        }} catch (CampoEmBrancoException e ){ }
        cep = sc.nextLine();}
        System.out.println("Insira seu CPF");
        String cpf = sc.nextLine();
        while(cpf.isEmpty()){
        try{
        if(cpf.isEmpty()){
        throw new CampoEmBrancoException(cpf);  
        }} catch (CampoEmBrancoException e ){ }
        cpf = sc.nextLine();}
        System.out.println("Insira seu Estado Civil: Solteiro/Casado");
        String estadoCivil = sc.nextLine();
        while(estadoCivil.isEmpty()){
        try{
        if(estadoCivil.isEmpty()){
        throw new CampoEmBrancoException(estadoCivil);  
        }} catch (CampoEmBrancoException e ){ }
        estadoCivil = sc.nextLine();}
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        PessoaFisica pessoaf = new PessoaFisica(nomeCompleto, email, telefone, endereco, cpf, estadoCivil);
        re = pessoas.add(pessoaf);
        System.out.println("Pessoa cadastrada\n\n");
        return pessoaf;
    }


    public boolean alteraLocatario(){
        Pessoa locatario = this.pesquisarLocatario();
        boolean tf = this.pesquisarLocatarioTF(locatario);
            if(tf){
                System.out.println("O que deseja alterar?\n 1) Email\n 2) Endereço\n 3) Telefone\n 4) Estado Civil");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                switch(n){
                    case 1:
                        System.out.println("Insira o novo Email:");
                        String email = sc.nextLine();
                        while(email.isEmpty()){
                        try{
                        if(email.isEmpty()){
                        throw new CampoEmBrancoException(email);  
                        }} catch (CampoEmBrancoException e ){ }
                        email = sc.nextLine();}
                        locatario.setEmail(email);
                        break;
                    case 2:
                        
                        locatario.setEndereço();
                        break;
                    case 3:
                        System.out.println("Insira o novo Telefone:");
                        String telefone = sc.nextLine();
                        while(telefone.isEmpty()){
                        try{
                        if(telefone.isEmpty()){
                        throw new CampoEmBrancoException(telefone);  
                        }} catch (CampoEmBrancoException e ){ }
                        telefone = sc.nextLine();}
                        locatario.setTelelfone(telefone);
                        break;
                    case 4:
                        System.out.println("Insira o novo EstadoCivil:");
                        String estadoCivil = sc.nextLine();
                        while(estadoCivil.isEmpty()){
                        try{
                        if(estadoCivil.isEmpty()){
                        throw new CampoEmBrancoException(estadoCivil);  
                        }} catch (CampoEmBrancoException e ){ }
                        estadoCivil = sc.nextLine();}
                        PessoaFisica a = (PessoaFisica)locatario; 
                        a.setEstadoCivil(estadoCivil);
                        locatario = a; 
                        break;
                }
            }
        return true;
    }

    private boolean pesquisarLocatarioTF(Pessoa p){
        String pesquisa  = "";
        if(p!= null){
            pesquisa = p.getNome();
        }
        Pessoa resposta = null;
        boolean re = false;
        for(Pessoa t : pessoas){
            if(t.getNome().equalsIgnoreCase(pesquisa)){
                resposta = t;
                re = true;
                break;
            }
            if(t.getEmail().equalsIgnoreCase(pesquisa)){
                resposta = t;
                re = true;
                break;
            }
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
            List <PessoaFisica> l = new LinkedList<PessoaFisica>();
            PessoaJuridica pjt = new PessoaJuridica("", "", "", endereco, "", "",l);
            if(t.getClass() == pjt.getClass()){
                pjt = (PessoaJuridica)t;
                if(pjt.getCnpj().equalsIgnoreCase(pesquisa)){
                    resposta = pjt;
                    re = true;
                    break;
                }

            }
        }
        return re;

    }
    public boolean excluirLocatario(){
        Pessoa exclocatario = this.pesquisarLocatario();
        boolean tf = this.pesquisarLocatarioTF(exclocatario);
        pessoas.remove(exclocatario);
        if(tf){
            pessoas.remove(exclocatario);
            System.out.println("Pessoa Excluida com sucesso!!!");
        }        
        return true;
    }


    public Pessoa pesquisarLocatario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar por Nome, CPF, CNPJ ou Email:");
        String pesquisa = sc.nextLine();
        while(pesquisa.isEmpty()){
        try{
        if(pesquisa.isEmpty()){
        throw new CampoEmBrancoException(pesquisa);  
        }} catch (CampoEmBrancoException e ){ }
        pesquisa = sc.nextLine();}
        boolean re = false;
        Pessoa resposta = null; 
           for (Pessoa t : pessoas){
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
                List <PessoaFisica> l = new LinkedList<PessoaFisica>();
                PessoaJuridica pjt = new PessoaJuridica("", "", "", endereco, "", "",l);
                if(t.getClass() == pjt.getClass()){
                    pjt = (PessoaJuridica)t;
                    if(pjt.getCnpj().equalsIgnoreCase(pesquisa)){
                        resposta = pjt;
                        re = true;
                        break;
                    }

                }
                
            }
            if(resposta != null){
                System.out.println("Pessoa encontrada!!!\n" +"Nome Completo: "+ resposta.getNome() + "\nEmail: " + resposta.getEmail()+"\n");
            }
            else{try{
                if(resposta == null){
                    re = false;
                    throw new CObjetoNaoEncontradoException(pesquisa);  
                    }}catch (CObjetoNaoEncontradoException e ){}}
            



        return resposta;
    }
                 
}
