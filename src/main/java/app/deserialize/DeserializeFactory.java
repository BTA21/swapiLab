package app.deserialize;

import app.serialize.Serialize;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.*;

public  class DeserializeFactory {
    public static Deserialize deserializeData(Integer option) throws UnirestException {
        switch (option) {
            case 1:
                return new Deserialize();
            default:
                return null;
        }
    }
    public static Serialize serializeData(Integer option, Films films, Planets planets,
                                              People people, Species species,
                                              Spaceships spaceships, Vehicles vehicles) throws UnirestException {
        switch (option) {
              case 2:
                return new Serialize(films, planets, people, species, spaceships, vehicles);
            default:
                return null;
        }
    }
}
