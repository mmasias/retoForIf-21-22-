package MayenRuano;

public class Ejercicio14 {
    public static void main(String[] args) {
        for(int i = 1; i <= 21; i++){
          for(int j = 1; j <= 21; j++){
              if((j==2 || j==20) || (i==2 || i==20)){
                  System.out.print(" - ");
              }
              else{
                  System.out.print(" . ");
              }
          }
          System.out.println();
        }
    }
}
