package structural.facade;

// �����, ���������� �� �������� ������� �������� �� ������������� � �����
class CountryService
{
	public CountryService(){}
	
	// ���� �� � ����� �������� �� ������������� �� ������� ������
	public boolean HasBuildingLicense(Firm pFirm) {
		return pFirm.GetBuilderLicense();
	}
}