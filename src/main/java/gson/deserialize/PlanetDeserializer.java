package gson.deserialize;
import com.google.gson.*;
import model.Planet;

import java.lang.reflect.Type;

public class PlanetDeserializer implements JsonDeserializer<Planet> {

    @Override
    public Planet deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Planet planet = new Planet();
        planet.setName(jsonObject.get("name").getAsString());
        planet.setRotation_period(jsonObject.get("rotation_period").getAsString());
        planet.setOrbital_period(jsonObject.get("orbital_period").getAsString());
        planet.setDiameter(jsonObject.get("diameter").getAsString());
        planet.setClimate(jsonObject.get("climate").getAsString());
        planet.setGravity(jsonObject.get("gravity").getAsString());
        planet.setTerrain(jsonObject.get("terrain").getAsString());
        planet.setSurface_water(jsonObject.get("surface_water").getAsString());
        planet.setPopulation(jsonObject.get("population").getAsString());
        JsonArray residents = jsonObject.getAsJsonArray("residents");
        for(JsonElement resident : residents) {
            if(resident.isJsonPrimitive()) {
                planet.addResident(resident.getAsString());
            }
        }
        JsonArray films = jsonObject.getAsJsonArray("films");
        for(JsonElement film : films) {
            if(film.isJsonPrimitive()) {
                planet.addFilm(film.getAsString());
            }
        }
        planet.setCreated(jsonObject.get("created").getAsString());
        planet.setEdited(jsonObject.get("edited").getAsString());
        planet.setUrl(jsonObject.get("url").getAsString());
        return planet;
    }
}
