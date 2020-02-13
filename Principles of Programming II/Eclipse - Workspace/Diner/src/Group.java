//Name:			Johnnie Oldfield
//Program Name:	Group
//Date:			02/09/2018
//Purpose:		A group of guests.  They order 
//				4 drinks, 3 soup, 3 salad, 4
//				entrees, and 3 desserts.
//************************************************
public class Group extends Guest{
	//Get order
	public int[] getOrder() {
		int[] order = new int[] {4, 3, 3, 4, 3};
		return order;
	}
}
