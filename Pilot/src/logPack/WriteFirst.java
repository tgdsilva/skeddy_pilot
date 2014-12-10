package logPack;

import org.apache.log4j.Logger;

public class WriteFirst extends File{
	
	private String logName;

	
	
	public WriteFirst(String logname) {
		this.logName = logname;
	}


	// Only for LOG Classes
	public final Logger getDebugLog() {
		return Logger.getLogger(getLogName()); 
	}
	
	
	// MESSAGE TO BE WRITTEN IN THE FILE
	public void setMessage(String message, char type) {
		
		// get the type of message that we want
		// return the type
		char tp = type;
		
		switch (tp) {
		
		// Debug
		case 'D':
			getDebugLog().debug(message); //
			break;
			
		// Information
		case 'I':
			getDebugLog().info(message); //
			break;
			
	    // Error
		case 'E':
			getDebugLog().error(message); //
			break;
			
		// Warning
		case 'W':
			getDebugLog().warn(message); //
			break;
			
		// Failure
		case 'F':
			getDebugLog().fatal(message); //
			break;
		
		default:
			getDebugLog().info("Missing the type");
			break;
		}
	}

	
	
	// OTHERS
	public String getLogName() {
		return logName;
	}


	public void setLogName(String logName) {
		this.logName = logName;
	}


}
