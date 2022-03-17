package Code;
public class class19{
    public static void main(String[] args){
        
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            
            if (j==(21-i)||j==(21-i)+4||j==(21-i)-4||j==(21-i)+8||j==(21-i)-8||j==(21-i)+12||j==(21-i)-12||j==(21-i)+16||j==(21-i)-16||j==(21-i)+20||j==(21-i)-20){
                System.out.print(" 0 ");
                
                
            } else {
                System.out.print(" . ");
                
            }
        }
         System.out.println();
         
    }

}
}
