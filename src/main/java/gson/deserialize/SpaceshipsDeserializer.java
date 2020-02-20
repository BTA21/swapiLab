package gson.deserialize;

import com.google.gson.*;
import model.Spaceship;
import model.Spaceships;

import java.lang.reflect.Type;

public class SpaceshipsDeserializer implements JsonDeserializer<Spaceships> {
    @Override
    public Spaceships deserialize(JsonElement json, Type typeOfT,
                                  JsonDeserializationContext context) throws JsonParseException {
        Spaceships spaceships = new Spaceships();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arraySpaceships = jsonObject.getAsJsonArray();
        for (int i = 0; i < arraySpaceships.size(); i++) {
            Spaceship spaceship = context.deserialize(arraySpaceships.get(i), Spaceship.class);
            spaceships.addSpaceship(spaceship);
        }
        return spaceships;
    }
}
