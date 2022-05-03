import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GerenciarVeiculo {
    private  List <Veiculo> veiculos;
    public GerenciarVeiculo(){
        this.veiculos = new LinkedList<Veiculo>();
    }

    private Veiculo cadastrarVeiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a marca do Veículo");
        String marca = sc.nextLine();
        while(marca.isEmpty()){
        try{
        if(marca.isEmpty()){
        throw new CampoEmBrancoException(marca);  
        }} catch (CampoEmBrancoException e ){ }
        marca = sc.nextLine();}
        System.out.println("Insira a carga ");
        String carga = sc.nextLine();
        while(carga.isEmpty()){
        try{
        if(carga.isEmpty()){
        throw new CampoEmBrancoException(carga);  
        }} catch (CampoEmBrancoException e ){ }
        carga = sc.nextLine();}
        System.out.println("Insira o modelo do Veículo");
        String modelo = sc.nextLine();
        while(modelo.isEmpty()){
        try{
        if(modelo.isEmpty()){
        throw new CampoEmBrancoException(modelo);  
        }} catch (CampoEmBrancoException e ){ }
        modelo = sc.nextLine();}
        System.out.println("Insira o ano de fabricação do Veículo");
        String anoFab = sc.nextLine();
        while(anoFab.isEmpty()){
        try{
        if(anoFab.isEmpty()){
        throw new CampoEmBrancoException(anoFab);  
        }} catch (CampoEmBrancoException e ){ }
        anoFab = sc.nextLine();}
        System.out.println("Insira o ano do modelo do Veículo");
        String anoMod = sc.nextLine();
        while(anoMod.isEmpty()){
        try{
        if(anoMod.isEmpty()){
        throw new CampoEmBrancoException(anoMod);  
        }} catch (CampoEmBrancoException e ){ }
        anoMod = sc.nextLine();}
        System.out.println("Insira o número do RENAVAM do Veículo");
        String numREN = sc.nextLine();
        while(numREN.isEmpty()){
        try{
        if(numREN.isEmpty()){
        throw new CampoEmBrancoException(numREN);  
        }} catch (CampoEmBrancoException e ){ }
        numREN = sc.nextLine();}
        System.out.println("Insira a capacidade do tanque do Veículo");
        String capTanq = sc.nextLine();
        while(capTanq.isEmpty()){
        try{
        if(capTanq.isEmpty()){
        throw new CampoEmBrancoException(capTanq);  
        }} catch (CampoEmBrancoException e ){ }
        capTanq = sc.nextLine();}
        System.out.println("Insira a placa do veículo:");
        String placa = sc.nextLine();
        while(placa.isEmpty()){
        try{
        if(placa.isEmpty()){
        throw new CampoEmBrancoException(placa);  
        }} catch (CampoEmBrancoException e ){ }
        placa = sc.nextLine();}
        Veiculo v = new Veiculo(marca, carga, modelo, anoFab, anoMod, numREN, capTanq, placa);
        return v; 

    }

    public boolean cadastrarUtilitario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo do Veículo?\nA) Veículo de carga\nB) Veículo de passageiros");
        String op = sc.nextLine();
        while(op.isEmpty()){
        try{
        if(op.isEmpty()){
        throw new CampoEmBrancoException(op);  
        }} catch (CampoEmBrancoException e ){ }
        op = sc.nextLine();}
        switch(op){
            case "A":
                Veiculo ve = this.cadastrarVeiculo();
                System.out.println("Insira a tara do veículo ");
                String tara = sc.nextLine();
                while(tara.isEmpty()){
                try{
                if(tara.isEmpty()){
                throw new CampoEmBrancoException(tara);  
                }} catch (CampoEmBrancoException e ){ }
                tara = sc.nextLine();}
                System.out.println("Insira a carga em litros");
                String cargaL = sc.nextLine();
                while(cargaL.isEmpty()){
                try{
                if(cargaL.isEmpty()){
                throw new CampoEmBrancoException(cargaL);  
                }} catch (CampoEmBrancoException e ){ }
                cargaL = sc.nextLine();}
                System.out.println("Insira o tipo de carga do veículo");
                String tipoCarga = sc.nextLine();
                while(tipoCarga.isEmpty()){
                try{
                if(tipoCarga.isEmpty()){
                throw new CampoEmBrancoException(tipoCarga);  
                }} catch (CampoEmBrancoException e ){ }
                tipoCarga = sc.nextLine();}
                String tipo = "Carga";
                System.out.println("Possue ar condicionado? sim/não");
                String v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean arCond = this.respostaSN(v);
                System.out.println("Possue direção hidraulica? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean dirHid = this.respostaSN(v);
                System.out.println("Possue cambio automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean cambAut = this.respostaSN(v);
                Carga vCarga = new Carga(ve.getMarca(),ve.getCarga(), ve.getModelo(), ve.getAnoFab(), ve.getAnoMod(), ve.getNumREN(),ve.getCapTanq(), ve.getPlaca(),tipo, arCond, dirHid, cambAut, tara,cargaL, tipoCarga);
                veiculos.add(vCarga);
                System.out.println("Veículo Cadastrado!!!");
                break;
            case "B":
                ve = this.cadastrarVeiculo();
                System.out.println("Possui tv? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean tv = this.respostaSN(v);
                System.out.println("Qual a capacidade Maxima de Passageiros?");
                String maxPas = sc.nextLine();
                while(maxPas.isEmpty()){
                try{
                if(maxPas.isEmpty()){
                throw new CampoEmBrancoException(maxPas);  
                }} catch (CampoEmBrancoException e ){ }
                maxPas = sc.nextLine();}
                tipo = "Passageiro";
                System.out.println("Possue ar condicionado? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                arCond = this.respostaSN(v);
                System.out.println("Possue direção hidraulica? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                dirHid = this.respostaSN(v);
                System.out.println("Possue cambio automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                cambAut = this.respostaSN(v);
                Passageiro vPassageiro = new Passageiro(ve.getMarca(), ve.getCarga(), ve.getModelo(), ve.getAnoFab(), ve.getAnoMod(), ve.getNumREN(), ve.getCapTanq(),ve.getPlaca(), tipo, arCond, dirHid, cambAut, tv, maxPas);
                veiculos.add(vPassageiro);
                System.out.println("Veículo Cadastrado!!!");
                break;
        }
        
       
    
        return true;
    }



    private boolean respostaSN(String v){
        boolean tf = false;
        if (v.equalsIgnoreCase("sim")){
            tf = true;
        }
        else if (v.equalsIgnoreCase("não")){
            tf = false;
        }
        return tf;

    }
    public boolean cadastrarPasseio(){
        boolean re = false;
        Veiculo ve = this.cadastrarVeiculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a categoria ");
        String categoria = sc.nextLine();
        while(categoria.isEmpty()){
        try{
        if(categoria.isEmpty()){
        throw new CampoEmBrancoException(categoria);  
        }} catch (CampoEmBrancoException e ){ }
        categoria = sc.nextLine();}
        System.out.println("Possue ar condicionado? sim/não");
        String v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean arCond = this.respostaSN(v);
        System.out.println("Possue direção hidraulica? sim/não");
        v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean dirHid = this.respostaSN(v);
        System.out.println("Possue cambio automático? sim/não");
        v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean cambAut = this.respostaSN(v);
        Passeio vPasseio = new Passeio(ve.getMarca(), ve.getCarga(), ve.getModelo(), ve.getAnoFab(), ve.getAnoMod(), ve.getNumREN(),ve.getCapTanq(),ve.getPlaca(), categoria, arCond, dirHid, cambAut);
        veiculos.add(vPasseio);
        System.out.println("Veículo de Passeio cadastrado com sucesso!!!");
        
        return true;
    }
    public Motocicleta CadastrarMotocicleta(){
        boolean re = false;
        Veiculo ve = this.cadastrarVeiculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Possue tração? sim/não");
        String v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean tracao = this.respostaSN(v);
        System.out.println("Possue abs? sim/não");
        v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean abs = this.respostaSN(v);
        System.out.println("Possue piloto automático? sim/não");
        v = sc.nextLine();
        while(v.isEmpty()){
        try{
        if(v.isEmpty()){
        throw new CampoEmBrancoException(v);  
        }} catch (CampoEmBrancoException e ){ }
        v = sc.nextLine();}
        boolean pilotAut = this.respostaSN(v);
        System.out.println("Qual é o seu modo de pilotagem?");
        String modosPilo = sc.nextLine();
        while(modosPilo.isEmpty()){
        try{
        if(modosPilo.isEmpty()){
        throw new CampoEmBrancoException(modosPilo);  
        }} catch (CampoEmBrancoException e ){ }
        modosPilo = sc.nextLine();}
        Motocicleta vMoto = new Motocicleta(ve.getMarca(), ve.getCarga(), ve.getModelo(), ve.getAnoFab(), ve.getAnoMod(), ve.getNumREN(), ve.getCapTanq(),ve.getPlaca(), tracao, abs, pilotAut, modosPilo);
        veiculos.add(vMoto);
        System.out.println("Motocicleta registrada com sucesso!!!");

        return vMoto;
    }
    private boolean pesquisarVeiculoTF(Veiculo v){
        String pesquisa = "";
        if(v!= null){
            pesquisa = v.getNumREN();
        }
        else{
            System.out.println("Campo em branco, Por Favor coloque os dados pedidos");    
        }
        Veiculo resposta = null;
        boolean re = false;
        for(Veiculo t : veiculos){
            if(t.getNumREN().equalsIgnoreCase(pesquisa)){
                resposta = t;
                re = true;
                break;
            }
        
        }
        return re;
    }
    public Veiculo pesquisarVeiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar veículo por RENAVAM ou placa:");
        String pesquisa = sc.nextLine();
        while(pesquisa.isEmpty()){
        try{
        if(pesquisa.isEmpty()){
        throw new CampoEmBrancoException(pesquisa);  
        }} catch (CampoEmBrancoException e ){ }
        pesquisa = sc.nextLine();}
        Veiculo resposta = null;
        boolean re = false;
        for(Veiculo t : veiculos){
            //Pesquisa por renavam
            if(t.getNumREN().equalsIgnoreCase(pesquisa)){
                resposta = t;
                re = true;
                break;
            }
            //pesquisa por placa
            if(t.getPlaca().equalsIgnoreCase(pesquisa)){
                resposta = t;
                re = true;
                break;
            }
        
        }
        try{
        if(resposta == null){
            re = false;
            throw new CObjetoNaoEncontradoException(pesquisa);  
            }}catch (CObjetoNaoEncontradoException e ){}
        if(re){
        System.out.println("Veículo Encontrado\n\n" + "Marca: "+resposta.getMarca() +"\n" + "Modelo: " + resposta.getModelo() + "\n" + "Ano de Fabricação: " + resposta.getAnoFab() + "\n" + "RENAVAM: " + resposta.getNumREN());  
        }

        return resposta;
    }


    public boolean excluirVeiculo(){
        Veiculo excVeiculo = this.pesquisarVeiculo();
        boolean tf = this.pesquisarVeiculoTF(excVeiculo);
        if(tf){
            veiculos.remove(excVeiculo);
        System.out.println("Veículo removido com sucesso!!!");;
        }
        return true;
    }



    public boolean alterarVeiculo(){
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = this.pesquisarVeiculo();
        boolean tf = this.pesquisarVeiculoTF(veiculo);    
        if(tf){
            veiculo = alterarV(veiculo);
            //  Alterar motocicleta
            Motocicleta t = new Motocicleta("","","","","","","","",true, true, true, " ");
            if(veiculo.getClass() == t.getClass()){
                System.out.println("Possue tração? sim/não");
                String v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean tracao = this.respostaSN(v);
                System.out.println("Possue abs? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean abs = this.respostaSN(v);
                System.out.println("Possue piloto automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean pilotAut = this.respostaSN(v);
                System.out.println("Qual é o seu modo de pilotagem?");
                String modosPilo = sc.nextLine();
                while(modosPilo.isEmpty()){
                try{
                if(modosPilo.isEmpty()){
                throw new CampoEmBrancoException(modosPilo);  
                }} catch (CampoEmBrancoException e ){ }
                modosPilo = sc.nextLine();}
                Motocicleta m = (Motocicleta)veiculo;
                m.setTracao(tracao);
                m.setAbs(abs);
                m.setPilotAut(pilotAut);
                m.setPilotAut(pilotAut);
                m.setModosPilo(modosPilo);
                veiculo = m;
            }
            // Alterar veiculo de carga
            Carga vCarga = new Carga("", "","","","","","","","",true, true, true, "", "","");
            if(veiculo.getClass() == vCarga.getClass()){
                System.out.println("Insira a tara do veículo ");
                String tara = sc.nextLine();
                while(tara.isEmpty()){
                try{
                if(tara.isEmpty()){
                throw new CampoEmBrancoException(tara);  
                }} catch (CampoEmBrancoException e ){ }
                tara = sc.nextLine();}
                System.out.println("Insira a carga em litros");
                String cargaL = sc.nextLine();
                while(cargaL.isEmpty()){
                try{
                if(cargaL.isEmpty()){
                throw new CampoEmBrancoException(cargaL);  
                }} catch (CampoEmBrancoException e ){ }
                cargaL = sc.nextLine();}
                System.out.println("Insira o tipo de carga do veículo");
                String tipoCarga = sc.nextLine();
                while(tipoCarga.isEmpty()){
                try{
                if(tipoCarga.isEmpty()){
                throw new CampoEmBrancoException(tipoCarga);  
                }} catch (CampoEmBrancoException e ){ }
                tipoCarga = sc.nextLine();}
                String tipo = "Carga";
                System.out.println("Possue ar condicionado? sim/não");
                String v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean arCond = this.respostaSN(v);
                System.out.println("Possue direção hidraulica? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean dirHid = this.respostaSN(v);
                System.out.println("Possue cambio automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean cambAut = this.respostaSN(v);
                Carga c = (Carga)veiculo;
                c.setTara(tara);
                c.setCargaL(cargaL);
                c.setTipo(tipo);
                c.setTipoCarga(tipoCarga);
                c.setArCond(arCond);
                c.setDirHid(dirHid);
                c.setCambAut(cambAut);
                veiculo = c;
            }
            // Alterar veiculo de Passeio
            Passeio vPasseio = new Passeio("", "","","","","","", "","", true,true,true);
            if(veiculo.getClass() == vPasseio.getClass()){
                System.out.println("Insira a categoria ");
                String categoria = sc.nextLine();
                while(categoria.isEmpty()){
                try{
                if(categoria.isEmpty()){
                throw new CampoEmBrancoException(categoria);  
                }} catch (CampoEmBrancoException e ){ }
                categoria = sc.nextLine();}
                System.out.println("Possue ar condicionado? sim/não");
                String v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean arCond = this.respostaSN(v);
                System.out.println("Possue direção hidraulica? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean dirHid = this.respostaSN(v);
                System.out.println("Possue cambio automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean cambAut = this.respostaSN(v);
                Passeio p = (Passeio)veiculo;
                p.setCategoria(categoria);
                p.setArCond(arCond);
                p.setDirHid(dirHid);
                p.setCambAut(cambAut);
                veiculo = p;
            }
            // Alterar veiculo de passageiros
            Passageiro vPassageiro = new Passageiro("", "","","","","","", "", "",true,true, true, true, "");
            if(veiculo.getClass() == vPassageiro.getClass()){
                System.out.println("Possui tv? sim/não");
                String v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean tv = this.respostaSN(v);
                System.out.println("Qual a capacidade Maxima de Passageiros?");
                String maxPas = sc.nextLine();
                while(maxPas.isEmpty()){
                try{
                if(maxPas.isEmpty()){
                throw new CampoEmBrancoException(maxPas);  
                }} catch (CampoEmBrancoException e ){ }
                maxPas = sc.nextLine();}
                String tipo = "Passageiro";
                System.out.println("Possue ar condicionado? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean arCond = this.respostaSN(v);
                System.out.println("Possue direção hidraulica? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean dirHid = this.respostaSN(v);
                System.out.println("Possue cambio automático? sim/não");
                v = sc.nextLine();
                while(v.isEmpty()){
                try{
                if(v.isEmpty()){
                throw new CampoEmBrancoException(v);  
                }} catch (CampoEmBrancoException e ){ }
                v = sc.nextLine();}
                boolean cambAut = this.respostaSN(v);
                Passageiro pa = (Passageiro)veiculo;
                pa.setTv(tv);
                pa.setMaxPas(maxPas);
                pa.setTipo(tipo);
                pa.setArCond(arCond);
                pa.setDirHid(dirHid);
                pa.setCambAut(cambAut);
                veiculo = pa;
            }
        }
        return true;
    }





    private Veiculo alterarV(Veiculo v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a marca do Veículo");
        String marca = sc.nextLine();
        while(marca.isEmpty()){
        try{
        if(marca.isEmpty()){
        throw new CampoEmBrancoException(marca);  
        }} catch (CampoEmBrancoException e ){ }
        marca = sc.nextLine();}
        System.out.println("Insira a carga ");
        String carga = sc.nextLine();
        while(carga.isEmpty()){
        try{
        if(carga.isEmpty()){
        throw new CampoEmBrancoException(carga);  
        }} catch (CampoEmBrancoException e ){ }
        carga = sc.nextLine();}
        System.out.println("Insira o modelo do Veículo");
        String modelo = sc.nextLine();
        while(modelo.isEmpty()){
        try{
        if(modelo.isEmpty()){
        throw new CampoEmBrancoException(modelo);  
        }} catch (CampoEmBrancoException e ){ }
        modelo = sc.nextLine();}
        System.out.println("Insira o ano de fabricação do Veículo");
        String anoFab = sc.nextLine();
        while(anoFab.isEmpty()){
        try{
        if(anoFab.isEmpty()){
        throw new CampoEmBrancoException(anoFab);  
        }} catch (CampoEmBrancoException e ){ }
        anoFab = sc.nextLine();}
        System.out.println("Insira o ano do modelo do Veículo");
        String anoMod = sc.nextLine();
        while(anoMod.isEmpty()){
        try{
        if(anoMod.isEmpty()){
        throw new CampoEmBrancoException(anoMod);  
        }} catch (CampoEmBrancoException e ){ }
        anoMod = sc.nextLine();}
        System.out.println("Insira o número do RENAVAM do Veículo");
        String numREN = sc.nextLine();
        while(numREN.isEmpty()){
        try{
        if(numREN.isEmpty()){
        throw new CampoEmBrancoException(numREN);  
        }} catch (CampoEmBrancoException e ){ }
        numREN = sc.nextLine();}
        System.out.println("Insira a capacidade do tanque do Veículo");
        String capTanq = sc.nextLine();
        while(capTanq.isEmpty()){
        try{
        if(capTanq.isEmpty()){
        throw new CampoEmBrancoException(capTanq);  
        }} catch (CampoEmBrancoException e ){ }
        capTanq = sc.nextLine();}
        v.setMarca(marca);
        v.setCarga(carga);
        v.setModelo(modelo);
        v.setAnoFab(anoFab);
        v.setAnoMod(anoMod);
        v.setNumREN(numREN);
        v.setCapTanq(capTanq);
        return v; 
        }
}
