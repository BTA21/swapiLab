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

import java.io.FileWriter;
import java.io.IOException;

public class Deserialize {
    public static void main(String[] args) throws UnirestException, IOException {
        Gson gson;
        Planets planets = null;
        HttpResponse<JsonNode> jsonResponse = Unirest.get("https://swapi.co/api/planets")
                .queryString("results",10)
                .asJson();

        gson = new Gson();
        String json = gson.toJson(jsonResponse.getBody().getObject().toString(1));

        gson = new GsonBuilder()
                .registerTypeAdapter(Planets.class, new PlanetsDeserializer())
                .registerTypeAdapter(Planet.class, new PlanetDeserializer())
                .create();


        gson.toJson(json, new FileWriter("D:\\SWAPI.json"));
        System.out.println(jsonResponse.getBody().getObject().toString(1));

    }
}
