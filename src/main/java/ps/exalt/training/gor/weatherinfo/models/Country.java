package ps.exalt.training.gor.weatherinfo.models;

public class Country {

    public Country(String name) {
        this.name = name;
    }

    private String name;

    //region Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion
}
