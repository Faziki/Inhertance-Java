
public class Animal {
	private int numTeeth = 0;
	private boolean spots = false;
	private static int weight = 0;
	
	public Animal(int numTeeth, boolean spots, int weight){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
	}
		
	public static void main(String[] args) {
				
	}
	
	public int getNumTeeth(){
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}
	
	public boolean getSpots() {
		return isSpots();
	}

	public void setSpots(boolean spots) {
		this.spots = spots;
	}

	public static int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		Animal.weight = weight;
	}

	public boolean isSpots() {
		return spots;
	}
}
