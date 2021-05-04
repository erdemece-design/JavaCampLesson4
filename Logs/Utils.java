
public class Utils {
	public static void RunLogger(Logger[] loggers, String tc,String firstName, String lastName, String birthYear) {
		for(Logger logger : loggers) {
			logger.log(tc, firstName, lastName, birthYear);
		}
	}
}
