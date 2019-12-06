
public class Hawk extends Bird
{

	public Hawk()
	{
		name = "Red Tailed Hawk";
		food = "Rodents";
		isMale = false;
		weight = 3;
		feathers = "elegant brown feathers";
		wingspan = 48;
		canFly = true;
	}
	@Override
	public void makesNoise() {
		System.out.println("The hawk makes a loud cry!");
		
	}

	@Override
	public void hunt() {
		System.out.println("The hawk is going to hunt mice!");
		
	}

	@Override
	public void sleep() {
		System.out.println("The hawk sleeps throughout the night!");
		
	}

}
