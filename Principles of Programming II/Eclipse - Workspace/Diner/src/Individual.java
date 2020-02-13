//Name:			Johnnie Oldfield
//Program Name:	Individual
//Date:			02/09/2018
//Purpose:		A guest.  They order 
//				1 drink, 1 soup, 0 salads, 1
//				entree, and 0 desserts.
//************************************************
public class Individual extends Guest {	
	//Get order
	public int[] getOrder() {
		int[] order = new int[] {1, 1, 0, 1, 0};
		return order;
	}
}
