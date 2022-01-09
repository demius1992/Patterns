package structural.facade;

// класс, отвечающий за проверку экологической части строительства
class EnvironmentalService
{
	public EnvironmentalService() {}
	
	// есть ли у фирмы разрешение на строительство со стороны экологической службы
	public boolean HasEnvironmentalAccess(Firm pFirm) {
		return pFirm.GetEnvironmentalLicense();
	}
}