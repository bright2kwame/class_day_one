package bright.mobile.coinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        CoinAdapter coinAdapter = new CoinAdapter();
        recyclerView.setAdapter(coinAdapter);

        String url = "https://api.coinpaprika.com/v1/coins";

        Ion.with(this)
                .load(url)
                .asJsonArray()
                .withResponse()
                .setCallback(new FutureCallback<Response<JsonArray>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonArray> result) {
                        if (e != null || result.getHeaders().code() != 200) {
                            return;
                        }
                        JsonArray jsonArray = result.getResult();
                        jsonArray.forEach(item -> {
                            JsonObject jsonObject = item.getAsJsonObject();
                            //MARK: change the constructor to keep it simple
                            CoinItem coinItem = new CoinItem(jsonObject);

                        });
                    }
                });
    }
}