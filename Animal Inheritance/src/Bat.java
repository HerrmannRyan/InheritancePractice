
public class Bat extends Mammal
	{
		
	public Bat()
		{
			name = "Bat";
			food = "insects";
			isMale = true;
			weight = 2;
			hair = "short hair and it is small to help flying";
		}
	@Override
	public void makesNoise()
		{
			System.out.println("Incoherent screeching");
			
		}
	@Override
	public void hunt()
		{
			System.out.println("The bat is looking forward to hunting insects.");
			
		}
	@Override
	public void sleep()
		{
			System.out.println("Sleeps during the day");
			
		}
	

	}

