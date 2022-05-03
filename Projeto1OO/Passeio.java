public class Passeio extends Veiculo {
    private String categoria;
    private boolean arCond;
    private boolean dirHid;
    private boolean cambAut;

    public Passeio(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, String placa, String categoria, boolean arCond, boolean dirHid, boolean cambAut) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq, placa);
        this.categoria = categoria;
        this.arCond = arCond;
        this.dirHid = dirHid;
        this.cambAut = cambAut;
    

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isArCond() {
        return arCond;
    }

    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }

    public boolean isDirHid() {
        return dirHid;
    }

    public void setDirHid(boolean dirHid) {
        this.dirHid = dirHid;
    }

    public boolean isCambAut() {
        return cambAut;
    }

    public void setCambAut(boolean cambAut) {
        this.cambAut = cambAut;
    }
    
}
