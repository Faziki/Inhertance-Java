
public class Lion extends Animal{

	public Lion(int numTeeth, boolean spots, int weight, String lionType){
		super(numTeeth, spots, weight);
		
	}
	
	public static void typeLion(){
		if(Animal.getWeight() < 80){
			System.out.println("Cub");
		}
		
		else if(Animal.getWeight() <= 120){
			System.out.println("Female");
			
		} else {
			System.out.println("Male");
		}
		
	Lion simba = new Lion(40, false, 130, null);
	System.out.println(simba);

	}
}
