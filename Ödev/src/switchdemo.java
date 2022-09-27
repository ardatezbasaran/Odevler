
public class switchdemo {

	public static void main(String[] args) {
		char grade = 'E';
		
		
		switch(grade) {
		    case 'A':
		    	System.out.println("Mükemmel, geçtiniz");
		    	break;
		    case 'B':
		    	System.out.println("Gayet iyi, geçtiniz");
		    	break;
		    case 'C':
		    	System.out.println("Güzel, geçtiniz");
		    	break;
		    case 'D':
		    	System.out.println("Geçtiniz");
		    	break;
		    case 'F':
		    	System.out.println("Maalesef, kaldınız");
		    	break;
		    	default:
		    		System.out.println("Geçersiz not girdiniz");
		    
		}

	}

}
