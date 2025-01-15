package expeditors.capstone01.domian_r;


public class Track {

    private int id;

    private String name;

    private int year;

    private String location;

    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
