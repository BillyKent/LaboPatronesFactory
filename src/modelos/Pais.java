package modelos;

public class Pais {

    private Integer country_id;
    private String country;

    public Pais(Integer country_id, String country) {
        this.country_id = country_id;
        this.country = country;
    }

    public Pais() {
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "country_id=" + country_id +
                ", country='" + country + '\'' +
                '}';
    }
}
