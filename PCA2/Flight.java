public class Flight extends Thread{
    String flightName, operation;
    Flight(Runway runway, String name, String operation){
        this.flightName = name;
        this.operation = operation;
    }

    Runway rw = new Runway(1);

    @Override
    public void run(){
        rw.useRunway(flightName, operation);
    }
}