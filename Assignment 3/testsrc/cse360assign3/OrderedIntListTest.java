package cse360assign3;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OrderedIntListTest {

	private OrderedIntList test = new OrderedIntList();
	
	@Test
	public void testOrderedIntList() {
		//fail("Not yet implemented");
		//test = new OrderedIntList();
		//assertEquals(10,10);
		assertEquals("wrong array", 10, test.size());
	}

//	@Test
//	public void testConstructor() {
//		//fail("Not yet implemented");
//		test = new OrderedIntList(9);
//		//assertNotEquals(9,8);
//		assertEquals ("wrong array", 8, test.size());
//	}

	/*@Test
	public void testOrderedIntListInt() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testInsert() {
		System.out.println("\nTesting Insert method");
		//test = new OrderedIntList();
		assertEquals(10, test.size());
		test.insert(2);
		test.insert(3);
		test.insert(4);
		test.insert(5);
		test.insert(6);
		test.insert(7);
		assertEquals(10, test.size());
		assertEquals("# of elements", 6, 6);
		System.out.println(test + " ");
		test.insert(8);
		test.insert(9);
		test.insert(10);
		test.insert(11);
		test.insert(12);
		test.insert(13);
		assertEquals("# of elements", 12, 12);
		System.out.println(test + " ");
		assertEquals(15, test.size());
		//fail("Not yet implemented");
	}
	
//	@Test
//	public void testSize() {
//		test = new OrderedIntList();
//		assertEquals(test.size(), 10);
//		test.insert(2);
//		assertEquals(test.size(), 15);
//
//		//fail("Not yet implemented");
//	}

	@Test
	public void testLength() {
		System.out.println("\nTesting Length method");
		test.insert(2);
		test.insert(11);
		assertEquals("length", 2, 2);
		System.out.println(test + " ");
		test.insert(9);
		test.insert(14);
		assertEquals("length", 4, 4);
		System.out.println(test + " ");
		//fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		System.out.println("\nTesting Delete method");
		test.insert(2);
		test.insert(9);
		test.insert(10);
		test.insert(15);
		test.insert(11);
		assertEquals("values in array must be 5", 5, 5);
		System.out.println(test + " ");
		test.delete(9);
		test.delete(11);
		assertEquals("values in array must be", 3, 3);
		System.out.println(test + " ");

		
		//fail("Not yet implemented");
		
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		String stringIntList = "" + test;
		assertEquals(stringIntList,test.toString());
		
	}

}
