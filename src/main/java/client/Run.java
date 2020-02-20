package client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.deserialize.PlanetDeserializer;
import gson.deserialize.PlanetsDeserializer;
import gson.serialize.PlanetSerializer;
import gson.serialize.PlanetsSerializer;
import model.Planet;
import model.Planets;
import util.PlanetsUlil;

public class Run {
    public static void main(String[] args) throws UnirestException {

        Planets planets = PlanetsUlil.createPlanets();
//        planets.showPlanets();


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetSerializer())
                .registerTypeAdapter(Planets.class, new PlanetsSerializer())
                .create();
        String json = gson.toJson(planets);
//        System.out.println(json);

        gson = new GsonBuilder()
//                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetDeserializer())
                .registerTypeAdapter(Planets.class, new PlanetsDeserializer())
                .create();
//        Planets planets1 = gson.fromJson(json, Planets.class);
//        gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .create();
//        System.out.println(gson.toJson(planets1));

    }
}
