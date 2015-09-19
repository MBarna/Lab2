public class Lab2 {
    
    public static void main(String[] args) {

    //Initial println statements
	System.out.println("As I was going to St. Ives");
	System.out.println("I met a man with seven wives");
	System.out.println("Each wife had seven sacks");
	System.out.println("Each sack had seven cats");
	System.out.println("Each cat had seven kits");
	System.out.println("Kittens, cats, sacks, wives");
	System.out.println("How many were going to St. Ives?" + "\n" + "\n");
	
	// 1. Each of the following variable declarations has something
	// wrong with it.  Uncomment the line and fix it.  If your code
	// compiles, you are probably on the right track!
	// Assume that the original man is also going to St. Ives, so
	// the boolean variable manGoingToStIves should be true.
	
	//Declared variables
	boolean manGoingToStIves = true;

	int menGoing = 2;

	int numWives = 7, totalWives = 7;

	int numSacksPerWife = 7, totalSacks = 7;
	
	int numCatsPerSack = 7, totalCats = 7;

	int numKitsPerCat = 7, totalKits = 7;

	int total = 0;

	// If the original man is going to St. Ives, then all are going
	// the narrator, original man, kitten, cats, sacks, wives.
	// If the original man is going AWAY from St. Ives, then the only
	// person going is the narrator

	if (manGoingToStIves) {
	    // 2. Remember, if the original man is going to St. Ives, then
	    // all of the wives, sacks, cats, and kittens are as well, along
	    // with the narrator.
	    // Calculate the number going to St. Ives

	    //Number of men going to St. Ives
		System.out.println("There are " + menGoing + " men going to St. Ives." + "\n");

		//Number of wives going to St. Ives
		System.out.println("There are " + totalWives + " wives going to St. Ives." + "\n");

		//Calculation for total number of sacks and a println to display totalSacks
		totalSacks = numWives * numSacksPerWife;
		System.out.println("There are " + totalSacks + " sacks, of which 7 are with each of the wives, going to St. Ives." + "\n");

		//Calculation for total number of cats and a println to display totalCats
		totalCats = numWives * numSacksPerWife * numCatsPerSack;
		System.out.println("There are " + totalCats + " cats, of which 7 are with each of the wives," + "\n" + " going to St. Ives." + "\n");

		//Calculation for total number of kits and a println to display totalKits
		totalKits = numWives * numSacksPerWife * numCatsPerSack * numKitsPerCat;
		System.out.println("There are " + totalKits + " kits, in which 7 are in each of the sacks, " + "\n" + 
			"that are with each of the wives, who are going to St. Ives." + "\n");

		//Calculation to find the total number of entities and println to display it
		total = menGoing + totalWives + totalSacks + totalCats + totalKits;
		System.out.println("There are " + total + " total entities going to St. Ives.");

	} else {
	    // Otherwise, only the narrator is going!
	    total = 1;
	}
	
	// 3. Right before exiting, the system should print
	// "Number going to St. Ives is " and then, on the same line,
	// the number going to St. Ives (stored in the _total_ variable).
	// Add a statement or statements that will do this.
	
    }
    
}