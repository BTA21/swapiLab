package app.deserialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.deserialize.PlanetDeserializer;
import gson.deserialize.PlanetsDeserializer;
import model.Planet;
import model.Planets;

import java.io.IOException;

public class Deserialize {
    public static void main(String[] args) throws UnirestException, IOException {
        Gson gson;

        HttpResponse<JsonNode> jsonResponse = Unirest.get("https://swapi.co/api/planets/")
                .asJson();


        gson = new Gson();
        String json = gson.toJson(jsonResponse.getBody().getObject().getJSONArray("resultst"));

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetDeserializer())
                .registerTypeAdapter(Planets.class, new PlanetsDeserializer())
                .create();
        Planets planets1 = gson.fromJson(json, Planets.class);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(planets1));


        System.out.println(jsonResponse.getBody().getObject().getJSONArray("results").getJSONObject(0).get("name"));
        System.out.println(jsonResponse.getBody().getObject().getJSONArray("results").getJSONObject(0));
        System.out.println(jsonResponse.getBody().getObject().getJSONArray("results"));
        System.out.println(jsonResponse.getBody().getObject());
        System.out.println(jsonResponse.getBody());

    }
}
