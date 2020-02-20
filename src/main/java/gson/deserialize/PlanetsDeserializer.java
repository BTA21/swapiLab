package gson.deserialize;
import com.google.gson.*;
import model.Planet;
import model.Planets;

import java.lang.reflect.Type;
import java.util.Map;

public class PlanetsDeserializer implements JsonDeserializer<Planets> {

    @Override
    public Planets deserialize(JsonElement json, Type typeOfT,
                               JsonDeserializationContext context) throws JsonParseException {
        Planets planets = new Planets();
        JsonObject jsonObject = json.getAsJsonObject();

        for(Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            Planet planet = context.deserialize(entry.getValue(), Planet.class);
            planets.addPlanet(planet);
            planets.setPlanets(planet);
        }
        return planets;
    }


}
