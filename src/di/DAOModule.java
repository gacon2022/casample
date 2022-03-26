package di;

import data.data_source.database.dao.QuestionDAO;
import data.data_source.database.dao.QuestionDAOImpl;

public class DAOModule {
    private volatile static DAOModule module;

    public static synchronized DAOModule getInstance(){
        if (module == null){
            module = new DAOModule();
        }
        return module;
    }

    public QuestionDAO provideQuestionDAO(){
        return new QuestionDAOImpl();
    }
}
