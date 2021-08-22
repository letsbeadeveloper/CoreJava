
abstract public class Abstraction

{
	int no_of_tyres;
	abstract void start();
}


class Car extends Abstraction
{
	void start()
	{
		System.out.println("Start with Key");
	}
	
}

class Scotter extends Abstraction
{
	void start()
	{
		System.out.println("Start with Kick");
	}
	
	public static void main(String[] args) 
	{
		//Abstraction a = new Abstraction();
		Car c= new Car();
		c.start();
		//c.no_of_tyres=4;


		Scotter c1= new Scotter();
		c1.start();
		//c1.no_of_tyres=2;

	}
}