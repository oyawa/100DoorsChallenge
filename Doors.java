
public class Doors {
	public static void main(String[] args)
	{
		boolean[] doors = new boolean[101];
		for(int open = 1; open <= 100; open++)
		{
			for(int close = 1; close <= 100; close++)
			{
				if(close % open == 0)
				{
					doors[close] = !doors[close];
				}
			}
		}
		
		for(int open = 1; open <= 100; open++)
		{
			System.out.print("Door number "+ open +" is ");
			if(doors[open] == true)
			{
				System.out.println("open");
			}
			else
			{
				System.out.println("close");
			}

		}
	}

}
