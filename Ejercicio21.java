public class Ejercicio21{
	public static void main(String[] args){
		
		for (int i=1; i<=21; i=i+1) {
			for (int j=1;j<=21; j=j+1) {
				if (i<6 || i>16 || i==6 && j!=11 || i==7 && j!=9 && j!=10 && j!=12 && j!=13 || i==8 && j!=8 && j!=14 || i==9 && j!=7 && j!=15 || i==10 && j!=7 && j!=15 || i==11 && j!=6 && j!=16 || i==12 && j!=7 && j!=15 || i==13 && j!=7 && j!=15 || i==14 && j!=8 && j!=14 || i==15 && j!=9 && j!=10 && j!=12 && j!=13 || i==16 && j!=11) {
					System.out.print(" 0 ");
				} else {
					System.out.print(" . ");
				}
				
			}
			System.out.println();
		}
	}
}
