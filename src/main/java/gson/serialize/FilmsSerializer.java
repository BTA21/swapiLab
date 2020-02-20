package gson.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import model.Film;
import model.Films;

import java.lang.reflect.Type;

public class FilmsSerializer implements JsonSerializer<Films> {
    @Override
    public JsonElement serialize(Films src, Type typeOfSrc, JsonSerializationContext context)
    {
        JsonObject result = new JsonObject();
        for(Film film : src.getFilm()) {
            result.add(film.getTitle(), context.serialize(film));
        }
        return result;
    }
}
