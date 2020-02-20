package gson.deserialize;

import com.google.gson.*;
import model.Spaceship;

import java.lang.reflect.Type;

public class SpaceshipDeserializer implements JsonDeserializer<Spaceship> {

    @Override
    public Spaceship deserialize(JsonElement json, Type typeOfT,
                                  JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Spaceship spaceship = new Spaceship();
        spaceship.setName(jsonObject.get("name").getAsString());
        spaceship.setModel(jsonObject.get("model").getAsString());
        spaceship.setManufacturer(jsonObject.get("manufacturer").getAsString());
        spaceship.setCost_in_credits(jsonObject.get("cost_in_credits").getAsString());
        spaceship.setLength(jsonObject.get("length").getAsString());
        spaceship.setMax_atmosphering_speed(jsonObject.get("max_atmosphering_speed").getAsString());
        spaceship.setCrew(jsonObject.get("crew").getAsString());
        spaceship.setPassengers(jsonObject.get("passengers").getAsString());
        spaceship.setCargo_capacity(jsonObject.get("cargo_capacity").getAsString());
        spaceship.setConsumables(jsonObject.get("consumables").getAsString());
        spaceship.setHyperdrive_rating(jsonObject.get("hyperdrive_rating").getAsString());
        spaceship.setMGLT(jsonObject.get("MGLT").getAsString());
        spaceship.setStarship_class(jsonObject.get("starship_class").getAsString());
        JsonArray pilots = jsonObject.getAsJsonArray("pilots");
        for(JsonElement pilot : pilots) {
            if(pilot.isJsonPrimitive()) {
                spaceship.addPilot(pilot.getAsString());
            }
        }
        JsonArray films = jsonObject.getAsJsonArray("films");
        for(JsonElement film : films) {
            if(film.isJsonPrimitive()) {
                spaceship.addFilm(film.getAsString());
            }
        }
        spaceship.setCreated(jsonObject.get("created").getAsString());
        spaceship.setEdited(jsonObject.get("edited").getAsString());
        spaceship.setUrl(jsonObject.get("url").getAsString());
        return spaceship;
    }
}
