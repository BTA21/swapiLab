package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.Planet;
import model.Planets;

import java.lang.reflect.Type;

public class PlanetsSerializer implements JsonSerializer<Planets> {
    @Override
    public JsonElement serialize(Planets src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(Planet planet : src.getPlanet()) {
            result.add(planet.getName(), context.serialize(planet));
        }
        return result;
    }
}
