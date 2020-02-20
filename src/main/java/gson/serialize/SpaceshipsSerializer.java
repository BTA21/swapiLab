package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.Spaceship;
import model.Spaceships;

import java.lang.reflect.Type;

public class SpaceshipsSerializer  implements JsonSerializer<Spaceships> {
    @Override
    public JsonElement serialize(Spaceships src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(Spaceship spaceship : src.getSpaceship()) {
            result.add(spaceship.getName(), context.serialize(spaceship));
        }
        return result;
    }
}
