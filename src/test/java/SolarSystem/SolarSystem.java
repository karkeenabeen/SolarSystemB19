package SolarSystem;

public class SolarSystem {
    public static void main(String[] args) {
        SolarSystemBase solar = new SolarSystemBase();
        solar.sun = "1";
        solar.planet = "2";
        solar.star = "2";
        System.out.println("the solar system is ready");
        //
        featureSun xros = new featureSun();
        xros.color = "pink";
        xros.temp = "23424Kv";
        xros.size = "OKm";
        //

        Planet1 renox=new Planet1();
        renox.color="grey";
        renox.size="10km";
        renox.radius="5m";

    }
}