package di;

import domain.utils.logger.ErrorLogger;
import domain.utils.logger.LogLevel;
import domain.utils.logger.Logger;
import domain.utils.logger.WarningLogger;

public class LoggerModule {
    private volatile static LoggerModule module;

    public static synchronized LoggerModule getInstance() {
        if (module == null) {
            module = new LoggerModule();
        }
        return module;
    }

    public Logger provideLoggerChain() {
        WarningLogger warningLogger = new WarningLogger(LogLevel.WARNING);
        ErrorLogger errorLogger = new ErrorLogger(LogLevel.ERROR);
        warningLogger.setNext(errorLogger);
        return warningLogger;
    }
}
