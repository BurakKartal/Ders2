import javax.swing.JOptionPane;


public class ListPrime 
{
	public static void main (String []args) 
	{


		String input = JOptionPane.showInputDialog("Enter a number : ");
		int num = 0, loop = 0, monum = 0, mod = 0, loop2=2;
			
		try {	
			num = Integer.parseInt(input);
			for (loop=2; loop<num; loop++) 
			{
				monum = num%loop;
				 
				if (monum != 0) {
					System.out.print("  " +num);
				}
				for (num = num-1 ; num>=1; num--)
				{
					mod=num%loop2;
					if (mod!=0)
					{
						System.out.print("  " +num);
						
					}
			
				}                                    
				loop++;
			}
				
			
			
			
		}catch (NumberFormatException e){
			System.out.println("Please type a number...!!!");
		}
		
		
		
	}
}