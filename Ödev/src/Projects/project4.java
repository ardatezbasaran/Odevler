package Projects;

public class project4 {

	public static void main(String[] args) {
		
		
		int say1 = 220;
		int say2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for(int i=1;i<say1;i++) {
			if(say1%i==0) {
				toplam1 = toplam1 + i;
				
			}
			
		}
		
		
		for(int i=1;i<say2;i++) {
			if(say2%i==0) {
				toplam2 = toplam2 + i;
			}
		}
		if(say1==toplam2 && say2==toplam1) {
			System.out.println("Arkadaş sayıdır");
			
		}
		else {
			System.out.println("Arkadaş sayı değildir");
		}
		
		
		
	}

}
