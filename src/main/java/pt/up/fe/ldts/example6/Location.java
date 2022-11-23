package pt.up.fe.ldts.example6;

public class Location {
    private String latitude;
    private String longitude;
    private String name;

    public Location(String latitude, String longitude, String name){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public String getLatitude(){
        return this.latitude;
    }

    public String getLongitude(){
        return this.longitude;
    }

    public String getName(){
        return this.name;
    }

    public String toString() {
        return this.latitude + "," + this.longitude + " (" + this.name + ")";
    }


}
