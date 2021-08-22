
public class staticconstructormain {
	
	public static void main(String[] args) {
		System.out.println("IN main");
		
		
	}

	public staticconstructormain() {
	
		super();
		System.out.println("IN const");
		// TODO Auto-generated constructor stub
	}

	
	static {
		System.out.println("IN static");
		staticconstructormain staticconstructormain = new staticconstructormain();
	}
}
