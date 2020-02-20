package gson.serialize;

import com.google.gson.*;
import model.Person;

import java.lang.reflect.Type;

public class PersonSerializer implements JsonSerializer<Person> {
    @Override
    public JsonElement serialize(Person src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();

        result.addProperty("name", src.getName());
        result.addProperty("height", src.getHeight());
        result.addProperty("mass", src.getMass());
        result.addProperty("hair_color", src.getHair_color());
        result.addProperty("skin_color", src.getSkin_color());
        result.addProperty("eye_color", src.getEye_color());
        result.addProperty("birth_year", src.getBirth_year());
        result.addProperty("gender", src.getGender());
        result.addProperty("homeworld", src.getHomeworld());

        JsonArray films = new JsonArray();
        result.add("films", films);
        for(int i  = 0; i < src.getFilmsSize(); i++) {
            films.add(src.getFilms(i));
        }
        JsonArray species = new JsonArray();
        result.add("species", species);
        for(int i = 0; i < src.getSpeciesSize(); i++) {
            species.add(src.getSpecies(i));
        }
        JsonArray vehicles = new JsonArray();
        result.add("vehicles", vehicles);
        for(int i  = 0; i < src.getVehiclesSize(); i++) {
            vehicles.add(src.getVehicles(i));
        }
        JsonArray starships = new JsonArray();
        result.add("starships", starships);
        for(int i = 0; i < src.getStarshipsSize(); i++) {
            starships.add(src.getStarships(i));
        }
        result.addProperty("created", src.getCreated());
        result.addProperty("edited", src.getEdited());
        result.addProperty("url", src.getUrl());

        return result;
    }
}
