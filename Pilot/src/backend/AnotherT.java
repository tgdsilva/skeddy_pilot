package backend;

import interfaces.IActions;

public class AnotherT implements IActions {

	private String name;
	private int number;
	
	
	/**
	 * @param cenas
	 * @param skeddy
	 */
	public AnotherT() {
		super();
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber()
	{
		return this.number;
	}

	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public int getOperations() {
		number = number - 1;
		return number;
	}
	
	@Override
	public String SendMessage(String message) {
		return message;
	}
	
	
}
