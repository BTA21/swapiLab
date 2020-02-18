package util;
import model.*;

public class PlanetsUlil {
    public static Planets createPlanets() throws NullPointerException
    {
        Planets result = new Planets();

        Planet tmpPlanet;

        tmpPlanet = new Planet();
        tmpPlanet.setName("Alderaan");
        tmpPlanet.setRotation_period("24");
        tmpPlanet.setOrbital_period("364");
        tmpPlanet.setDiameter("12500");
        tmpPlanet.setClimate("temperate");
        tmpPlanet.setGravity("1 standard");
        tmpPlanet.setTerrain("grasslands, mountains");
        tmpPlanet.setSurface_water("40");
        tmpPlanet.setPopulation("2000000000");
        tmpPlanet.addResident("https://swapi.co/api/people/5/");
        tmpPlanet.addResident("https://swapi.co/api/people/68/");
        tmpPlanet.addResident("https://swapi.co/api/people/81/");
        tmpPlanet.addFilm("https://swapi.co/api/films/6/");
        tmpPlanet.addFilm("https://swapi.co/api/films/1/");
        tmpPlanet.setCreated("2014-12-10T11:35:48.479000Z");
        tmpPlanet.setEdited("2014-12-20T20:58:18.420000Z");
        tmpPlanet.setUrl("https://swapi.co/api/planets/2/");
        result.addPlanet(tmpPlanet);

        tmpPlanet = new Planet();
        tmpPlanet.setName("Yavin IV");
        tmpPlanet.setRotation_period("24");
        tmpPlanet.setOrbital_period("4818");
        tmpPlanet.setDiameter("10200");
        tmpPlanet.setClimate("temperate, tropical");
        tmpPlanet.setGravity("1 standard");
        tmpPlanet.setTerrain("jungle, rainforests");
        tmpPlanet.setSurface_water("8");
        tmpPlanet.setPopulation("1000");
        tmpPlanet.addResident();
        tmpPlanet.addFilm("https://swapi.co/api/films/1/");
        tmpPlanet.setCreated("2014-12-10T11:37:19.144000Z");
        tmpPlanet.setEdited("2014-12-20T20:58:18.421000Z");
        tmpPlanet.setUrl("https://swapi.co/api/planets/3/");
        result.addPlanet(tmpPlanet);

        tmpPlanet = new Planet();
        tmpPlanet.setName("Hoth");
        tmpPlanet.setRotation_period("23");
        tmpPlanet.setOrbital_period("549");
        tmpPlanet.setDiameter("7200");
        tmpPlanet.setClimate("frozen");
        tmpPlanet.setGravity("1.1 standard");
        tmpPlanet.setTerrain("tundra, ice caves, mountain ranges");
        tmpPlanet.setSurface_water("100");
        tmpPlanet.setPopulation("unknown");
        tmpPlanet.addResident();
        tmpPlanet.addFilm("https://swapi.co/api/films/2/");
        tmpPlanet.setCreated("2014-12-10T11:39:13.934000Z");
        tmpPlanet.setEdited("2014-12-20T20:58:18.423000Z");
        tmpPlanet.setUrl("https://swapi.co/api/planets/4/");
        result.addPlanet(tmpPlanet);

        return result;
    }
}
