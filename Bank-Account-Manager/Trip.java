public class Trip{

    String destination;
    String startDate;
    String endDate;

    public Trip(String destination, String startDate, String endDate){
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void display()
    {
        System.out.println("Trip to " + destination + " From " + startDate + " to " + endDate );
    }
    public static void main(String[] args){

        Trip t = new Trip("Hyderabad", "2026-10-19", "2026-12-29");

        t.display();

    }
}