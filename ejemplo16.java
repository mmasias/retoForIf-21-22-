public class ejemplo16 {
  public static void main(String[] args) {
    for(int i = 1; i <= 21; i++){
      for(int j = 1; j <= 21; j++){
          if(j==1 || j==21 || i==1 || i==21){
              System.out.print(" . ");
          }
          else{
              System.out.print(" 0 ");
          }
      }
      System.out.println();
    }
  }
}