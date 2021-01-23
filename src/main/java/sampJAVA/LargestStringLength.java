package sampJAVA;

import java.util.Arrays;

public class LargestStringLength {
	
	public int largeIndex(int[] array )
			{
	      int largest = 0;
		  for ( int i = 1; i < array.length; i++ )
		  {
		      if ( array[i] > array[largest] ) largest = i;
		  }
		  return largest; // position of the first largest found
		}
	

	public static void main(String[] args) {
		LargestStringLength obj = new LargestStringLength();
		String[] sw = {"hi","hello","wonderful","marvelous1","good"};
		int[] len=new int[sw.length];
		
		if(len.length==0 || len==null){
			for(int i=0;i<sw.length;i++){		
				len[i]=sw[i].length(); //2,5,9,10,4
				System.out.println(len[i]);			
				}

			int large = obj.largeIndex(len);
			System.out.println(sw[large]);
			
			}	
		}
		
		
	}


