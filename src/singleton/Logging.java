package singleton;

public class Logging {

	private static Logging logging;

	private Logging() {

	}

	public Logging getInstance() {
		if (logging == null) {
			synchronized (Logging.class) {
				logging = new Logging();
			}
		}
		return logging;
	}
}
