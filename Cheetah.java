public class Cheetah extends Animal{
	
	private static String[] huntArea = {"Namibia","Botswana", "South Africa"};

	public Cheetah(int numTeeth, boolean spots, int weight, String huntArea){
		super(numTeeth, spots, weight);
			
	}
	
	public static String[] gethuntArea() {
		return huntArea;
	}

	public static void sethuntArea(String[] huntArea) {
		Cheetah.huntArea = huntArea;
	}
	
	public String toString() {
	      String output = "Number of Teetch: " + getNumTeeth();
	      output += "\nDoes this animal have spots:" + isSpots();
	      output += "\nAnimal's weight:" + getWeight();
	      output += "\nPrimary hunting area:" + huntArea[0];
	      	   
	      return output;
		}

	}



