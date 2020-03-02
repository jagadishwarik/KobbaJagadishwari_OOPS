package Maven.Newyear;

import java.util.Comparator;

public class sortByPriceSweets implements Comparator<Sweets> {
	public int compare(Sweets sweet1, Sweets sweet2) 
    { 
        return (int)(sweet1.price - sweet2.price); 
    }
}
