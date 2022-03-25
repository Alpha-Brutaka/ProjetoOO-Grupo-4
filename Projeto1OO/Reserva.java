public class Reserva {
    private String tipo;
    private String dataInicio;
    private String dataFim;
    private int numInd;
    private Pessoa locatario;
    private Veiculo locacao;



    public Reserva(String tipo, String dataInicio, String dataFim, int numInd, Pessoa locatario, Veiculo locacao){
        this.tipo = tipo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.numInd = numInd;
        this.locatario = locatario;
        this.locacao = locacao;
    }
}
