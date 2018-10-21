package homeScreen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.srini.loginmvpdemo.R;
import com.example.srini.loginmvpdemo.model.Data;

import java.util.List;

/**
 * Created by SRINI on 10/21/2018.
 */

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.ViewHolder> {

    private Context context;
    private List<Data> data;
    HomeContract.Presenter presenter;
    private View view;

    public HomeScreenAdapter(Context context, List<Data> data, HomeContract.Presenter presenter) {
        this.context = context;
        this.data = data;
        this.presenter = presenter;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new HomeScreenAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeScreenAdapter.ViewHolder holder, int position) {

        presenter.getTitle(data.get(position), holder);
        presenter.getGenere(data.get(position), holder);
        presenter.getYear(data.get(position), holder);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, HomeContract.Irowview {

        TextView title, genre, year;


        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            genre = (TextView) itemView.findViewById(R.id.genre);
            year = (TextView) itemView.findViewById(R.id.year);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            presenter.getItem(data.get(getLayoutPosition()).getTitle());
            presenter.getItem(data.get(getLayoutPosition()).getGenere());
        }

        @Override
        public void setTitle(String title1) {
            title.setText(title1);
        }

        @Override
        public void setGenre(String genre1) {

            genre.setText(genre1);
        }

        @Override
        public void setYear(String year1) {

            year.setText(year1);

        }
    }
}
