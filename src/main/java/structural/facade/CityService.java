package structural.facade;

// �����, ���������� �� �������� ���� �� ������������� �� ��������� �����
class CityService
{
	public CityService() {}
	
	// ���� �� � ����� ���������� �� ������������� �� ������
	public boolean HasCityAccess(Firm pFirm) {
		return pFirm.GetCityLicense();
	}
}