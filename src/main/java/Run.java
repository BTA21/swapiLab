import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.*;

import gson.deserialize.*;

public class Run {
    public static void main(String[] args) throws UnirestException {
        Gson gson;

//        Planets planets = PlanetsUlil.createPlanets();
        HttpResponse<JsonNode> jsonResponse = Unirest.get("https://swapi.co/api/planets/")
                .asJson();

//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
////                .registerTypeAdapter(Planet.class, new PlanetSerializer())
////                .registerTypeAdapter(Planets.class, new PlanetsSerializer())
//                .create();
        gson = new Gson();
        String json = gson.toJson(jsonResponse.getBody());
//        System.out.println(json);

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

    }
}
