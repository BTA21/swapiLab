package gson.deserialize;

import com.google.gson.*;
import model.Film;
import model.People;
import model.Person;

import java.lang.reflect.Type;

public class PeopleDeserializer implements JsonDeserializer<People> {
    @Override
    public People deserialize(JsonElement json, Type typeOfT,
                             JsonDeserializationContext context) throws JsonParseException {
        People people = new People();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arrayPeople = jsonObject.getAsJsonArray();
        for (int i = 0; i < arrayPeople.size(); i++) {
            Person person = context.deserialize(arrayPeople.get(i), Film.class);
            people.addPerson(person);
        }
        return people;
    }
}
