import java.util.Scanner;
public class Pessoa{
    private String nomecompleto;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String nomecompleto, String email, String telefone, Endereco endereco){
        this.nomecompleto = nomecompleto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    public void setTelelfone(String telefone){
        this.telefone = telefone;
        System.out.println("Telefone modificado com sucesso !!!");
    }


    public void setEmail(String email){
        this.email = email;
        System.out.println("Email modificado com sucesso !!!");
    }


    public String getEmail() {
        return this.email;
    }


    public String getNome(){
        return this.nomecompleto;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }


    public void setEndereço(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome de sua Rua");
        String rua = sc.nextLine();
        while(rua.isEmpty()){
        try{
        if(rua.isEmpty()){
        throw new CampoEmBrancoException(rua);  
        }} catch (CampoEmBrancoException e ){ }
        rua = sc.nextLine();}
        this.endereco.setRua(rua);
        System.out.println("Insira o número");
        String numero = sc.nextLine();
        while(numero.isEmpty()){
        try{
        if(numero.isEmpty()){
        throw new CampoEmBrancoException(numero);  
        }} catch (CampoEmBrancoException e ){ }
        numero = sc.nextLine();}
        this.endereco.setNumero(numero);
        System.out.println("Insira seu Bairro");
        String bairro = sc.nextLine();
        while(bairro.isEmpty()){
        try{
        if(bairro.isEmpty()){
        throw new CampoEmBrancoException(bairro);  
        }} catch (CampoEmBrancoException e ){ }
        bairro = sc.nextLine();}
        this.endereco.setBairro(bairro);
        System.out.println("Insira sua Cidade");
        String cidade = sc.nextLine();
        while(cidade.isEmpty()){
        try{
        if(cidade.isEmpty()){
        throw new CampoEmBrancoException(cidade);  
        }} catch (CampoEmBrancoException e ){ }
        cidade = sc.nextLine();}
        this.endereco.setCidade(cidade);
        System.out.println("Insira seu Estado");
        String estado = sc.nextLine();
        while(estado.isEmpty()){
        try{
        if(estado.isEmpty()){
        throw new CampoEmBrancoException(estado);  
        }} catch (CampoEmBrancoException e ){ }
        estado = sc.nextLine();}
        this.endereco.setEstado(estado);
        System.out.println("Insira seu CEP");
        String cep = sc.nextLine();
        while(cep.isEmpty()){
        try{
        if(cep.isEmpty()){
        throw new CampoEmBrancoException(cep);  
        }} catch (CampoEmBrancoException e ){ }
        cep = sc.nextLine();}
        this.endereco.setCep(cep);
        System.out.println("Endereço alterado com sucesso !!!");
    }
}
