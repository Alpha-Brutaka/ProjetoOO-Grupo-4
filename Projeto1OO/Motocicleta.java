
public class Motocicleta extends Veiculo{
    private boolean tracao;
    private boolean abs;
    private boolean pilotAut;
    private String modosPilo;

    public Motocicleta(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, String placa, boolean tracao, boolean abs, boolean pilotAut, String modosPilo) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq,placa);
        this.tracao = tracao;
        this.abs = abs;
        this.pilotAut = pilotAut;
        this.modosPilo = modosPilo;
    }

    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isPilotAut() {
        return pilotAut;
    }

    public void setPilotAut(boolean pilotAut) {
        this.pilotAut = pilotAut;
    }

    public String getModosPilo() {
        return modosPilo;
    }

    public void setModosPilo(String modosPilo) {
        this.modosPilo = modosPilo;
    }


}
