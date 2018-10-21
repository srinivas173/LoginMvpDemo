package homeScreen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.srini.loginmvpdemo.R;
import com.example.srini.loginmvpdemo.model.Data;

import java.util.List;

/**
 * Created by SRINI on 10/21/2018.
 */

public class HomeActivity extends Activity implements HomeContract.View {

    HomeContract.Presenter presenter;
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        presenter = new HomePresenter(this);
        presenter.requestForModel();
    }


    @Override
    public void showList(List<Data> data) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        HomeScreenAdapter movies = new HomeScreenAdapter(context, data, presenter);
        recyclerView.setAdapter(movies);

    }

    @Override
    public void showItem(String str) {
        Toast.makeText(getApplicationContext(),"str",Toast.LENGTH_SHORT).show();

    }
}

