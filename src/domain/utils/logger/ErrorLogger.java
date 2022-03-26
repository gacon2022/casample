package domain.utils.logger;

public class ErrorLogger extends Logger {

    public ErrorLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.err.println("ERROR: " + msg);
    }
}
