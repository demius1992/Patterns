package structural.facade;

// класс, отвечающий за проверку прав на строительство от городских служб
class CityService
{
	public CityService() {}
	
	// есть ли у фирмы разрешение на строительство со города
	public boolean HasCityAccess(Firm pFirm) {
		return pFirm.GetCityLicense();
	}
}