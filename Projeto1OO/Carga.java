import java.io.StringReader;

public class Carga extends Utilitarios {
    private String tara;
    private String cargaL;
    private String tipoCarga;//*** */
    public Carga(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN, String capTanq,String placa,
            String tipo, boolean arCond, boolean dirHid, boolean cambAut, String tara, String cargaL,
            String tipoCarga) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq,placa, tipo, arCond, dirHid, cambAut);
        this.tara = carga;
        this.cargaL = cargaL;
        this.tipoCarga = tipoCarga;
    }


    public String getTipoCarga() {
        return tipoCarga;
    }


    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }


    public String getCargaL() {
        return cargaL;
    }


    public void setCargaL(String cargaL) {
        this.cargaL = cargaL;
    }


    public String getTara() {
        return tara;
    }


    public void setTara(String tara) {
        this.tara = tara;
    }

   
    
    
    
    

}
