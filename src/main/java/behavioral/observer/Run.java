package behavioral.observer;

public class Run {

    public Run() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        try {
            // created a car object with an initial price of 100,000
            Car bmw = new Car("bmw X9", 100000);

            // created objects of potential buyers of the car
            UkrainianBuyer firstBuyer = new UkrainianBuyer("Petr Mikolaenko");
            UkrainianBuyer secondBuyer = new UkrainianBuyer("Oleg Kononenko");

            // buyers are interested in a specific machine
            bmw.Attach(firstBuyer);
            bmw.Attach(secondBuyer);

            // reduction in the price of the car, interested buyers will immediately know about it
            bmw.SetPrice(80000);
            bmw.SetPrice(70000);
            bmw.SetPrice(60000);

            bmw.Detach(secondBuyer);
            bmw.SetPrice(90000);

        } catch (Exception ex) {
            System.out.printf("Exception happened! Exception description: %s \n", ex.getMessage());
        }
    }
}
