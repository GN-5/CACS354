package AddressBook;

public class Register {
    private String name;
    private String address;
    private float latitude;
    private float longitude;
    private String gender;
    private String[] languages;
    private String bloodGroup;

    public Register(String name, String address, float latitude, float longitude, String gender, String[] languages,
            String bloodGroup) {
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.gender = gender;
        this.languages = languages;
        this.bloodGroup = bloodGroup;
    }

    // Getters
    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name = name;
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