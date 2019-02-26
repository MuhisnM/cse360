/**
 * Name: MuhsinMohamed
 * Class ID: 494
 * Assignment 2
 * Description: This Assignment is a practice of version control Systems.
 *              Github is used as the version control tool.
 */


package cse360assign2;

public class Calculator {
	private int total;
	StringBuffer historyOfActions;
	
	public Calculator () {
		total = 0;  
		historyOfActions = new StringBuffer ("0");
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		total = value + total;
		historyOfActions.append(" + " + value);
	}
	
	public void subtract (int value) {
		total = total + value;
		historyOfActions.append(" - " + value); 
	}
	
	public void multiply (int value) {
		total = total*value;
		historyOfActions.append(" * " + value);
	}
	
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else 
		{
			total = (total / value);
		}
		historyOfActions.append (" / " + value);
	}
	
	public String getHistory () {
		return historyOfActions.toString ();
	}

}
