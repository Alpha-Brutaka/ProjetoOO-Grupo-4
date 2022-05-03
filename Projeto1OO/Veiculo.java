public class Veiculo {
    private String marca;
    private String carga;
    private String modelo;
    private String anoFab;
    private String anoMod;
    private String numREN;
    private String capTanq;
    private String placa;
    


    public Veiculo(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN, String capTanq, String placa){
        this.marca = marca;
        this.carga = carga;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.numREN = numREN;
        this.capTanq = capTanq;
        this.placa = placa;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }



    public String getCarga() {
        return carga;
    }



    public void setCarga(String carga) {
        this.carga = carga;
    }



    public String getCapTanq() {
        return capTanq;
    }



    public void setCapTanq(String capTanq) {
        this.capTanq = capTanq;
    }



    public String getNumREN() {
        return numREN;
    }



    public void setNumREN(String numREN) {
        this.numREN = numREN;
    }



    public String getAnoMod() {
        return anoMod;
    }



    public void setAnoMod(String anoMod) {
        this.anoMod = anoMod;
    }



    public String getAnoFab() {
        return anoFab;
    }



    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }
}