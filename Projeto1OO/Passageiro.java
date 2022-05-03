public class Passageiro extends Utilitarios {
    private boolean tv;
    private String maxPas;

    
    public Passageiro(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, String placa, String tipo, boolean arCond, boolean dirHid, boolean cambAut, boolean tv, String maxPas) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq, placa,tipo, arCond, dirHid, cambAut);
        this.tv = tv;
        this.maxPas = maxPas;
    }


    public boolean isTv() {
        return tv;
    }


    public void setTv(boolean tv) {
        this.tv = tv;
    }


    public String getMaxPas() {
        return maxPas;
    }


    public void setMaxPas(String maxPas) {
        this.maxPas = maxPas;
    }

   


       
}
