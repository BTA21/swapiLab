package gson.deserialize;

import com.google.gson.*;
import model.Vehicle;

import java.lang.reflect.Type;

public class VehicleDeserializer implements JsonDeserializer<Vehicle> {

    @Override
    public Vehicle deserialize(JsonElement json, Type typeOfT,
                                 JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Vehicle vehicle = new Vehicle();
        vehicle.setName(jsonObject.get("name").getAsString());
        vehicle.setModel(jsonObject.get("model").getAsString());
        vehicle.setManufacturer(jsonObject.get("manufacturer").getAsString());
        vehicle.setCost_in_credits(jsonObject.get("cost_in_credits").getAsString());
        vehicle.setLength(jsonObject.get("length").getAsString());
        vehicle.setMax_atmosphering_speed(jsonObject.get("max_atmosphering_speed").getAsString());
        vehicle.setCrew(jsonObject.get("crew").getAsString());
        vehicle.setPassengers(jsonObject.get("passengers").getAsString());
        vehicle.setCargo_capacity(jsonObject.get("cargo_capacity").getAsString());
        vehicle.setConsumables(jsonObject.get("consumables").getAsString());
        vehicle.setVehicle_class(jsonObject.get("vehicle_class").getAsString());
        JsonArray pilots = jsonObject.getAsJsonArray("pilots");
        for(JsonElement pilot : pilots) {
            if(pilot.isJsonPrimitive()) {
                vehicle.addPilot(pilot.getAsString());
            }
        }
        JsonArray films = jsonObject.getAsJsonArray("films");
        for(JsonElement film : films) {
            if(film.isJsonPrimitive()) {
                vehicle.addFilm(film.getAsString());
            }
        }
        vehicle.setCreated(jsonObject.get("created").getAsString());
        vehicle.setEdited(jsonObject.get("edited").getAsString());
        vehicle.setUrl(jsonObject.get("url").getAsString());
        return vehicle;
    }
}
