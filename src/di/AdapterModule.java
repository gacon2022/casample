package di;

import data.data_source.adapter.QuestionAdapterImpl;
import domain.repository.QuestionRepository;
import domain.use_case.question.QuestionAdapter;

public class AdapterModule {

    private volatile static AdapterModule module;

    public static synchronized AdapterModule getInstance() {
        if (module == null) {
            module = new AdapterModule();
        }
        return module;
    }

    public AdapterModule() {
    }

    public QuestionAdapter provideQuestionAdapter() {
        QuestionRepository repository = RepositoryModule.getInstance().provideQuestionRepository();
        return new QuestionAdapterImpl(repository);
    }


}
