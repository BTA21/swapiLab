package app.deserialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.deserialize.*;
import model.*;

import java.util.ArrayList;

public class Deserialize {
    Deserialize() throws UnirestException {
        Gson gson;
        String adress;
        String json;
        ArrayList<ArrayOfData> results = new ArrayList<>();
        HttpResponse<JsonNode> jsonResponse;

        adress = "http://swapi.co/api/films";
        jsonResponse = Unirest.get(adress)
                .asJson();


        gson = new Gson();
        json = jsonResponse.getBody().toString();
        Films films = gson.fromJson(json, Films.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Film.class, new FilmDeserializer())
                .registerTypeAdapter(Films.class, new FilmsDeserializer())
                .create();
        results.add(films);

        adress = "http://swapi.co/api/planets";
        jsonResponse = Unirest.get(adress)
                .asJson();


        gson = new Gson();
        json = jsonResponse.getBody().toString();
        Planets planets = gson.fromJson(json, Planets.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetDeserializer())
                .registerTypeAdapter(Planets.class, new PlanetsDeserializer())
                .create();
        results.add(planets);


        adress = "http://swapi.co/api/people";
        jsonResponse = Unirest.get(adress)
                .asJson();

        gson = new Gson();
        json = jsonResponse.getBody().toString();
        People people = gson.fromJson(json, People.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Person.class, new PersonDeserializer())
                .registerTypeAdapter(People.class, new PeopleDeserializer())
                .create();
        results.add(people);


        adress = "http://swapi.co/api/species";
        jsonResponse = Unirest.get(adress)
                .asJson();

        gson = new Gson();
        json = jsonResponse.getBody().toString();
        Species species = gson.fromJson(json, Species.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(OneSpecies.class, new OneSpeciesDeserializer())
                .registerTypeAdapter(Species.class, new SpeciesDeserializer())
                .create();
        results.add(species);

        adress = "http://swapi.co/api/vehicles";
        jsonResponse = Unirest.get(adress)
                .asJson();

        gson = new Gson();
        json = jsonResponse.getBody().toString();
        Vehicles vehicles = gson.fromJson(json, Vehicles.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Vehicle.class, new VehicleDeserializer())
                .registerTypeAdapter(Vehicles.class, new VehiclesDeserializer())
                .create();
        results.add(vehicles);

        adress = "http://swapi.co/api/starships";
        jsonResponse = Unirest.get(adress)
                .asJson();

        gson = new Gson();
        json = jsonResponse.getBody().toString();
        Spaceships spaceships = gson.fromJson(json, Spaceships.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Spaceship.class, new SpaceshipDeserializer())
                .registerTypeAdapter(Spaceships.class, new SpaceshipsDeserializer())
                .create();
        results.add(spaceships);
        DeserializeMenu1.AskMenu1(films, planets, people, species, spaceships, vehicles);

    }
}
