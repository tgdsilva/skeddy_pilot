package christmas;

public class XmasCarol {

	private static int times;
	
	
	public static void main(String[] args) throws Throwable
	{
		times = 1;
		
		while(times <= 3)
		{
			times++;
			Thread.sleep(2000);		
			System.out.println("We Wish You a Merry Christmas");
		}
		Thread.sleep(2000);	
		System.out.println(".....And a Happy New Year :D !!!");
	}
	
}
