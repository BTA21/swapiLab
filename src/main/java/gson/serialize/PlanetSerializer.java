package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.Planet;

import java.lang.reflect.Type;

public class PlanetSerializer implements JsonSerializer<Planet> {
    @Override
    public JsonElement serialize(Planet src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();

        result.addProperty("name", src.getName());
        result.addProperty("rotation_period", src.getRotation_period());
        result.addProperty("orbital_period", src.getOrbital_period());
        result.addProperty("diameter", src.getDiameter());
        result.addProperty("climate", src.getClimate());
        result.addProperty("gravity", src.getGravity());
        result.addProperty("terrain", src.getTerrain());
        result.addProperty("surface_water", src.getSurface_water());
        result.addProperty("population", src.getPopulation());
        for(int i  = 0; i < src.getRSize(); i++) {
            result.addProperty("resident", src.getResidents(i));
        }

        for(int i = 0; i < src.getFSize(); i++) {
            result.addProperty("films", src.getFilms(i));
        }
        result.addProperty("created", src.getCreated());
        result.addProperty("edited", src.getEdited());
        result.addProperty("url", src.getUrl());

        return result;
    }
}

