package homeScreen;

import com.example.srini.loginmvpdemo.model.Data;
import com.example.srini.loginmvpdemo.model.DataSource;

import java.util.List;

/**
 * Created by SRINI on 10/21/2018.
 */

public class HomePresenter implements HomeContract.Presenter,HomeContract.ModelRespondPresenter {

    HomeContract.View view;
    HomeContract.PrsntrReqModel reqModel;
    HomeContract.ModelRespondPresenter modelRespondPresenter;

    public
    HomePresenter(HomeContract.View view) {
        this.view = view;
        reqModel=new DataSource(this);
    }

    @Override
    public void getTitle(Data data, HomeContract.Irowview holder) {
        holder.setTitle(data.getTitle());
    }

    @Override
    public void getGenere(Data data, HomeContract.Irowview holder) {

        holder.setGenre(data.getGenere());
    }

    @Override
    public void getYear(Data data, HomeContract.Irowview holder) {

        holder.setYear(data.getYear());
    }

    @Override
    public void getItem(String str) {

        view.showItem(str);

    }

    @Override
    public void getItem1(String data) {

    }

    @Override
    public void requestForModel() {
        reqModel.giveMoviesList();
    }

    @Override
    public void getMoviesList(List<Data> data) {

        view.showList(data);
    }
}
