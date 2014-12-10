package backend;

import interfaces.IActions;

public class Tests implements IActions {

	private String name;
	private int operations;

	
	/**
	 * @param name
	 * @param operations
	 */
	public Tests() {
		super();
	}
	
	
	
	public void setOperations(int operations) {
		this.operations = operations;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getNumber()
	{
		return this.operations;
	}

	@Override
	public String getName() {
		return this.name;
		
	}

	@Override
	public int getOperations() {
		operations = operations + 1;
		return operations;
	}
	
	@Override
	public String SendMessage(String message) {
		return message;
	}
	

}
