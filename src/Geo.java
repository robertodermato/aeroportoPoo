public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static double calculaDistancia(Geo geo1, Geo geo2) {

        //raio Terra
        double raioTerra = 6371;

        //converte para radianos as coordenadas dos aeroportos de origem e destino
        double latitudeRadOrigem = Math.toRadians(geo1.getLatitude());
        double longitudeRadOrigem = Math.toRadians(geo1.getLongitude());
        double latitudeRadDestino = Math.toRadians(geo2.getLatitude());
        double longitudeRadDestino = Math.toRadians(geo2.getLongitude());

        //calcula senos e cossenos
        double senoLatitudes = Math.sin((latitudeRadOrigem-latitudeRadDestino)*1.0)/2;
        double senoLongitudes = Math.sin((longitudeRadOrigem-longitudeRadDestino)*1.0)/2;
        double cossenoLatOrigem = Math.cos(latitudeRadOrigem);
        double cossenoLatDestino = Math.cos(latitudeRadDestino);

        //calcula a parte interna da raiz da fórmula de haversine
        double raiz = senoLatitudes*senoLatitudes + senoLongitudes*senoLongitudes*cossenoLatOrigem*cossenoLatDestino;

        //calcula a distância
        double distancia = 2*raioTerra*Math.asin(Math.sqrt(raiz));

        return distancia;
    }

    @Override
    public String toString(){
        return "Latitude: " + latitude + " Longitude: "+ longitude + "\n";
    }
}