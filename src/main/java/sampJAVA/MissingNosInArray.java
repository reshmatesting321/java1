package sampJAVA;

public class MissingNosInArray {

	public static void main(String[] args) { 
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 }; // let's create another array with same length . by default all index will contain zero , default value for int variable 
		int[] register = new int[input.length]; // now let's iterate over given array to // mark all present numbers in our register // array 
		for (int i : input) {
			//System.out.println("Element :"+i);
			
		 register[i] = 1; //register[1,1,2,3,5,5,7,9,9,9]
		 System.out.println("Elemtn and reg val :"+ "\n" + i + "\n" + register[i]);
		} // now, let's print all the absentees 
		System.out.println("missing numbers in given array"); 
		for (int i = 0; i < register.length; i++) 
		{ 
			//System.out.println(register[i]);
			if (register[i] == 0 && i!=0) 
		{System.out.println(i);
		} } 
	}
	
}
