package AddressBook;

public class Register {
    public int id;
    private String name;
    private String email;
    private String address;
    private float latitude;
    private float longitude;
    private String gender;
    private String[] languages;
    private String bloodGroup;

    Register(int id, String name, String email, String address, float latitude, float longitude, String gender,
            String[] languages,
            String bloodGroup) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.gender = gender;
        this.languages = languages;
        this.bloodGroup = bloodGroup;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getGender() {
        return gender;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    // Setters
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}