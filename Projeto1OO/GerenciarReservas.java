import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;

public class GerenciarReservas {
    private List <Reserva> reservas;
    private int nReserva;
    private GerenciarLocatario locatario;
    private GerenciarVeiculo veiculo;
    public GerenciarReservas(){
        this.reservas = new LinkedList<Reserva>();
    }

    public void setLocaratio(GerenciarLocatario l){
        this.locatario = l;
    }
    public void setVeiculo(GerenciarVeiculo v){
        this.veiculo = v;
    }
   
    private void emitirReservaParcial(Reserva r, int i ){
        int valorSemTaxas = 0;

        if(i==4){
            valorSemTaxas = r.getValor();
            valorSemTaxas = valorSemTaxas*r.get_nMes();
  
        }else{
            valorSemTaxas = r.getValor();
            valorSemTaxas = valorSemTaxas* r.getnDiarias();
        }
        float valorSeguroPro = (float)valorSemTaxas*0.08f;
        float valorSeguroTerc =(float)valorSemTaxas*0.12f;
        float impostos = (float)valorSemTaxas*0.05f;
        float valorTotal = (float)valorSemTaxas+valorSeguroPro+valorSeguroTerc+impostos;
        if(i == 2){
         valorTotal = valorTotal*0.9f;   
        }
        r.setValorSeguroPro(valorSeguroPro);
        r.setValorSeguroTerc(valorSeguroTerc);
        r.setImpostos(impostos);
        r.setValorTotal(valorTotal);
        String reservaoParcial = "\n****************************//********************************\n"+

                                 "\nReserva: " + r.getNumInd()+"\n"+
                                 "Locatário:" + r.getLocatario().getNome() + "\n"+
                                 "Resposável pela locação: "+ r.getResponsavel().getNome()+"\n\n"+

                                 "***********************Dados da Locação***********************\n\n"+

                                 "Início: "+r.getDataInicio()+"\n"+
                                 "Fim: "+r.getDataFim()+"\n"+
                                 "Numero de diárias calculadas: "+ r.getnDiarias()+"\n\n"+

                                 "Veículo: " + r.getLocacao().getMarca() + "-" + r.getLocacao().getModelo()+"\n"+
                                 "Ano de Fabricação/modelo: " + r.getLocacao().getAnoFab() + "/"+ r.getLocacao().getAnoMod()+"\n"+
                                 "Placa: "+ r.getLocacao().getPlaca() + " RENVAM: " + r.getLocacao().getNumREN()+ "\n\n"+

                                 "Valor da diária: "+ r.getValor() +"\n"+
                                 "Valor do seguro de terceiros: "+valorSeguroTerc +"\n"+
                                 "Valor do seguro próprio: "+ valorSeguroPro+"\n"+
                                 "Valor dos impostos: " + impostos+"\n"+
                                 "Valor total da locação: "+ valorTotal+"\n\n"+
                                 
                                 "****************************//********************************\n\n"
                                 ;                         


        System.out.println(reservaoParcial);
    }
    public boolean cadastrarReserva(){
        
        Calendar c =  Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int ano = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH);
        int dia = c.get(Calendar.DAY_OF_MONTH);
        mes +=1;
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);
        String dataInicio = String.format("%02d/%02d/%04d",dia,mes,ano);
        dataInicio += String.format("-%02dhrs:%02dmin:%02dseg", hora,minutos,segundos);
        System.out.println("Qual é o tipo da reserva?\n 1) Diária normal(Para pessoas Físicas)\n 2) Diária reduzida(Para pessoas Físicas em com 10% de desconto)\n 3) Diária empresarial(Para Funcionarios)\n 4) Mensal");
        String nn =sc.nextLine();
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
        int escolha = Integer.parseInt(nn);
        switch(escolha){
            case 1:
                String tipo = "Diária normal";
                System.out.println("Qual o valor da diaria do veículo?");
                nn =sc.nextLine();
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
                nn = sc.nextLine();}}
                int valor = Integer.parseInt(nn);
                System.out.println("Qual a data de Fim da Locação? DD/MM/AAAA");
                String dataFim = sc.nextLine();
                while(dataFim.isEmpty()){
                try{
                if(dataFim.isEmpty()){
                throw new CampoEmBrancoException(dataFim);  
                }} catch (CampoEmBrancoException e ){ }
                dataFim = sc.nextLine();}
                System.out.println("Qual a pessoa que deseja Alugar?\n");
                Pessoa p = locatario.pesquisarLocatario();
                System.out.println("Qual veiculo deseja Alugar");
                Veiculo v = veiculo.pesquisarVeiculo();
                this.nReserva += 1;
                int numInd = nReserva;
                Reserva r = new Reserva(tipo,valor, dataInicio, dataFim, numInd, p, v);
                r.setResponsavel(p);
                emitirReservaParcial(r,1);
                reservas.add(r);
                break;
            case 2:
                tipo = "Diária reduzida";
                System.out.println("Qual o valor da diaria do veículo?");
                valor = sc.nextInt();
                System.out.println("Qual a data de Fim da Locação? DD/MM/AAAA");
                dataFim = sc.nextLine();
                while(dataFim.isEmpty()){
                try{
                if(dataFim.isEmpty()){
                throw new CampoEmBrancoException(dataFim);  
                }} catch (CampoEmBrancoException e ){ }
                dataFim = sc.nextLine();}
                System.out.println("Qual a pessoa que deseja Alugar?\n");
                p = locatario.pesquisarLocatario();
                System.out.println("Qual veiculo deseja Alugar");
                v = veiculo.pesquisarVeiculo();
                this.nReserva += 1;
                numInd = nReserva;
                r = new Reserva(tipo,valor, dataInicio, dataFim, numInd, p, v);
                r.setResponsavel(p);
                emitirReservaParcial(r,2);
                reservas.add(r);
                break;
            case 3:
                tipo = "Diária empresarial";
                System.out.println("Qual o valor da diaria do veículo?");
                nn =sc.nextLine();
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
                nn = sc.nextLine();}}
                valor = Integer.parseInt(nn);
                System.out.println("Qual a data de Fim da Locação? DD/MM/AAAA");
                dataFim = sc.nextLine();
                while(dataFim.isEmpty()){
                try{
                if(dataFim.isEmpty()){
                throw new CampoEmBrancoException(dataFim);  
                }} catch (CampoEmBrancoException e ){ }
                dataFim = sc.nextLine();}
                System.out.println("Digite o CNPJ!!!\n");
                p = locatario.pesquisarLocatario();
                PessoaJuridica pj = (PessoaJuridica)p;
                p = pj.pesquisarFuncionario();
                System.out.println("Qual veiculo deseja Alugar");
                v = veiculo.pesquisarVeiculo();
                this.nReserva += 1;
                numInd = nReserva;
                r = new Reserva(tipo,valor, dataInicio, dataFim, numInd, p, v);
                r.setResponsavel(p);
                emitirReservaParcial(r,3);
                reservas.add(r);
                break;
            case 4:
                tipo = "Mensal";
                System.out.println("Qual o valor da Mesalidade veículo?");
                nn =sc.nextLine();
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
                nn = sc.nextLine();}}
                valor = Integer.parseInt(nn);
                System.out.println("Qual a data de Fim da Locação? DD/MM/AAAA");
                dataFim = sc.nextLine();
                while(dataFim.isEmpty()){
                try{
                if(dataFim.isEmpty()){
                throw new CampoEmBrancoException(dataFim);  
                }} catch (CampoEmBrancoException e ){ }
                dataFim = sc.nextLine();}
                System.out.println("Qual a pessoa que deseja Alugar?\n");
                p = locatario.pesquisarLocatario();
                System.out.println("Qual veiculo deseja Alugar");
                v = veiculo.pesquisarVeiculo();
                this.nReserva += 1;
                numInd = nReserva;
                r = new Reserva(tipo,valor, dataInicio, dataFim, numInd, p, v);
                r.setResponsavel(p);
                emitirReservaParcial(r,4);
                reservas.add(r);
                break;
        }
        return true;
    }




    public boolean emitirReserva(){
        String  res = "Reserva #       Início                      Fim                   Veículo              Valor Seguro Terceiros       Valor seguro Próprio       Valor Impostos       Valor Total\n"+
                      "*******************************************************************************************************************************************************************************\n";
        for(Reserva t : reservas){
            res += "\n"+ t.getNumInd()+"      "+t.getDataInicio()+"        "+t.getDataFim()+ "               "+ t.getLocacao().getMarca() +"-"+ t.getLocacao().getModelo()+"                         "+ t.getValorSeguroTerc()+"                      "+ t.getValorSeguroPro()+"                  "+t.getImpostos()+"               "+t.getValorTotal()+"\n\n";
        }
        res +=        "********************************************************************************************************************************************************************************\n";
        System.out.println(res);
        return true;
    }
}
