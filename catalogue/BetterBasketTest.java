package catalogue;

import java.util.ArrayList;

public class BetterBasketTest {
	void testMergeAddProduct() {
		ArrayList<Product> br = new ArrayList<Product>();
		
		Product p1 = new Product ("0001", "TV", 12.3, 1);
		Product p2 = new Product ("0002", "Radio", 12.7, 1);
		
		br.add(p1);
		br.add(p2);
		
		
		assertEquals(2, br.size(), "Incorrecct size after merge");
		assertEquals(3,br.get(1).getQuantity(), "Incorrect quantity after merge");
	}

	private void assertEquals(int i, int size, String string) {
		// TODO Auto-generated method stub
		
	}

}
