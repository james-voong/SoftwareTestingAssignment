package exercise2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTransformationTest {

	@Test
	public void TransformToLowerCaseMoreThanOneString() {
		List<String> myArray = new ArrayList<String>();
		myArray.add("James");
		myArray.add("DEBRAH");
		myArray = ListTransformation.toLowerCase(myArray);
		for (String s : myArray)
			System.out.println(s);
		assertTrue(myArray.get(0).equals("james"));
		assertTrue(myArray.get(1).equals("debrah"));
		assertTrue(myArray.size() == 2);
	}

	@Test
	public void ListIsNull() {
		List<String> myArray = null;
		myArray = ListTransformation.toLowerCase(myArray);
		System.out.println(myArray);
		assertTrue(myArray == null);
	}

	@Test
	public void ListIsEmpty() {
		List<String> myArray = new ArrayList<String>();
		myArray = ListTransformation.toLowerCase(myArray);
		System.out.println("ListIsEmpty ");
		for (String s : myArray)
			System.out.println(s);
		System.out.println();
		assertTrue(myArray.size() == 0);
		assertTrue(myArray.isEmpty() == true);
	}

	@Test
	public void ListContainsOneStringCapitalAtFront() {
		List<String> myArray = new ArrayList<String>();
		myArray.add("James");
		myArray = ListTransformation.toLowerCase(myArray);
		for (String s : myArray)
			System.out.println(s);
		assertTrue(myArray.get(0).equals("james"));
	}

	@Test
	public void ListContainsOneStringCapitalInMiddle() {
		List<String> myArray = new ArrayList<String>();
		myArray.add("jaMes");
		myArray = ListTransformation.toLowerCase(myArray);
		for (String s : myArray)
			System.out.println(s);
		assertTrue(myArray.get(0).equals("james"));
	}

}
