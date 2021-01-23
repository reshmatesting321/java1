package sampJAVA;

public class Fibb {

	public static void main(String[] args) {
		int n1,  n2, sr, n3, sr1;
		n1 = 0;
		n2 = 1;
		n3 = 0;
		sr = 25;
		sr1 = 30;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<sr1;i++){
			n3 = n1+n2;
			if(i<sr-1){
			System.out.println(n3);
			}
			if (i==sr1-1)
			{
				System.out.println("30th series: " + n3);
			}
			n1 = n2;
			n2 = n3;				
		}
	}
	
}
