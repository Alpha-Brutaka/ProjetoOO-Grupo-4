import java.util.Scanner;



public class Main{
    public static void main(String[] args){
        GerenciarReservas gReservas = new GerenciarReservas();
        GerenciarLocatario gCadastro = new GerenciarLocatario();
        GerenciarVeiculo gVeiculo = new GerenciarVeiculo(); 
        Scanner sc = new Scanner(System.in);
        String opcoes = "0";
        int ter = 1;

        while(ter == 1){
            System.out.println("A) Gerenciar Locarários\nB) Gerenciar Frotas\nC) Gerenciar Reservas\nD) Sair do Programa");
            opcoes = sc.nextLine();
            while(opcoes.isEmpty()){
            try{
            if(opcoes.isEmpty()){
            throw new CampoEmBrancoException(opcoes);  
            }} catch (CampoEmBrancoException e ){ }
            opcoes = sc.nextLine();}
            switch(opcoes){
                //Sair do programa
                case "D":
                    ter = 0;
                    break;

                //Gerenciar Locatáios
                case "A":
                    System.out.println("Menu Gerencia Locatários:\n A) Cadastrar Locatário\n B) Buscar Locatário\n C) Alterar Locatáio\n D) Excluir Locatáio\n");
                    opcoes = sc.nextLine();
                    while(opcoes.isEmpty()){
                    try{
                    if(opcoes.isEmpty()){
                    throw new CampoEmBrancoException(opcoes);  
                    }} catch (CampoEmBrancoException e ){ }
                    opcoes = sc.nextLine();}
                    switch(opcoes){
                        // cadastrar locatario
                        case "A":
                            System.out.println("A) Pessoa Fisica\nB) Pessoa Jurídica");
                            opcoes = sc.nextLine();
                            while(opcoes.isEmpty()){
                            try{
                            if(opcoes.isEmpty()){
                            throw new CampoEmBrancoException(opcoes);  
                            }} catch (CampoEmBrancoException e ){ }
                            opcoes = sc.nextLine();}
                            switch(opcoes){
                                //pessoa fisica
                                case "A":
                                    gCadastro.cadastrarPessoaFisica();
                                    break;
                                //pessoa juridica
                                case "B":
                                    gCadastro.cadastrarPessoaJuridica();

                            }

                            break;
                        case "B":
                            gCadastro.pesquisarLocatario();
                            break;
                        case "C":
                            gCadastro.alteraLocatario();
                            break;
                        case "D":
                            gCadastro.excluirLocatario();
                    }
                    break;
                // Gerenciar Frotas
                case"B":
                    System.out.println("Menu Gerencia Frotas:\n A) Cadastrar Veículos\n B) Pesquisar veículos\n C) Atualizar dados de um veículo\n D) Remover veículo da frota\n");
                    opcoes = sc.nextLine();
                    while(opcoes.isEmpty()){
                    try{
                    if(opcoes.isEmpty()){
                    throw new CampoEmBrancoException(opcoes);  
                    }} catch (CampoEmBrancoException e ){ }
                    opcoes = sc.nextLine();}
                    switch(opcoes){
                        case "A":

                        //Cadastrar veiculos
                        System.out.println("Menu Cadastro Veículos\n A) Cadastrar veiculo de passeio\n B) Cadastrar veículo utilitário\n C) Cadastrar motocicleta");
                            opcoes = sc.nextLine();
                            while(opcoes.isEmpty()){
                            try{
                            if(opcoes.isEmpty()){
                            throw new CampoEmBrancoException(opcoes);  
                            }} catch (CampoEmBrancoException e ){ }
                            opcoes = sc.nextLine();};
                            switch(opcoes){
                                case "A":
                                    gVeiculo.cadastrarPasseio();
                                    break;
                                case "B":
                                    gVeiculo.cadastrarUtilitario();
                                    break;
                                case "C":
                                    gVeiculo.CadastrarMotocicleta();
                                    break;                                    
                            }
                            break;
                        //Menu pesquisa veiculos
                        case "B":
                            System.out.println("Menu Pesquisa de Veiculos\n A) Pesquisar veículo pelo Renavam\n");
                            opcoes = sc.nextLine();
                            while(opcoes.isEmpty()){
                            try{
                            if(opcoes.isEmpty()){
                            throw new CampoEmBrancoException(opcoes);  
                            }} catch (CampoEmBrancoException e ){ }
                            opcoes = sc.nextLine();}
                            switch(opcoes){
                                case "A":
                                    gVeiculo.pesquisarVeiculo();
                                    break;
                            }
                            break;
                        //Atualizar dados de um veiculo
                        case "C":
                            gVeiculo.alterarVeiculo();
                            break;
                        //Remover veículo da frota
                        case "D":
                        gVeiculo.excluirVeiculo();
                            break;
                    }
                    break;
                //gerenciar reservas
                case "C":
                    System.out.println("Menu gerenciar reservas\n A) Cadastrar reserva\n B) Emitir reserva\n");
                    opcoes = sc.nextLine();
                    while(opcoes.isEmpty()){
                    try{
                    if(opcoes.isEmpty()){
                    throw new CampoEmBrancoException(opcoes);  
                    }} catch (CampoEmBrancoException e ){ }
                    opcoes = sc.nextLine();}
                    switch(opcoes){
                        //Cadastrar reserva
                        case "A":
                            gReservas.setLocaratio(gCadastro);
                            gReservas.setVeiculo(gVeiculo);
                            gReservas.cadastrarReserva();
                            break;
                        // Emitir reserva
                        case "B":
                            gReservas.emitirReserva();
                            break;
                    }
                    break;


            }
           
                     
        }   
    }
}