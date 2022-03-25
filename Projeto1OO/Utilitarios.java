public class Utilitarios extends Veiculo{
    private String tara;
    private String cargaL;
    private String tipoCarga;
    private String tipo;
    private boolean arCond;
    private boolean dirHid;
    private boolean cambAut;

    public Utilitarios(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, String tara, String cargaL, String tipoCarga, String tipo, boolean arCond, boolean dirHid,
            boolean cambAut) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq);
        this.tara = tara;
        this.cargaL = cargaL;
        this.tipoCarga = tipoCarga;
        this.tipo = tipo;
        this.arCond = arCond;
        this.dirHid = dirHid;
        this.cambAut = cambAut;
    }
    
}
