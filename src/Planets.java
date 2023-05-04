public enum Planets {
    MERCURY(1, 0.0, 2439.7, null),
    VENUS(2, 50.27, 6051.8, Planets.MERCURY),
    EARTH(3, 41.44, 6378.14, Planets.VENUS),
    MARS(4, 78.39, 3397, Planets.EARTH),
    JUPITER(5, 550.37, 71492, Planets.MARS),
    SATURN(6, 648.65, 60268, Planets.JUPITER),
    URANUS(7, 1448.26, 25559, Planets.SATURN),
    NEPTUNE(8, 1629.12, 24764, Planets.URANUS);

    private final int num; // порядковий номер від сонця
    private final double distancePreviousPlanet; // віддаленість від попередньої планети (для меркурія 0) - міліонів км.
    private double distanceSun;//віддаленість від сонця
    private double distanceSunToMercury = 57.89; //віддаленість від сонця до меркурія
    private final double radius; //радіус - км
//    private final String previousPlanet; //попередня планета
//    private String nextPlanet; //наступна планета

    Planets(int num, double distancePreviousPlanet, double radius, Planets previousPlanet) {
        this.num = num;
        this.distancePreviousPlanet = distancePreviousPlanet;
        this.radius = radius;
//        this.previousPlanet = previousPlanet;
//        this.nextPlanet = nextPlanet;
//        this.distanceSun = distanceSun + this.distancePreviousPlanet;
        if (previousPlanet == null) {
            this.distanceSun = distanceSunToMercury;
        } else {
            this.distanceSun = previousPlanet.distanceSun + distancePreviousPlanet;
        }
    }

    public int getNum() {
        return num;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public Planets getNextPlanet() {
        Planets nextPlanet = null;
        for (Planets planet: Planets.values()) {
            if (planet.num == this.num + 1) {
                nextPlanet = planet;
            }
        }
        return nextPlanet;
    }
}


