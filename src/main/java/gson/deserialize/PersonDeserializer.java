package gson.deserialize;

import com.google.gson.*;
import model.Person;

import java.lang.reflect.Type;

public class PersonDeserializer implements JsonDeserializer<Person> {

    @Override
    public Person deserialize(JsonElement json, Type typeOfT,
                              JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Person person = new Person();
        person.setName(jsonObject.get("name").getAsString());
        person.setHeight(jsonObject.get("height").getAsString());
        person.setMass(jsonObject.get("mass").getAsString());
        person.setHair_color(jsonObject.get("hair_color").getAsString());
        person.setSkin_color(jsonObject.get("skin_color").getAsString());
        person.setEye_color(jsonObject.get("eye_color").getAsString());
        person.setBirth_year(jsonObject.get("birth_year").getAsString());
        person.setGender(jsonObject.get("gender").getAsString());
        person.setHomeworld(jsonObject.get("homeworld").getAsString());
        JsonArray films = jsonObject.getAsJsonArray("films");
        for(JsonElement film : films) {
            if(film.isJsonPrimitive()) {
                person.addFilm(film.getAsString());
            }
        }
        JsonArray species = jsonObject.getAsJsonArray("species");
        for(JsonElement oneSpecies : species) {
            if(oneSpecies.isJsonPrimitive()) {
                person.addOneSpecies(oneSpecies.getAsString());
            }
        }
        JsonArray vehicles = jsonObject.getAsJsonArray("vehicles");
        for(JsonElement vehicle : vehicles) {
            if(vehicle.isJsonPrimitive()) {
                person.addVehicle(vehicle.getAsString());
            }
        }
        JsonArray starships = jsonObject.getAsJsonArray("starships");
        for(JsonElement starship : starships) {
            if(starship.isJsonPrimitive()) {
                person.addStarship(starship.getAsString());
            }
        }
        person.setCreated(jsonObject.get("created").getAsString());
        person.setEdited(jsonObject.get("edited").getAsString());
        person.setUrl(jsonObject.get("url").getAsString());
        return person;
    }
}
