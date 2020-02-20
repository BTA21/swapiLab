package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.People;
import model.Person;

import java.lang.reflect.Type;

public class PeopleSerializer implements JsonSerializer<People> {
    @Override
    public JsonElement serialize(People src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(Person person : src.getPerson()) {
            result.add(person.getName(), context.serialize(person));
        }
        return result;
    }
}
