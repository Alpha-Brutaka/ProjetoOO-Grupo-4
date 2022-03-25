public class Passageiro extends Veiculo {
    private boolean tv;
    private String maxPas;


    public Passageiro(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, boolean tv, String maxPas) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq);
        this.tv = tv;
        this.maxPas = maxPas;
    }
    
}
