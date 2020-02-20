package gson.serialize;

import com.google.gson.*;
import model.Film;

import java.lang.reflect.Type;

public class FilmSerializer implements JsonSerializer<Film> {
    @Override
    public JsonElement serialize(Film src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();

        result.addProperty("title", src.getTitle());
        result.addProperty("episode_id", src.getEpisode_id());
        result.addProperty("opening_crawl", src.getOpening_crawl());
        result.addProperty("director", src.getDirector());
        result.addProperty("producer", src.getProducer());
        result.addProperty("release_date", src.getRelease_date());
        JsonArray characters = new JsonArray();
        result.add("characters", characters);
        for(int i  = 0; i < src.getCharactersSize(); i++) {
            characters.add(src.getCharacters(i));
        }
        JsonArray planets = new JsonArray();
        result.add("planets", planets);
        for(int i  = 0; i < src.getPlanetsSize(); i++) {
            planets.add(src.getPlanets(i));
        }
        JsonArray starships = new JsonArray();
        result.add("starships", starships);
        for(int i = 0; i < src.getStarshipsSize(); i++) {
            starships.add(src.getStarships(i));
        }
        JsonArray vehicles = new JsonArray();
        result.add("vehicles", vehicles);
        for(int i  = 0; i < src.getVehiclesSize(); i++) {
            vehicles.add(src.getVehicles(i));
        }
        JsonArray species = new JsonArray();
        result.add("species", species);
        for(int i = 0; i < src.getSpeciesSize(); i++) {
            species.add(src.getSpecies(i));
        }
        result.addProperty("created", src.getCreated());
        result.addProperty("edited", src.getEdited());
        result.addProperty("url", src.getUrl());

        return result;
    }
}
