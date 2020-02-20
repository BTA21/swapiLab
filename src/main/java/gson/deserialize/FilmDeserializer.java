package gson.deserialize;

import com.google.gson.*;
import model.Film;

import java.lang.reflect.Type;

public class FilmDeserializer implements JsonDeserializer<Film> {

    @Override
    public Film deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Film film = new Film();
        film.setTitle(jsonObject.get("title").getAsString());
        film.setEpisode_id(jsonObject.get("episode_id").getAsString());
        film.setOpening_crawl(jsonObject.get("opening_crawl").getAsString());
        film.setDirector(jsonObject.get("director").getAsString());
        film.setProducer(jsonObject.get("producer").getAsString());
        film.setRelease_date(jsonObject.get("release_date").getAsString());
        JsonArray characters = jsonObject.getAsJsonArray("characters");
        for(JsonElement character : characters) {
            if(character.isJsonPrimitive()) {
                film.addCharacter(character.getAsString());
            }
        }
        JsonArray planets = jsonObject.getAsJsonArray("planets");
        for(JsonElement planet : planets) {
            if(planet.isJsonPrimitive()) {
                film.addPlanet(planet.getAsString());
            }
        }
        JsonArray starships = jsonObject.getAsJsonArray("starships");
        for(JsonElement starship : starships) {
            if(starship.isJsonPrimitive()) {
                film.addStarship(starship.getAsString());
            }
        }
        JsonArray vehicles = jsonObject.getAsJsonArray("vehicles");
        for(JsonElement vehicle : vehicles) {
            if(vehicle.isJsonPrimitive()) {
                film.addVehicle(vehicle.getAsString());
            }
        }
        JsonArray species = jsonObject.getAsJsonArray("species");
        for(JsonElement oneSpecies : species) {
            if(oneSpecies.isJsonPrimitive()) {
                film.addSpecies(oneSpecies.getAsString());
            }
        }
        film.setCreated(jsonObject.get("created").getAsString());
        film.setEdited(jsonObject.get("edited").getAsString());
        film.setUrl(jsonObject.get("url").getAsString());
        return film;
    }
}
