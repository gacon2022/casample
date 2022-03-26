package data.data_source.database;

// Lớp đại diện cho việc kết nối tới cơ sở dữ liệu
public class QuestionAppDatabase {

    private volatile static QuestionAppDatabase database;

    public static synchronized QuestionAppDatabase getInstance() {
        if (database == null) {
            database = new QuestionAppDatabase();
        }
        return database;
    }

    public QuestionAppDatabase() {
    }
}
