package Code;
public class class18{
    public static void main(String[] args){
        int x=1;
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            
            if (j==i ||j==i+2 || j==i-2||j==i+4||j==i-4||j==i+6||j==i-6||j==i-8||j==i+8||j==i-10||j==i+10||j==i-12||j==i+12||j==i-14||j==i+14||j==i-16||j==i+16||j==i-18||j==i+18||j==i-20||j==i+20){
                System.out.print(" 0 ");
                x= x+2;
                if (x>=22){
                    x=1;
                }
            } else {
                System.out.print(" . ");
            }
        }
         System.out.println();
    }

}
}
