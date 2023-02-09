package bright.mobile.coinapp;

import com.google.gson.JsonObject;

public class CoinItem {
    private final String id;
    private final String name;
    private final String symbol;
    private final int rank;
    private final boolean isNew;
    private final boolean isActive;
    private final String type;

    public CoinItem(JsonObject jsonObject) {
        this.id = jsonObject.get("id").getAsString();
        this.name = jsonObject.get("name").getAsString();
        this.symbol = jsonObject.get("symbol").getAsString();
        this.rank = jsonObject.get("rank").getAsInt();
        this.isNew = jsonObject.get("is_new").getAsBoolean();
        this.isActive = jsonObject.get("is_active").getAsBoolean();
        this.type = jsonObject.get("type").getAsString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getRank() {
        return rank;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getType() {
        return type;
    }
}
