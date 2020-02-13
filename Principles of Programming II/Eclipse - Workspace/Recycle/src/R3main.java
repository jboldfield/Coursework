package R3;
 
import java.util.ArrayList;

public class R3main {

	public static void main(String[] args) {
		//Frame();
		//Populate array
		ArrayList<User> friend;
		friend = generateList();
		//Test adding friends
		addingFriends(friend);
		for(User u : friend)
			System.out.println(u.getFriend());
		System.out.println();
		//Test adding points 
		addingPoints(friend);
		for(User u : friend)
			System.out.println(u.getPoints)
	}

	//helper method 
	public static ArrayList<User> generateList(){
		ArrayList<User> friend = new ArrayList<>();
		User f1 = new User("James");
		User f2 = new User ("Matt");
		User f3 = new User("Johnny");
		User f4 = new User("Ansley");
		User f5 = new User("Johnny");
		
		friend.add(f1);
		friend.add(f2);
		friend.add(f3);
		friend.add(f4);
		friend.add(f5);
		
	}
	
	
	public static void name(ArrayList<User> nameList) {
		User u;
		try {
			
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
	}
	public static void Frame() {
		Frame( r = new JFrame("R3");
	}
	
	public static addingFriends (ArrayList<User> u) {
		User h = new User("");
		for (User u : friend) {
			/*for (User f : friend) {
				if (f != u)
					u.addFriend(f);
			}*/	
			System.out.println(h.addFriend(u));
		}
		System.out.println(h.toString());
	}
	
	public static addingPoints (ArrayList<User> u) {
		for (User u : friend)
			u.addPoints(Math.random() * 300 + 1)
	}
}
