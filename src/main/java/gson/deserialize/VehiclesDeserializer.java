package gson.deserialize;

import com.google.gson.*;
import model.Vehicle;
import model.Vehicles;

import java.lang.reflect.Type;

public class VehiclesDeserializer  implements JsonDeserializer<Vehicles> {
    @Override
    public Vehicles deserialize(JsonElement json, Type typeOfT,
                                  JsonDeserializationContext context) throws JsonParseException {
        Vehicles vehicles = new Vehicles();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arrayVehicle = jsonObject.getAsJsonArray();
        for (int i = 0; i < arrayVehicle.size(); i++) {
            Vehicle vehicle = context.deserialize(arrayVehicle.get(i), Vehicle.class);
            vehicles.addVehicle(vehicle);
        }
        return vehicles;
    }
}
