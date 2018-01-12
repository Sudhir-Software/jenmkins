package com.app.JenkinsTest;

import static org.junit.Assert.*;
import java.awt.List;
import java.util.ArrayList;
import static  org.hamcrest.core.Is.is;

import org.hamcrest.core.Is;
import org.junit.Test;


public class SortTest {
	Sort sort;
	ArrayList<Integer> aList;
	
	@Test
	public void should_accept_list_of_integers_into_constructor() {
	
		//Arrange
		aList = new ArrayList<Integer>();
		sort = new Sort(aList);
	}

	@Test
	public void should_sort_list_of_two_integers_in_accending_order() {
	
		//Arrange
		aList = new ArrayList<Integer>();
		aList.add(17);
		aList.add(15);
		
		//Act
		sort = new Sort(aList);
		
		System.out.println(aList);
		
//		//Assert
//		assertThat(aList.get(0), is(15));
//		assertThat(aList.get(1), is(17));
	
	}

}
