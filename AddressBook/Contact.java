package AddressBook;

public class Contact {
    public int id;
    private String name;
    private String email;
    private String address;
    private float latitude;
    private float longitude;
    private String location;
    private String gender;
    private String[] languages;
    private String bloodGroup;

    public Contact(int id, String name, String email, String address, float latitude, float longitude, String gender,
            String[] languages,
            String bloodGroup) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = latitude + " | " + longitude;
        this.gender = gender;
        this.languages = languages;
        this.bloodGroup = bloodGroup;
    }

    public Contact(int id, String name, String email, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
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

    public String getLocation() {
        return location;
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

    public void setLocation(float latitude, float longitude) {
        String location = latitude + " | " + longitude;
        this.location = location;

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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nAddress: " + address + "\nLocation: "
                + location + "\nGender";
    }
}