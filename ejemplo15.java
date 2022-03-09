public class ejemplo15 {
  public static void main(String[] args) {
    for(int i = 1; i <= 21; i++){
      for(int j = 1; j <= 21; j++){
          if((j>=2 && j<=5) || (i>=2 && i<=5)){
              System.out.print(" 0 ");
          }
          else{
              System.out.print(" . ");
          }
      }
      System.out.println();
    }
  }
}