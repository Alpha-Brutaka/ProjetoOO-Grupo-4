public class Reserva {
    private String tipo;
    private int valor;
    private String dataInicio;
    private String dataFim;
    private int numInd;
    private Pessoa locatario;
    private Veiculo locacao;
    private Pessoa responsavel;
    private int nDiarias;
    private float valorSeguroPro;
    private float valorSeguroTerc;
    private float impostos;
    private float valorTotal;
    

    public int calcular_nMeses(String dataInicio, String dataFim){
        int diaI = Integer.parseInt(dataInicio.substring(0, 2));
        int mesI = Integer.parseInt(dataInicio.substring(3, 5));
        int anoI = Integer.parseInt(dataInicio.substring(6, 10));
        int hrI  = Integer.parseInt(dataInicio.substring(11, 13));
        int diaF = Integer.parseInt(dataFim.substring(0, 2));
        int mesF = Integer.parseInt(dataFim.substring(3, 5));
        int anoF = Integer.parseInt(dataFim.substring(6, 10));
        int totalmI = diaI/30;
        totalmI += mesI;
        totalmI += anoI*12;
        int totalmF = diaF/30;
        totalmF += mesF;
        totalmF += anoF*12;
        int nMes = totalmF -totalmI;
        return nMes;


    }

    public int get_nMes(){
        int nMes = calcular_nMeses(dataInicio, dataFim);
        return nMes;
    }

    public int calcular_nDiarias(String dataInicio, String dataFim){
        int diaI = Integer.parseInt(dataInicio.substring(0, 2));
        int mesI = Integer.parseInt(dataInicio.substring(3, 5));
        int anoI = Integer.parseInt(dataInicio.substring(6, 10));
        int hrI  = Integer.parseInt(dataInicio.substring(11, 13));
        int diaF = Integer.parseInt(dataFim.substring(0, 2));
        int mesF = Integer.parseInt(dataFim.substring(3, 5));
        int anoF = Integer.parseInt(dataFim.substring(6, 10));
        int totalhrI = diaI*24;
        totalhrI += mesI*30*24;
        totalhrI += anoI*12*30*24;
        totalhrI += hrI;
        int totalhrF = diaF*24;
        totalhrF += mesF*30*24;
        totalhrF += anoF*12*30*24;
        int DifHr = totalhrF-totalhrI;
        int ndia = DifHr/24;

        return ndia;

    }

    
    public Reserva(String tipo, int valor,String dataInicio, String dataFim, int numInd, Pessoa locatario, Veiculo locacao){
        this.tipo = tipo;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.numInd = numInd;
        this.locatario = locatario;
        this.locacao = locacao;
    }



    public int getnDiarias() {
        nDiarias = calcular_nDiarias(dataInicio, dataFim);
        return nDiarias;
    }



    public void setnDiarias(int nDiarias) {
        this.nDiarias = nDiarias;
    }



    public Pessoa getResponsavel() {
        return responsavel;
    }



    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public int getValor() {
        return valor;
    }



    public void setValor(int valor) {
        this.valor = valor;
    }



    public String getDataInicio() {
        return dataInicio;
    }



    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataFim() {
        return dataFim;
    }



    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }



    public int getNumInd() {
        return numInd;
    }



    public void setNumInd(int numInd) {
        this.numInd = numInd;
    }



    public Pessoa getLocatario() {
        return locatario;
    }



    public void setLocatario(Pessoa locatario) {
        this.locatario = locatario;
    }



    public Veiculo getLocacao() {
        return locacao;
    }



    public void setLocacao(Veiculo locacao) {
        this.locacao = locacao;
    }

    public float getValorSeguroPro() {
        return valorSeguroPro;
    }

    public void setValorSeguroPro(float valorSeguroPro) {
        this.valorSeguroPro = valorSeguroPro;
    }

    public float getValorSeguroTerc() {
        return valorSeguroTerc;
    }

    public void setValorSeguroTerc(float valorSeguroTerc) {
        this.valorSeguroTerc = valorSeguroTerc;
    }

    public float getImpostos() {
        return impostos;
    }

    public void setImpostos(float impostos) {
        this.impostos = impostos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

