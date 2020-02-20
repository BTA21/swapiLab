package gson.deserialize;

import com.google.gson.*;
import model.Planet;
import model.Planets;

import java.lang.reflect.Type;

public class PlanetsDeserializer implements JsonDeserializer<Planets> {

    @Override
    public Planets deserialize(JsonElement json, Type typeOfT,
                               JsonDeserializationContext context) throws JsonParseException {
        Planets planets = new Planets();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arrayPlanets = jsonObject.getAsJsonArray();
        for(int i = 0; i < arrayPlanets.size(); i++) {
            Planet planet = context.deserialize(arrayPlanets.get(i), Planet.class);
            planets.addPlanet(planet);
        }
        return planets;
    }


}
