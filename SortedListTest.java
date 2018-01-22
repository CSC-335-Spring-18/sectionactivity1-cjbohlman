import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

	@Test
	public void testSize() {
		SortedList newList = new SortedList();
		newList.insertInOrder(1);
		newList.printAll();
		newList.insertInOrder(1);
		newList.printAll();
		newList.insertInOrder(2);
		newList.printAll();
		newList.insertInOrder(3);
		newList.printAll();
		newList.insertInOrder(5);
		newList.printAll();
		newList.insertInOrder(4);
		newList.printAll();
		
		assertEquals(5, newList.size());
	}

}
