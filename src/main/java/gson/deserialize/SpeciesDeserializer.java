package gson.deserialize;

import com.google.gson.*;
import model.OneSpecies;
import model.Species;

import java.lang.reflect.Type;

public class SpeciesDeserializer implements JsonDeserializer<Species> {
    @Override
    public Species deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) throws JsonParseException {
        Species species = new Species();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arrayOneSpecies = jsonObject.getAsJsonArray();
        for (int i = 0; i < arrayOneSpecies.size(); i++) {
            OneSpecies oneSpecies = context.deserialize(arrayOneSpecies.get(i), OneSpecies.class);
            species.addOneSpecies(oneSpecies);
        }
        return species;
    }
}
