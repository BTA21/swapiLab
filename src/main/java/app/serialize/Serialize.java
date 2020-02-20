package app.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.serialize.PlanetSerializer;
import gson.serialize.PlanetsSerializer;
import model.Planet;
import model.Planets;

public class Serialize {
    Serialize() throws UnirestException {
        Gson gson = new Gson();
        Planets planets = new Planets();
        String json = gson.toJson(planets);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetSerializer())
                .registerTypeAdapter(Planets.class, new PlanetsSerializer())
                .create();
        System.out.println(json);
    }
}
