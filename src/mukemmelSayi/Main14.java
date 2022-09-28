package mukemmelSayi;

public class Main14 {

	public static void main(String[] args) {
      //1,2,3 = 6 
		int number = 5;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0){
				total = total + i;
		
			}
		}
		if(total == number) {
			System.out.println("Mükemmel Sayidir");
		}else {
			System.out.println("Mükemmel Sayİ Değildir");
		}
     
	}

}
