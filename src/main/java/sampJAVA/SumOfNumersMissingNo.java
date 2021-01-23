package sampJAVA;

public class SumOfNumersMissingNo {
	int res;
	public int sumofArrays(int[] arr){
		int sum=0;
		for(int k:arr){
			sum=sum+k;
		}
	return sum;	
	}

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,10};//55, 40 =15-4=11
		int largestno = n[8];
		int sumOfnumbers = (largestno*(largestno+1))/2;
		System.out.println("sumFrom1to10 :"+sumOfnumbers);
		SumOfNumersMissingNo ob=new SumOfNumersMissingNo();
		int m=ob.sumofArrays(n);
		System.out.println(sumOfnumbers-m);
	}

}
