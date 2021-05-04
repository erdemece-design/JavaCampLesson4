

public class MailLogs implements Logger{

	@Override
	public void log(String tc, String firstName, String lastName, String birthYear) {
		System.out.println("*********************");
		System.out.println("information of Tc: " +tc);
		System.out.println("name: "+firstName);
		System.out.println("lastname: "+lastName);
		System.out.println("date of birth: "+birthYear);
		System.out.println("log to mail address");
		System.out.println("*********************");
		
	}

}
