import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.plaf.OptionPaneUI;

public class Main{
    public static void main(String[] args){
        GerenciarReservas gReservas = new GerenciarReservas(400);
        GerenciarLocartario gCadastro = new GerenciarLocartario(400);
        GerenciarVeiculo gVeiculo = new GerenciarVeiculo(400); 
        Scanner sc = new Scanner(System.in);
        String opcoes = "0";
        int ter = 1;

        while(ter == 1){
            System.out.println("A) Gerenciar Locarários\nB) Gerenciar Frotas\nC) Gerenciar Reservas\nD) Sair do Programa");
            opcoes = sc.next();
            switch(opcoes){
                //Sair do programa
                case "D":
                    ter = 0;
                    break;

                //Gerenciar Locatáios
                case "A":
                    System.out.println("Menu Gerencia Locatários:\n A) Cadastrar Locatário\n B) Buscar Locatário\n C) Pesquisar Locatáio\n D) Excluir Locatáio\n");
                    opcoes = sc.next();
                    switch(opcoes){
                        // cadastrar locatario
                        case "A":
                            System.out.println("A) Pessoa Fisica\nB) Pessoa Jurídica");
                            opcoes = sc.next();
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
                            gCadastro.excluirLocatario();
                            break;
                    }
                    break;
                // Gerenciar Frotas
                case"B":
                    System.out.println("Menu Gerencia Frotas:\n A) Cadastrar Veículos\n B) Pesquisar veículos\n C) Atualizar dados de um veículo\n D) Remover veículo da frota\n");
                    opcoes = sc.next();
                    switch(opcoes){
                        case "A":

                        //Cadastrar veiculos
                        System.out.println("Menu Cadastro Veículos\n A) Cadastrar veiculo de passeio\n B) Cadastrar veículo utilitário\n C) Cadastrar motocicleta");
                            opcoes  = sc.next();
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
                            System.out.println("Menu Pesquisa de Veiculos\n A) Pesquisar veículo pelo Renavam\n B) Pesquisar veículo por marca, modelo ou renavam");
                            opcoes = sc.next();
                            switch(opcoes){
                                case "A":
                                    gVeiculo.pesquisarVeiculo();
                                    break;
                                case "B":
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
                    opcoes = sc.next();
                    switch(opcoes){
                        //Cadastrar reserva
                        case "A":
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