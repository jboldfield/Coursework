//Name:			Johnnie Oldfield
//Program Name:	Family
//Date:			02/09/2018
//Purpose:		A group of guests. They order
//				4 drinks, 2 soup, 3 salads, 4 
//				entrees, and 2 desserts.
//************************************************
public class Family extends Guest {
	//Get order
	public int[] getOrder() {
		int[] order = new int[] {4, 2, 3, 4, 2};
		return order;
	}
}
