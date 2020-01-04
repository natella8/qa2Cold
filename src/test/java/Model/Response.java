package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Response {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private String visibility;
    private Wind wind;
    private Clouds clouds;
    private String dt;
    private Sys sys;
    private String id;
    private String name;
    private String cod;

    public Coord getCoord() {

        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {

        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {

        return base;
    }

    public void setBase(String base) {

        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }
// provereno!!!!!!!!!!!!!!!!!!!!!!
    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
// provereno!!!

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}


