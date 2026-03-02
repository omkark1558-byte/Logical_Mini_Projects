package anogram_logical_1;

public class Demo {

	public static int divide(int a, int b) {
		try
		{
		return a / b;
		}catch(Exception e)
		{
			return -1;
		}
	}

	public static void main(String[] args) {

		int[] Numbers = { 10, 200,30,40 };
		int[] num = { 1,2,0,4};

		for (int i = 0; i < Numbers.length; i++) {
			System.out.println(divide(Numbers[i], num[i]));
		}

		System.out.println("Execution Is Completed..!");
	}
}
