package domain.utils.logger;

public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2), WARNING(3), ERROR(4), ALL(255);

    private int level;

    private LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
