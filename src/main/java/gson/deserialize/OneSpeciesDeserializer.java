package gson.deserialize;

import com.google.gson.*;
import model.OneSpecies;

import java.lang.reflect.Type;

public class OneSpeciesDeserializer implements JsonDeserializer<OneSpecies> {

    @Override
    public OneSpecies deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        OneSpecies oneSpecies = new OneSpecies();
        oneSpecies.setName(jsonObject.get("name").getAsString());
        oneSpecies.setClassification(jsonObject.get("classification").getAsString());
        oneSpecies.setDesignation(jsonObject.get("designation").getAsString());
        oneSpecies.setAverage_height(jsonObject.get("average_height").getAsString());
        oneSpecies.setHair_color(jsonObject.get("hair_color").getAsString());
        oneSpecies.setSkin_color(jsonObject.get("skin_color").getAsString());
        oneSpecies.setEye_color(jsonObject.get("eye_color").getAsString());
        oneSpecies.setAverage_lifespan(jsonObject.get("average_lifespan").getAsString());
        oneSpecies.setHomeworld(jsonObject.get("homeworld").getAsString());
        oneSpecies.setLanguage(jsonObject.get("language").getAsString());
        JsonArray people = jsonObject.getAsJsonArray("people");
        for(JsonElement person : people) {
            if(person.isJsonPrimitive()) {
                oneSpecies.addPerson(person.getAsString());
            }
        }
        JsonArray films = jsonObject.getAsJsonArray("films");
        for(JsonElement film : films) {
            if(film.isJsonPrimitive()) {
                oneSpecies.addFilm(film.getAsString());
            }
        }
        oneSpecies.setCreated(jsonObject.get("created").getAsString());
        oneSpecies.setEdited(jsonObject.get("edited").getAsString());
        oneSpecies.setUrl(jsonObject.get("url").getAsString());
        return oneSpecies;
    }
}
