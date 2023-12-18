import java.util.Arrays;


public class ArrayAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,3,5,6,19,20,45,70};
		int b[]= new int[a.length-1];
		
		int j=0;
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i] !=19)
			{
				b[j]=a[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(b));
		
		
/*Q2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console */
		
		Object criInfo[] = {"Deepti",33,"Indian Royals","23/05/1990",'F', 5};
		
		Object criInfo1[] = {"Suniti",29,"Indian Royals","12/12/1994",'F', 4};
		Object criInfo2[] = {"Hritika",33,"Indian Royals","12/12/1996",'F', 3};
		
		
		System.out.println(Arrays.toString(criInfo1));
		for(int i=0; i<criInfo.length;i++)
		{
			System.out.println(criInfo[i]);
		}
		for(Object k :criInfo1 ){
			System.out.println(k);
		}
		
		System.out.println(Arrays.toString(criInfo2));
		for(int l =0; l<=criInfo2.length-1; l++)
		{
			System.out.println(criInfo2[l]);
		}
		
		//Using 2D Array
		
		Object teamInfo[][]= {
				{"Deepti", 'F',33,true, "SDET"},
				{"Nidhi", 'F',35, false, "Tester"},
				{"Arushi", 'F',25, false, "Trainee"},					
				};
		for(int row=0; row<teamInfo.length; row++)
		{
			for(int col=0; col<teamInfo[row].length;col++)
			{
				System.out.print(teamInfo[row][col]+" ");
			}
			System.out.println();
		}
		}
		

	}


