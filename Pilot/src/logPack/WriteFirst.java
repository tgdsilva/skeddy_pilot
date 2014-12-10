package logPack;

import org.apache.log4j.Logger;

public class WriteFirst extends File{

	public Logger debugLog = null;

	public WriteFirst() {
		super();
		this.debugLog = Logger.getLogger("debugLog");
	}


	public Logger getDebugLog() {
		return debugLog;
	}


	public void setDebugMessage(String debugMessage) {
		getDebugLog().debug(debugMessage);
	}


}
