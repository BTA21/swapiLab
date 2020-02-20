package client;

import app.deserialize.DeserializeMenu;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MyClient {
    public static void main(String[] args) throws UnirestException {
        DeserializeMenu.AskMenu();
    }
}
