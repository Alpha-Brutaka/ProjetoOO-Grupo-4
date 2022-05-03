
public class DigitosException extends Exception {
  private String str;

  public DigitosException(String str){
    System.out.println("Apenas coloque dígitos por favor.\n");
  }
  @Override
    public String toString(){
      return  str;
  }}
