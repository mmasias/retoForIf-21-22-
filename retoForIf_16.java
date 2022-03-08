public class retoForIf_16{
	public static void main(String[] args){
		
		for (int i=1; i<=21; i=i+1) {
			for (int j=1;j<=21; j=j+1) {
				
				if (!(i==1 || j==1 || i==21 || j==21)) {
					System.out.print(" O ");
				} else {
					System.out.print(" . ");
				}
				
			}
			System.out.println();
		}
	}
}
