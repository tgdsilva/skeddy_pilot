package logPack;

import org.apache.log4j.Logger;

public class File {
	
	// classes for LOGFILE
	private static Logger logger = null;
	private String debug;
	private String info;
	private String warn;
	private String error;
	private String fatal;
	
	 /**
	  *  singleton for File Rooting
	  *  if exists, uses the actual one
	  *  else creates
	  */

	public static Logger getLogger() {
		
		if(logger == null)
		{
			logger = Logger.getRootLogger();
		}
		return logger;
	}

	/*
	 * Others
	 * */
	
	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		getLogger().debug(debug);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		getLogger().info(info);
	}

	public String getWarn() {
		return warn;
	}

	public void setWarn(String warn) {
		getLogger().warn(warn);
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		getLogger().error(error);
	}

	public String getFatal() {
		return fatal;
	}

	public void setFatal(String fatal) {
		getLogger().fatal(fatal);
	}

}
