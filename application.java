
public class application extends Animal{

	public application(int numTeeth, boolean spots, int weight) {
		super(numTeeth, spots, weight);
		
	}

	public static void main(String[] args) {
		
					
		Cheetah speedy = new Cheetah(32, true, 75, "Namibia");
		System.out.println(speedy);

	}

}
