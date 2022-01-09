package structural.facade;

// класс, отвечающий за проверку наличия лицензии на строительство у фирмы
class CountryService
{
	public CountryService(){}
	
	// есть ли у фирмы лицензия на строительство со стороны страны
	public boolean HasBuildingLicense(Firm pFirm) {
		return pFirm.GetBuilderLicense();
	}
}