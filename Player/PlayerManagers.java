
public class PlayerManagers {

	private Logger[] loggers;

	public PlayerManagers(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	public Logger[] getLoggers() {
		return loggers;
	}
	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
	void register(Players players) {
		System.out.println("UserName " + players.getUsername());
		System.out.println("password:"+ players.getPassword());
		Utils.RunLogger(loggers, players.getTc(), players.getFirstName(),players.getLastName() , players.getBirthYear());
		System.out.println("-----person is logging ------");
	}
}
