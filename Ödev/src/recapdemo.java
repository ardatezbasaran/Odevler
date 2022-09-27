
public class recapdemo {

	public static void main(String[] args) {
		double[] myList = new double[4];
		myList[0]= 1.2;
		myList[1]= 1.3;
		myList[2]= 4.3;
		myList[3]= 5.6;
		
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
			
		}
	    
		System.out.println("Toplam = "+ total);
		System.out.println("En büyük = " + max);
		
		
		
		

	}

}
