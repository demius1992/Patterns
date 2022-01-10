package structural.facade;

public class Run {

    public static void main(String[] args) {
        try {
            // Create a Facade object
            Construction constructor = new Construction();

            // Create a firm object
            Firm myfirm = new Firm("DreamBuilder", true, true, false);

            // We check whether the company has all the permits for construction
            boolean allowable = constructor.IsAllowed(myfirm);

            System.out.println(myfirm.GetName() + ((allowable) ? " will build\n\n" : " won't build\n\n"));

        } catch (Exception ex) {
            System.out.println("Exception happened! Exception description\n" + ex.getMessage());
        }
    }
}
