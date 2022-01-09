package structural.facade;

public class Run {

	public static void main(String[] args) {
		try {
			// Создаем объект фасада Facade
			Construction constructor = new Construction();

			// Создаем объект фирмы
			Firm myfirm = new Firm("DreamBuilder", true, true, false);
			
			// Проверяем все ли разрешения есть у фирмы на строительство
			boolean allowable = constructor.IsAllowed(myfirm);

			System.out.println(myfirm.GetName() + ((allowable) ? " will build\n\n" : " won't build\n\n"));

		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}
	}
}
