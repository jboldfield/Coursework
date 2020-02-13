//Name:			Johnnie Oldfield
//Program Name:	Couple
//Date:			02/09/2018
//Purpose:		A group of guests.  They order 
//				2 drinks, 1 soup, 1 salad, 2
//				entrees, and 1 dessert.
//************************************************
public class Couple extends Guest {
	//Get order
	public int[] getOrder() {
		int[] order = new int[] {2, 1, 1, 2, 1};
		return order;
	}
}
