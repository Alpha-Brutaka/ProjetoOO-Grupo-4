
public class Motocicleta extends Veiculo{
    private boolean tracao;
    private boolean abs;
    private boolean pilotAut;
    private String modosPilo;

    public Motocicleta(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, boolean tracao, boolean abs, boolean pilotAut, String modosPilo) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq);
        this.tracao = tracao;
        this.abs = abs;
        this.pilotAut = pilotAut;
        this.modosPilo = modosPilo;
    }


}
