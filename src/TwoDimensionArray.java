import java.util.Arrays;


public class TwoDimensionArray {

	public static void main(String[] args) {
		// First [] is used to represent no. of rows, second[] is used to represent no. of columns
		int arr[][] = new int[3][4];
		arr[0][0]= 100;
		arr[0][1]= 200;
		arr[0][2]= 300;
		arr[0][3]= 400;
		System.out.println(Arrays.toString(arr));// It will give random /memory address of the values
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
				//break;// break inside an inner for loop breaks the inner loop not outer loop
			}
			System.out.println();
		}
		
		// Using array literals
		
		int arr1[][]= {
				{1,2,3},
				{100,200,300},
				{10,20,30}};
		
		System.out.println(arr1.length);
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr1[row].length;col++)// or we can use col<arr[0].length or arr[row].length
			{
				System.out.print(arr1[row][col]+" ");
			//	break;
			}
			System.out.println();
			//break;
		}
		
		
		
		
		
		
		
				}
				
		
		
		
		

	}


