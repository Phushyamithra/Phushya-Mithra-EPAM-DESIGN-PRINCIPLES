package com.mithra.Cal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends App
{
	public void test() {
		Operation cal = new Operation();

		
		
		// test the Addition function 

		int answer = cal.Add(29,20);
		assertEquals(49,answer);

		
		// test the Subtract function
		
		answer = cal.Sub(5, 2);
				
		assertEquals(3, answer);
				 
		
			
		// test the Multiply function

		answer = cal.Mul(3, 2);

		assertEquals(6,answer);

		

		// test the Divide function

		answer = cal.Div(89, 49);

		assertEquals(1, answer);
		
		

	}

	private void assertEquals(int i, int answer) {
		// TODO Auto-generated method stub
		
	}

	private int Add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
