package structural.facade;

// class in charge of checking building rights from city services
class CityService {
    public CityService() {
    }

    // does the company have a building permit from the city
    public boolean HasCityAccess(Firm pFirm) {
        return pFirm.GetCityLicense();
    }
}