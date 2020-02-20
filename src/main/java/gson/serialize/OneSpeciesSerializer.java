package gson.serialize;

import com.google.gson.*;
import model.OneSpecies;

import java.lang.reflect.Type;

public class OneSpeciesSerializer implements JsonSerializer<OneSpecies> {
    @Override
    public JsonElement serialize(OneSpecies src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();

        result.addProperty("name", src.getName());
        result.addProperty("classification", src.getClassification());
        result.addProperty("designation", src.getDesignation());
        result.addProperty("average_height", src.getAverage_height());
        result.addProperty("hair_color", src.getHair_color());
        result.addProperty("skin_color", src.getSkin_color());
        result.addProperty("eye_color", src.getEye_color());
        result.addProperty("average_lifespan", src.getAverage_lifespan());
        result.addProperty("homeworld", src.getHomeworld());
        result.addProperty("language", src.getLanguage());

        JsonArray people = new JsonArray();
        result.add("people", people);
        for(int i = 0; i < src.getPeopleSize(); i++) {
            people.add(src.getPeople(i));
        }
        JsonArray films = new JsonArray();
        result.add("films", films);
        for(int i  = 0; i < src.getFilmsSize(); i++) {
            films.add(src.getFilms(i));
        }
        result.addProperty("created", src.getCreated());
        result.addProperty("edited", src.getEdited());
        result.addProperty("url", src.getUrl());

        return result;
    }
}
