package modelos;

public class Pais {
    private String country_id;
    private String country;

    public Pais(String country_id, String country) {
        this.country_id = country_id;
        this.country = country;
    }

    public Pais() {
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Jenis";
    }
}
