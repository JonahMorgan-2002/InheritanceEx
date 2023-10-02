public class GeoObject {
    private String color;
    private java.util.Date dateCreated;
    public static void main(String args[]){
        GeoObject geoObject = new GeoObject();
        System.out.println(geoObject.color);
        System.out.println(geoObject.dateCreated);

    }
    GeoObject(){
        color = "Purple";
        dateCreated = new java.util.Date();
    }

}
