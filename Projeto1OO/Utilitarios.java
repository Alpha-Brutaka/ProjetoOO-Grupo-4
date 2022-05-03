import java.lang.management.PlatformManagedObject;

public class Utilitarios extends Veiculo{
    private String tipo;
    private boolean arCond;
    private boolean dirHid;
    private boolean cambAut;
    
    public Utilitarios(String marca, String carga, String modelo, String anoFab, String anoMod, String numREN,
            String capTanq, String placa, String tipo, boolean arCond, boolean dirHid, boolean cambAut) {
        super(marca, carga, modelo, anoFab, anoMod, numREN, capTanq,placa);
        this.tipo = tipo;
        this.arCond = arCond;
        this.dirHid = dirHid;
        this.cambAut = cambAut;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
