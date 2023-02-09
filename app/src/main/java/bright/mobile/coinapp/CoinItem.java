package bright.mobile.coinapp;

import com.google.gson.JsonObject;

public class CoinItem {
    String id;
    String name;
    String symbol;
    int rank;
    boolean isNew;
    boolean isActive;
    String type;

    public CoinItem(JsonObject jsonObject) {
        this.id = jsonObject.get("id").getAsString();
        this.name = jsonObject.get("name").getAsString();
        this.symbol = jsonObject.get("symbol").getAsString();
        this.rank = jsonObject.get("rank").getAsInt();
        this.isNew = jsonObject.get("is_new").getAsBoolean();
        this.isActive = jsonObject.get("is_active").getAsBoolean();
        this.type = jsonObject.get("type").getAsString();
    }
}
