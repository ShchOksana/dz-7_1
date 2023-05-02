public enum Planets {
    MERCURY(1, 0.0, 2439.7, "", "VENUS"),
    VENUS(2, 50.27, 6051.8, "MERCURY", "EARTH"),
    EARTH(3, 41.44, 6378.14, "VENUS", "MARS"),
    MARS(4, 78.39, 3397, "EARTH", "JUPITER"),
    JUPITER(5, 550.37, 71492, "MARS", "SATURN"),
    SATURN(6, 648.65, 60268, "JUPITER", "URANUS"),
    URANUS(7, 1448.26, 25559, "SATURN", "NEPTUNE"),
    NEPTUNE(8, 1629.12, 24764, "URANUS", "");

    private final int num; // порядковий номер від сонця
    private final double distancePreviousPlanet; // віддаленість від попередньої планети (для меркурія 0) - міліонів км.
    private double distanceSun;//віддаленість від сонця
    private final double radius; //радіус - км
    private final String previousPlanet; //попередня планета
    private final String nextPlanet; //наступна планета

    Planets(int num, double distancePreviousPlanet, double radius, String previousPlanet, String nextPlanet) {
        this.num = num;
        this.distancePreviousPlanet = distancePreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
        this.distanceSun = distanceSun + this.distancePreviousPlanet;
    }

    public int getNum() {
        return num;
    }

    public double getDistancePreviousPlanet() {
        return distancePreviousPlanet;
    }

    public double getRadius() {
        return radius;
    }

    public String getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }

    public double getDistanceSun() {
        return distanceSun;
    }
}


