package gson.serialize;

import com.google.gson.*;
import model.Spaceship;

import java.lang.reflect.Type;

public class SpaceshipSerializer implements JsonSerializer<Spaceship> {
    @Override
    public JsonElement serialize(Spaceship src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();

        result.addProperty("name", src.getName());
        result.addProperty("model", src.getModel());
        result.addProperty("manufacturer", src.getManufacturer());
        result.addProperty("cost_in_credits", src.getCost_in_credits());
        result.addProperty("length", src.getLength());
        result.addProperty("max_atmosphering_speed", src.getMax_atmosphering_speed());
        result.addProperty("crew", src.getCrew());
        result.addProperty("passengers", src.getPassengers());
        result.addProperty("cargo_capacity", src.getCargo_capacity());
        result.addProperty("consumables", src.getConsumables());
        result.addProperty("hyperdrive_rating", src.getHyperdrive_rating());
        result.addProperty("MGLT", src.getMGLT());
        result.addProperty("starship_class", src.getStarship_class());

        JsonArray pilots = new JsonArray();
        result.add("pilots", pilots);
        for(int i  = 0; i < src.getPilotsSize(); i++) {
            pilots.add(src.getPilots(i));
        }
        JsonArray films = new JsonArray();
        result.add("films", films);
        for(int i = 0; i < src.getFilmsSize(); i++) {
            films.add(src.getFilms(i));
        }
        result.addProperty("created", src.getCreated());
        result.addProperty("edited", src.getEdited());
        result.addProperty("url", src.getUrl());

        return result;
    }
}
