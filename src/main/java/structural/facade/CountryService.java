package structural.facade;

// the class responsible for checking the firm's building license
class CountryService {
    public CountryService() {
    }

    // does the company have a building license from the country
    public boolean HasBuildingLicense(Firm pFirm) {
        return pFirm.GetBuilderLicense();
    }
}