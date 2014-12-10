package christmas;

import javax.swing.JOptionPane;



public class SystemXmasCarol {

	private static int times;

	public static void main(String[] args) throws Throwable

	{
		times = 1;
		while (times <= 3)
		{
			times++;
			Thread.sleep(2000);
			{
				JOptionPane.showMessageDialog(null,
				"We Wish You a Merry Christmas", "Information",
				JOptionPane.INFORMATION_MESSAGE);
			}
			/* System.out.println("We Wish You a Merry Christmas"); */
		}

		Thread.sleep(2000);
		{
			JOptionPane.showMessageDialog(null,
			".....And a Happy New Year :D !!!", "Information",
			JOptionPane.INFORMATION_MESSAGE);
		}
		/* System.out.println(".....And a Happy New Year :D !!!"); */
	}

}
