package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.OneSpecies;
import model.Species;

import java.lang.reflect.Type;

public class SpeciesSerializer  implements JsonSerializer<Species> {
    @Override
    public JsonElement serialize(Species src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(OneSpecies oneSpecies : src.getOneSpecies()) {
            result.add(oneSpecies.getName(), context.serialize(oneSpecies));
        }
        return result;
    }
}
