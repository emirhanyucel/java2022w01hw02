package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'U';
		
		switch(harf) {
		case 'A' :
		case 'O' :
		case 'U' :
		case 'I' :
		case 'a' :
		case 'o' :
		case 'u' :
		case 'ı' :
			System.out.println(harf + " kalın sesli bir ünlü harftir.");
			break;
			
		case 'E' :
		case 'İ' : 
		case 'Ö' :
		case 'Ü' :
		case 'e' :
		case 'i' : 
		case 'ö' :
		case 'ü' :
			System.out.println(harf +  " ince sesli bir ünlü harftir.");
			break;
			default: 
				System.out.println("Geçersiz bir harf girdiniz.");
		}

	}

}
