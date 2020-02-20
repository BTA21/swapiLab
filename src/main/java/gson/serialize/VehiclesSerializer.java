package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.Vehicle;
import model.Vehicles;

import java.lang.reflect.Type;

public class VehiclesSerializer implements JsonSerializer<Vehicles> {
    @Override
    public JsonElement serialize(Vehicles src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(Vehicle vehicle : src.getVehicle()) {
            result.add(vehicle.getName(), context.serialize(vehicle));
        }
        return result;
    }
}
