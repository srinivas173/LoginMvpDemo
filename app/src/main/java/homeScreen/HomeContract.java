package homeScreen;


import com.example.srini.loginmvpdemo.model.Data;

import java.util.List;

/**
 * Created by SRINI on 10/21/2018.
 */

public class HomeContract {

    interface View {
        void showList(List<Data> data);

        void showItem(String str);
    }

    interface Irowview {
        void setTitle(String title);

        void setGenre(String genre);

        void setYear(String year);

    }

    public interface Presenter {

        void getTitle(Data data, HomeContract.Irowview holder);

        void getGenere(Data data, HomeContract.Irowview holder);

        void getYear(Data data, HomeContract.Irowview holder);

        void getItem(String str);

        void getItem1(String data);

        void requestForModel();

    }

   public interface PrsntrReqModel{

         void giveMoviesList();
    }

    public interface ModelRespondPresenter {

         void getMoviesList(List<Data> data);
    }
}
