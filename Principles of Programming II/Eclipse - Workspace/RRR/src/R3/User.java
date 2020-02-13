package R3;
import java.util.ArrayList;
import java.util.Collections;
 
public class User implements Comparable<User>{
	private String name = "";
	private int lifetimePoints = 0;
	private int monthlyPoints = 0;
	private ArrayList<User> friends = new ArrayList<>();
	private ArrayList<String> monthlyBadges = new ArrayList<>();
	private ArrayList<String> lifetimeBadges = new ArrayList<>();
	
	public User (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLifetimePoints() {
		return lifetimePoints;
	}

	public int getMonthlyPoints() {
		return monthlyPoints;
	}
	
	public String getFriends(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < friends.size(); i++) {
			sb.append(friends.get(i).toString());
		}
		return sb.toString();
	}
	
	public void addPoints(int i) {
		lifetimePoints += i;
		monthlyPoints += i;
		badges();
	}
	
	public boolean addFriend(User u) {
		if(friends.contains(u) == true) {
			return false;
		}
		else {
			friends.add(u);
			Collections.sort(friends);
			return true;
		}
	}
	@Override
	public int compareTo(User u) {
		int diff = this.getName().compareTo(u.getName());
		return diff;
	}
	
	public boolean equals(Object o) {
		User u;
		if(o instanceof User) {
			u = (User) o;
			return this.getName().equals(u.getName());
		}
		else {
			return false;
		}
	}
	
	public boolean removeFriend(User u) {
		User a = new User("Test");
		if (u instanceof User) {
			a = u;
			if(friends.contains(a)) {
				friends.remove(a);
				return true;
			}
		}
		return false;
	}
	
	public void badges() {
		if(monthlyPoints >=  25 && !monthlyBadges.contains("Teir2") ) {
			monthlyBadges.add("Teir2");
			lifetimeBadges.add("Teir2");
		}
		else if(monthlyPoints >= 50 && !monthlyBadges.contains("Teir3")) {
			monthlyBadges.add("Teir3");
			lifetimeBadges.add("Teir3");
		}
		else if(monthlyPoints >= 100 && !monthlyBadges.contains("Teir4")) {
			monthlyBadges.add("Teir4");
			lifetimeBadges.add("Teir4");
		}
		else if(monthlyPoints >= 200 && !monthlyBadges.contains("EarthChild")) {
			monthlyBadges.add("EarthChild");
			lifetimeBadges.add("EarthChild");
		}
	}
	
	public String endMonth() {
		int onceler = 0, teir2 = 0, teir3 = 0, teir4 = 0, earthChild = 0;
		if(monthlyPoints == 0) {
			monthlyBadges.add("Onceler");
			lifetimeBadges.add("Onceler");
		}
		StringBuilder sb = new StringBuilder();
		String s = String.format("User:%s, Monthlypoints:%d, Lifetimepoints:%d", getName(), getMonthlyPoints(), getLifetimePoints());
		sb.append(s);
		sb.append("\n");
		for(String b: monthlyBadges) {
			sb.append(b.toString());
			sb.append("\n");
		}
		for(int i = 0; i < lifetimeBadges.size(); i++) {
			if(lifetimeBadges.get(i).equals("Oncler")) {
				onceler++;
			}
			else if(lifetimeBadges.get(i).equals("Teir2")) {
				teir2++;
			}
			else if(lifetimeBadges.get(i).equals("Teir3")) {
				teir3++;
			}
			else if(lifetimeBadges.get(i).equals("Teir4")) {
				teir4++;
			}
			else {
				earthChild++;
			}
		}
		if(onceler > 0) {
			String s1 = String.format("Oncler:%d, \nTeir2:%d, \nTeir3:%d, \nTeir4:%d, \nEarthChild:%d", onceler, teir2, teir3, teir4, earthChild);
			sb.append(s1);	
		}
		else {
			String s2 = String.format("Teir2:%d, \nTeir3:%d, \nTeir4:%d, \nEarthChild:%d", teir2, teir3, teir4, earthChild);
			sb.append(s2);
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(User f: friends) {
			sb.append(f.getName());
			sb.append("\n");
		}
		return sb.toString();
	}
}
