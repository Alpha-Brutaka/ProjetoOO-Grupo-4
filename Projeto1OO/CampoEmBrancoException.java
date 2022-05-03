
public class CampoEmBrancoException extends Exception {
  private String str;

  public CampoEmBrancoException(String str){
    System.out.println("Espaço em braco, por favor coloque seus dados novamente");
  }
  @Override
    public String toString(){
      return  str;
  }}
