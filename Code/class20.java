package Code;
public class class20{
    public static void main(String[] args){
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            //r^2=a^2+b^2;
            // r^2<=x^2+y^2;
            //r^2>=x^2+y^2; Hay que buscar como desplazarlo 
            if (j==i){
                System.out.print(" . ");
                
                
            } else {
                System.out.print(" 0 ");
            }
        }
         System.out.println();
    }
}
}
