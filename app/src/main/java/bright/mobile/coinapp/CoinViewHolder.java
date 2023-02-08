package bright.mobile.coinapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CoinViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageViewIcon;
    public CardView cardViewIconState;
    public TextView textViewTitle;
    public TextView textViewSubTitle;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewIcon = itemView.findViewById(R.id.imageViewIcon);
        cardViewIconState = itemView.findViewById(R.id.cardViewState);
        textViewTitle = itemView.findViewById(R.id.textViewTitle);
        textViewSubTitle = itemView.findViewById(R.id.textViewSubTitle);
    }
}
