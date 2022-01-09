package structural.facade;

// �����, ���������� �� �������� ������������� ����� �������������
class EnvironmentalService
{
	public EnvironmentalService() {}
	
	// ���� �� � ����� ���������� �� ������������� �� ������� ������������� ������
	public boolean HasEnvironmentalAccess(Firm pFirm) {
		return pFirm.GetEnvironmentalLicense();
	}
}