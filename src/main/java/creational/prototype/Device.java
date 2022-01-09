package creational.prototype;

/*
 *  it's abstract base class Device.
 *  it determines method CloneIt, witch is  which is
 * the basis of the Prototype pattern
 */
abstract class Device {
    // name of device
    private String name;

    // abstract method
    // will be used for copies creation
    abstract Device CloneIt();

    // constructors
    public Device() {
        SetName("Unknown device");
    }

    public Device(String dname) {
        SetName(dname);
    }

    // additional methods
    public String GetName() {
        return name;
    }

    public void SetName(String dname) {
        name = dname;
    }

}
