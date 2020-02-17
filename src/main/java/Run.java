import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Run {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<JsonNode> jsonResponse = Unirest.get("https://swapi.co/api/planets")
                .asJson();
//        HttpResponse<JsonNode> response = Unirest.post("http://httpbin.org/post")
//                .header("accept", "application/json")
//                .queryString("apiKey", "123")
//                .field("parameter", "value")
//                .field("foo", "bar")
//                .asJson();
        System.out.println(jsonResponse.getBody());
    }
}
