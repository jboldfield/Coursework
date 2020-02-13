//Name:			Johnnie Oldfield
//Program Name:	Kitchen
//Date:			02/09/2018
//Purpose:		Used to keep track of food supplies.
//************************************************
public class Kitchen{
	//Stock (servings)
	int [] stock = new int[] {120, 75, 75, 120, 65};

	//Get the amount of stock
	public int[] getStock() {
		return stock;
	}//End of getStock

	//Update the amount of stock
	public void updateStock (int[] order){
		stock[0] -= order[0];
		stock[1] -= order[1];
		stock[2] -= order[2];
		stock[3] -= order[3];
		stock[4] -= order[4];
	}//End of update stock

	//Check if stock falls at or below 4 servings
	public boolean checkStock(){
		boolean check = true;
		for (int i = 0; i < stock.length; i++){
			if (stock[i] < 4) {
				check = false;
			}
		}
		return check;
	}//End of checkStock
}//End of class