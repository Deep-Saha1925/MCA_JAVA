class Runway {

    int runwayNumber;
    Runway(int rN){
        runwayNumber = rN;
    }

    synchronized void useRunway(String flightName, String operation){
        System.out.println("Flight " + flightName + " " + operation + " on runway no: " + this.runwayNumber);
    }
}
