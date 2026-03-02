package anogram_logical_1;

public class Demo_2 {

	public static void main(String[] args) {
	 
		
		
		double[] arr = {10,45,5.6,56.45,789,50,798.56};
		
		double sum = 0;
		
		for(int i=0; i< arr.length; i=i+2)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum = " + sum);
	}

}
