


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Assignment9 {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	
	public Assignment9(String fileName) {
		try {
			logmanager=LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		    filehandler=new FileHandler(fileName);
		    filehandler.setFormatter(new SimpleFormatter());
		    logger.addHandler(filehandler);
		   
	    
		    } catch(IOException e) {
		    e.printStackTrace();
	        }
	        }	
public void log(String logMessage) {
	logger.info(logMessage);
}
}