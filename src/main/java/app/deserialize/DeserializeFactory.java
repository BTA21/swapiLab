package app.deserialize;

import com.mashape.unirest.http.exceptions.UnirestException;

public  class DeserializeFactory {
    public static Deserialize deserializeData(Integer option) throws UnirestException {
        switch (option) {
            case 1:
                return new Deserialize();

            default:
                return null;
        }
    }
}
