package MayenRuano;

public class Ejercicio13 {
    public static void main(String[] args) {
        for(int i = 1; i <= 21; i++){
          for(int j = 1; j <= 21; j++){
              if(j==i+1 || i==j+1){
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
