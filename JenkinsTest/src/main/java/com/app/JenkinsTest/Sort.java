package com.app.JenkinsTest;

import java.util.ArrayList;

public class Sort {
	
	public Sort(ArrayList<Integer> aList)
	{
		
		if(aList.get(0) > aList.get(1))
		{
			
			Integer element = aList.remove(0);
			aList.add(1, element);
		}//end if
		
	}
}
