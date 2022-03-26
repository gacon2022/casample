package di;

import data.data_source.mappers.QuestionMapper;
import data.data_source.mappers.QuestionTypeMapper;

public class MapperModule {
    private volatile static MapperModule module;

    public static synchronized MapperModule getInstance() {
        if (module == null) {
            module = new MapperModule();
        }
        return module;
    }

    public QuestionMapper provideQuestionMapper() {
        return new QuestionMapper();
    }

    public QuestionTypeMapper provideQuestionTypeMapper() {
        return new QuestionTypeMapper();
    }
}
