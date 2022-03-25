public class GerenciarReservas {
    private int nReservas;
    private Reserva reservas[];

    public GerenciarReservas(int nReservas){
        this.nReservas = nReservas;
        this.reservas = new Reserva[nReservas-1];
    }

    public boolean emitirReserva(){
        return true;
    }
    public boolean cadastrarReserva(){
        return true;
    }
}
