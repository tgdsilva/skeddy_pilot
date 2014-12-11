package logs.log4j;

import org.apache.log4j.Logger;

public class WriteSecond extends File {

	private String logName;

	public WriteSecond(String logname) {
		this.logName = logname;
	}

	// Only for LOG Classes
	public final Logger getReportsLog() {
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
			getReportsLog().debug(message); //
			break;

		// Information
		case 'I':
			getReportsLog().info(message); //
			break;

		// Error
		case 'E':
			getReportsLog().error(message); //
			break;

		// Warning
		case 'W':
			getReportsLog().warn(message); //
			break;

		// Failure
		case 'F':
			getReportsLog().fatal(message); //
			break;

		default:
			getReportsLog().info("Missing the type");
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
