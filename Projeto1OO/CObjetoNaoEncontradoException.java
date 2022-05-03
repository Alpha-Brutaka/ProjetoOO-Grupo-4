
public class CObjetoNaoEncontradoException extends Exception {
  private String pesquisa;
  public CObjetoNaoEncontradoException(String pesquisa){
  super();
   System.out.println ("Não foi encontrado nenhuma "+pesquisa+".\n");
  }
  @Override
    public String toString(){
      return pesquisa  ;
  }}
