package arraystopic;

public class array1sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {1, 5, 10, 25};
		int i;
		int sum = 0;
		for (i = 0; i < myarray.length;  i++)
		{ sum += myarray[i];}
		System.out.println( "Sum: " + sum);

	}

}
