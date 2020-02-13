package R3;

import java.util.ArrayList;

public class R3main {

	public static void main(String[] args) {
		//Frame();
		//Populate array
		ArrayList<User> friend;
		friend = generateList();
		/*//Test adding friends
		addingFriends();
		System.out.println();*/
		//Test adding points 
		/*addingPoints(friend);
		for(User u : friend)
			System.out.println(u.getMonthlyPoints());*/
		removingFriend();
		
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
		
		return friend;
	}
	
	
	public static void name(ArrayList<User> nameList) {
		User u;
		try {
			
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
	}
	
	public static void addingFriends () {
		User u = new User("test");
		User f1 = new User("James");
		User f2 = new User ("Matt");
		User f3 = new User("Johnny");
		User f4 = new User("Ansley");
		User f5 = new User("Johnny");
		
		u.addFriend(f1);
		u.addFriend(f2);
		u.addFriend(f3);
		u.addFriend(f4);
		u.addFriend(f5);
		
		System.out.println("Test01");
		System.out.println(u.toString());
		
		System.out.println("Test 02");
		User f100 = new User("Computer");
		u.addFriend(f100);
		System.out.println(u.toString());
		
		System.out.println(u.getFriends());
	}
	
	public static void addingPoints (ArrayList<User> a) {
		for (User u : a)
			u.addPoints((int)(Math.random() * 300 + 1));
	}
	
	public static void removingFriend () {
		User u = new User("test");
		User f1 = new User("James");
		User f2 = new User ("Matt");
		User f3 = new User("Johnny");
		User f4 = new User("Ansley");
		User f5 = new User("Johnny");
		User f6 = new User("Computer");
		
		u.addFriend(f1);
		u.addFriend(f2);
		u.addFriend(f3);
		u.addFriend(f4);
		u.addFriend(f5);
		u.addFriend(f6);
		
		System.out.println(u.toString());
		
		u.removeFriend(f6);
		System.out.println(u.toString());
		
		User f7 = new User("Martin");
		u.addFriend(f7);
		System.out.println(u.toString());
		
		u.removeFriend(f1);
		System.out.println(u.toString());
	}
	
}
