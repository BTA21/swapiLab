package gson.deserialize;

import com.google.gson.*;
import model.Film;
import model.Films;

import java.lang.reflect.Type;

public class FilmsDeserializer implements JsonDeserializer<Films> {

    @Override
    public Films deserialize(JsonElement json, Type typeOfT,
                             JsonDeserializationContext context) throws JsonParseException {
        Films films = new Films();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonArray arrayFilms = jsonObject.getAsJsonArray();
        for (int i = 0; i < arrayFilms.size(); i++) {
            Film film = context.deserialize(arrayFilms.get(i), Film.class);
            films.addFilm(film);
        }
        return films;
    }
}
