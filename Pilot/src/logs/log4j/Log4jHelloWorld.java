package logs.log4j;


public class Log4jHelloWorld {
	
//	static Logger first = Logger.getLogger(WriteFirst.class);
//	static Logger second = Logger.getLogger(WriteSecond.class);
	
	public static void main(String[] args) {
	
//		BasicConfigurator.configure();
//		log.debug("This is a message");
		
		WriteFirst first = new WriteFirst("WriteFirst");
		WriteSecond second = new WriteSecond("WriteSecond");
		
		first.setMessage("Test Debug", 'D');
		second.setMessage("Test Report", 'D');
		
		
//		BasicConfigurator.configure();
//		first.debug("This is a message");
//		second.debug("This is a message");
		
//		first.getLogger("dasda");
		
		
	}
}
