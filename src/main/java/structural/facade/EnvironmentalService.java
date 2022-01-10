package structural.facade;

// the class responsible for checking the ecological part of the building
class EnvironmentalService {
    public EnvironmentalService() {
    }

    // Does the company have a building permit from the environmental service
    public boolean HasEnvironmentalAccess(Firm pFirm) {
        return pFirm.GetEnvironmentalLicense();
    }
}