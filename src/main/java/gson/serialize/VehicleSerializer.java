package gson.serialize;

import com.google.gson.*;
import model.Vehicle;

import java.lang.reflect.Type;

public class VehicleSerializer implements JsonSerializer<Vehicle> {
    @Override
    public JsonElement serialize(Vehicle src, Type typeOfSrc, JsonSerializationContext context)
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
        result.addProperty("vehicle_class", src.getVehicle_class());

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
