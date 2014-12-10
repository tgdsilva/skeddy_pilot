package logPack;

import org.apache.log4j.Logger;

public class WriteTwice extends File{

	
	public Logger reportsLogger = null;
	
	
	public WriteTwice() {
		this.reportsLogger = Logger.getLogger("reportsLogger");
	}


	public Logger getReportsLogger() {
		return reportsLogger;
	}


	public void setMessage(String message) {
		getReportsLogger().error(message);
	}

	

}
