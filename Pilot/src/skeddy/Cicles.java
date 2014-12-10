package skeddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Cicles {

	private String output;
	private ArrayList<Integer> list; 	

	/**
	 * @param output
	 */
	
	public Cicles(String output) {
		super();
		this.output = output;
		this.list = new ArrayList<Integer>();
	}
	
	/*
	 * Modifiers
	 * @get/set output text
	 * @get/set Arraylist<Integer>
	 * @add values to Array using addInt()
	 * */

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> lista) {
		this.list = lista;
	}

	public void addInt(int number)
	{
		list.add(number);
	}


	public void SkeddyFor()
	{
		setOutput("Result for 'For' number: ");
		for (int i = 0; i < 10; i++)
		{
			addInt(i);
			System.out.println(getOutput() + i);
		}
	}

	public void SkeddyWhile()
	{
		int i = 0;
		setOutput("Result for 'While' number: ");	

		while (i < 10)
		{
			i++;
			if (!getList().contains(i))
			{
				System.out.println(getOutput() + i);
				addInt(i);
			}
			
			else
			{
				System.out.println("The number " + i + " already exist");
			}
		}
			
	}

	//iterator
	public void iterateList()
	{
		Iterator<Integer> itList = getList().iterator();
		while(itList.hasNext())
		{
			Integer next = itList.next();
			System.out.println("This is the Iterator result: " + next);
		}
		getList().toArray();

	}
	
	
	public void printEmail()
	{
		
	}

}
