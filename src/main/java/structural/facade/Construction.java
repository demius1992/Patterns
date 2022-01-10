package structural.facade;

// Facade class. Carries out a comprehensive check
// for the availability of all licenses and access from the construction company
class Construction {
    private final EnvironmentalService eService;
    private final CityService cService;
    private final CountryService coService;

    public Construction() {
        eService = new EnvironmentalService();
        cService = new CityService();
        coService = new CountryService();
    }

    boolean IsAllowed(Firm pFirm) {
        System.out.println("\nLet's check for all permissions!\n");
        return cService.HasCityAccess(pFirm) && coService.HasBuildingLicense(pFirm) && eService.HasEnvironmentalAccess(pFirm);
    }
}
