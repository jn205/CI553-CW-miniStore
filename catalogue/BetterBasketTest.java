package catalogue;

import java.util.ArrayList;

public class BetterBasketTest {
	void testMergeAddProduct() {
		BetterBasket br = new BetterBasket();
		
		Product p1 = new Product ("0001", "toaster", 12.3, 1);
		Product p2 = new Product ("0002", "kettle", 12.7, 1);
		Product p3 = new Product ("0002", "kettle", 12.7, 1);
		Product p4 = new Product ("0002", "kettle", 12.7, 1);
		
		br.add(p1);
		br.add(p2);
		br.add(p3);
		br.add(p4);
		
		assertEquals(2, br.size(), "Incorrecct size after merge");
		assertEquals(3,br.get(1).getQuantity(), "Incorrect quantity after merge");
	}

	private void assertEquals(int i, int size, String string) {
		// TODO Auto-generated method stub
		
	}

}
