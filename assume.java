import java.util.Scanner;
import java.util.Random;

public class assume
{
	static boolean isNumber(String s) 
    { 
        for (int y = 0; y < s.length(); y++) 
        if (Character.isDigit(s.charAt(y)) == false) 
            return false; 
  
        
    }
	
	public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int calculate = 1;
	Random generate = new Random();
    int x = generate.nextInt(100)+1;
    String assume = "";

    System.out.println("A number from 1 to 100." + " ... assume what it is.");
	System.out.println("press q to quit the program");
		
	while (!assume.equals(String.valueOf(x))) 
	{
		assume = input.next();	
		
		if (isNumber(assume)) 
		{
			if(Integer.parseInt(assume)==x)
			  {
					System.out.println("Right!");
			  }
			  else if (Integer.parseInt(assume)<x) 
			  {
				System.out.println("you assumed lowest number");
				count++;
			  } 
			  else 
			  {
				System.out.println("you assumed highest number");
				count++;
			  }
		}
		else
		{
			if (assume.equals("q"))
			{
				assume = "";
				System.out.println("thank you");
				System.exit(0);
			}else {
			System.out.println("Please Enter Valid number"); 
			}
		}	
	}
    System.out.println("you assumed true number with "
        + count + " tries!");
}
}
