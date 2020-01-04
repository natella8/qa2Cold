package Model;

//sozdala sama, proveritj !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class Weather {
    private Integer id;
    private String main;
    private String Description;
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void getMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
