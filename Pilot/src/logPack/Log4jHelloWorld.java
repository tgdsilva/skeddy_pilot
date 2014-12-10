package logPack;

public class Log4jHelloWorld {
	
	public static void main(String[] args) {
	
		
	   /*
	    * This is generated automatically
	    * We can generate according with the specific error provided
	    * In this case, we can provide all the error messages
	    * */
		
	 /**  
	   File file = new File();
	   file.setDebug("This is the debug message");
	   file.setError("This is the error message");
	   file.setFatal("This is the fatal message");
	   file.setInfo("This is the info message");
	   file.setWarn("This is the warning message");
	   **/
		
		WriteFirst first = new WriteFirst();
		WriteTwice twice = new WriteTwice();
		
		//first.setDebugMessage("Test Debug");
		//twice.setMessage("Test Report");
		
		System.out.println(first.getDebugLog());
		System.out.println(twice.getReportsLogger());
	}
}
