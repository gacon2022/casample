package di;

import data.data_source.database.dao.QuestionDAO;
import data.repository.QuestionRepositoryImpl;
import domain.repository.QuestionRepository;

public class RepositoryModule {
    private volatile static RepositoryModule module;

    public static synchronized RepositoryModule getInstance() {
        if (module == null) {
            module = new RepositoryModule();
        }
        return module;
    }

    public QuestionRepository provideQuestionRepository() {
        QuestionDAO dao = DAOModule.getInstance().provideQuestionDAO();
        MapperModule mapperModule = MapperModule.getInstance();

        return new QuestionRepositoryImpl(dao, mapperModule.provideQuestionMapper(), mapperModule.provideQuestionTypeMapper(), mapperModule.provideAnswerMapper());
    }
}
