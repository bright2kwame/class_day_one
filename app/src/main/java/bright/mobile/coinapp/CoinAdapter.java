package bright.mobile.coinapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoinAdapter extends RecyclerView.Adapter<CoinViewHolder> {


    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_coin_item,parent,false);
        return new CoinViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
