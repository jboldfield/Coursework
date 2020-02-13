import java.util.*;
public class War {
	public static void main(String[] args) {
	
		//Create and populate array list
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for(int x = 0; x < 4; x++){        
			for(int y = 2; y < 15; y++){
				deck.add(x,y); 
			} 
		}
		//Shuffle
		Collections.shuffle(deck, new Random());
		
		//Linked list for player decks
		LinkedList<Integer> deck1 = new LinkedList<Integer>();
        LinkedList<Integer> deck2 = new LinkedList<Integer>();
        
        //Populate player decks
        deck1.addAll(deck.subList(0, 25));                    
        deck2.addAll(deck.subList(26, deck.size()));
        
        //Test decks
        //System.out.println("Deck 1: " + deck1.toString());  
        //System.out.println("Deck 2: " + deck2.toString());
        
        //

	}

}
