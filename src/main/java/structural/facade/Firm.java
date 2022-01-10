package structural.facade;

// Firm class
class Firm {
    // constructor and destructor
    public Firm() {
        builderLicense = false;
        name = "";
    }

    public Firm(String fName, boolean bLicense, boolean eLicense, boolean cLicense) {
        builderLicense = bLicense;
        name = fName;
        environmentalLicense = eLicense;
        cityLicense = cLicense;
    }

    // company name
    private String name;
    // does the company have a building license
    private boolean builderLicense;
    // is there an environmental permit
    private boolean environmentalLicense;
    // is there a permit from the city
    private boolean cityLicense;

    // functions for working with name
    public String GetName() {
        return name;
    }

    public void SetName(String fName) {
        name = fName;
    }

    // functions for working with a building license
    public boolean GetBuilderLicense() {
        return builderLicense;
    }

    public void SetBuilderLicense(boolean bLicense) {
        builderLicense = bLicense;
    }

    // functions for working with environmental permit
    public boolean GetEnvironmentalLicense() {
        return environmentalLicense;
    }

    public void SetEnvironmentalLicense(boolean eLicense) {
        environmentalLicense = eLicense;
    }

    // functions for working with city permit
    public boolean GetCityLicense() {
        return cityLicense;
    }

    public void SetCityLicense(boolean cLicense) {
        cityLicense = cLicense;
    }
}

