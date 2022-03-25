public class Veiculo {
    private String marca;
    private String carga;
    private String modelo;
    private String anoFab;
    private String anoMod;
    private String numREN;
    private String capTanq;
    


    public Veiculo(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN, String capTanq){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.numREN = numREN;
        this.capTanq = capTanq;
    }
}