package domain.utils.logger;

public class WarningLogger extends Logger {
    public WarningLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("WARNING: " + msg);
    }
}
