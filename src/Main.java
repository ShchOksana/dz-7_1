public class Main {
    public static void main(String[] args) {
        double distanceSun = 57.89; //віддаленість від сонця до меркурія

        for (Planets planet: Planets.values()) {
            distanceSun += planet.getDistanceSun();
            System.out.println(planet.getNum() + " " + planet + " Віддаленість від сонця: " + distanceSun);
        }
    }
}