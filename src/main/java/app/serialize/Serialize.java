package app.serialize;

import app.deserialize.DeserializeMenu1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.serialize.*;
import model.*;

public class Serialize {
     public Serialize(Films films, Planets planets,
                      People people, Species species,
                      Spaceships spaceships, Vehicles vehicles) throws UnirestException {
        Gson gson = new Gson();
        String json1 = gson.toJson(planets);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Planet.class, new PlanetSerializer())
                .registerTypeAdapter(Planets.class, new PlanetsSerializer())
                .create();

        String json2 = gson.toJson(films);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Film.class, new FilmSerializer())
                .registerTypeAdapter(Films.class, new FilmsSerializer())
                .create();

        String json3 = gson.toJson(people);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Person.class, new PersonSerializer())
                .registerTypeAdapter(People.class, new PeopleSerializer())
                .create();

        String json4 = gson.toJson(species);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(OneSpecies.class, new OneSpeciesSerializer())
                .registerTypeAdapter(Species.class, new SpeciesSerializer())
                .create();

        String json5 = gson.toJson(spaceships);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Spaceship.class, new SpaceshipSerializer())
                .registerTypeAdapter(Spaceships.class, new SpaceshipsSerializer())
                .create();

        String json6 = gson.toJson(vehicles);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Vehicle.class, new VehicleSerializer())
                .registerTypeAdapter(Vehicles.class, new VehiclesSerializer())
                .create();
        DeserializeMenu1.AskMenu2(films, planets, people, species, spaceships, vehicles, json1, json2, json3, json4, json5, json6);
    }
}
