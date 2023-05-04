public class Main {
    public static void main(String[] args) {
//        double distanceSun1 = 57.89; //віддаленість від сонця до меркурія

        for (Planets planet: Planets.values()) {
//            distanceSun1 += planet.getDistanceSun();
            System.out.println(planet.getNum() + " " + planet + " Віддаленість від сонця: " + planet.getDistanceSun() + " Наступна планета: " + planet.getNextPlanet());
        }
    }
}