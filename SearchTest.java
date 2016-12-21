package tests;

import static org.junit.Assert.*;

import static array.problems.Search.*;

import org.junit.Test;

public class SearchTest {
	
	@Test
	public void testBinarySearchFoundTarget() {
		int[] num = {2,6,8,13,15,17,17,18,19,20};
		int target = 15;
		int position = binarySearch(num,target);
		assertTrue(position == 4);
	}
	
	@Test
	public void testBinarySearchNotFoundTarget() {
		int[] num = {1, 2, 3, 3, 4, 5, 10};
		int target = 11;
		int position = binarySearch(num,target);
		assertTrue(position == -1);
	}

	@Test
	public void testBinarySearchEmptyArray() {
		int[] num = new int[3];
		int target = 3;
		int position = binarySearch(num,target);
		assertTrue(position == -1);
	}
	

	@Test
	public void testBinarySearchNullArray() {
		int[] num = null;
		int target = 3;
		int position = binarySearch(num,target);
		assertTrue(position == -1);
	}
}
