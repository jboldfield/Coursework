public class MyPatterns5 {
	public MyPatterns5() {
	}
//Pattern I
	public void displayPatternI(int lines) {
			System.out.println("\n\tPattern I\n");
			for (int i = 1; i <= lines; i++){
				for (int j = 1; j <= i; j++){
					System.out.print (j);
            }
			   System.out.println();
		   }
	}
//End of Pattern I
 
//Pattern II
 	public void displayPatternII (int lines) {
      System.out.println ("\n\tPattern II\n");
      for (int i = lines; i >= 1; i--){
         for (int j = i; j >= 1; j--){
         System.out.print (j);
         }
         System.out.println ();
      }
	}
//End of Pattern II

//Pattern III
 	public void displayPatternIII (int lines) {
      System.out.println ("\n\tPattern III\n");
      for (int i = 1; i <= lines; i++){
         //Print spaces
         for (int j = i; j > 0; j--){
            System.out.print (" ");
         }
         //Print numbers 
         for (int j = lines; j >= i; j--){
            System.out.print (j);
         }
         System.out.println ();
      }
	}
//End of Pattern III

//Pattern IV
	public void displayPatternIV (int lines) {
      System.out.println ("\n\tPattern IV\n");
      for (int i = 1; i <= lines; i++){
         //Print spaces
         for (int j = lines - 1; j >= i; j--){
         System.out.print (" ");
         }
         //Print numbers 
         for (int j = lines; j >= lines - (i - 1); j--){
         System.out.print (j);
         }
         System.out.println ();
      }
	}
//End of Pattern IV

//Pattern V
	public void displayPatternV (int lines) {
      System.out.println ("\n\tPattern V\n");
		for (int i = lines; i >= 1; i--){ 
			//Spaces
			for (int j = lines; j > i; j--){
				System.out.print(" ");
			}
			//Prints left side numbers     
         for (int j = i; j > 1; j--){
               System.out.print(j); 
         }
         //Prints right side numbers     
            for (int j = 1; j <= i; j++){
            System.out.print(j);
            }
			System.out.println();
		}
	}	
//End of Pattern V

//Pattern VI
	public void displayPatternVI (int lines){
      System.out.println ("\n\tPattern VI\n");
      for (int i = 1; i <= lines; i++) {
            //Spaces
            for (int j = 1; j <= (lines - i)*2; j++){
            System.out.print(" ");
            }
            //Prints left side numbers     
            for (int j = i; j >= 1; j--){
               System.out.print(j);
            }   
            //Prints right side numbers     
            for (int j = 2; j <= i; j++){
               System.out.print(j);
            }      
            System.out.println();
       }
   }
//End of Pattern VI
}
//End of class