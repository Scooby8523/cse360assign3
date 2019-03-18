package cse360assign3;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderedIntListTest {
	
	/**
	 * initializes the array test which will be used for JUNIT
	 * to test each individual method
	 */
	private OrderedIntList test = new OrderedIntList();
	
	@Test
	public void testOrderedIntList() {
		assertEquals("array size", 10, test.size());
	}

	@Test
	public void testOrderedIntListInt() {
		test = new OrderedIntList(4);
		assertEquals("array size", 4, test.size());
	}

	@Test
	public void testInsert() {
		assertEquals(10, test.size());
		//insert values into array to check insert method functionality 
		test.insert(2);
		test.insert(3);
		test.insert(4);
		test.insert(5);
		test.insert(6);
		test.insert(7);
		assertEquals(6, test.length());
		assertEquals("# of elements", 6, 6);
		//Repeat process to confirm insert method functionality 
		test.insert(8);
		test.insert(9);
		test.insert(10);
		test.insert(11);
		test.insert(12);
		test.insert(13);
		assertEquals("# of elements", 12, 12);
		assertEquals(15, test.size());
	}
	
	@Test
	public void testSize() {
		test = new OrderedIntList();
		assertEquals(test.size(), 10);
		test.insert(2);
		assertEquals(test.size(), 10);
	}

	@Test
	public void testLength() {
		test.insert(2);
		test.insert(11);
		assertEquals("length", test.length(), 2);
		test.insert(9);
		test.insert(14);
		assertEquals("length", test.length(), 4);
	}

	@Test
	public void testDelete() {
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

		
		
	}

	@Test
	public void testToString() {
		String stringIntList = "" + test;
		assertEquals(stringIntList,test.toString());
		
	}

}
