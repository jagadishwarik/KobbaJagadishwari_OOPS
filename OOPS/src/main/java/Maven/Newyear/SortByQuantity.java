package Maven.Newyear;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Gifts>{
	
	public int compare(Gifts chocolate1, Gifts chocolate2) 
    { 
        return chocolate1.quantity - chocolate2.quantity; 
    } 
}
