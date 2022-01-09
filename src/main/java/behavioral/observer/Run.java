package behavioral.observer;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// создали объект машины с начальной ценой 100 000
			Car bmw = new Car("bmw X9", 100000);

			// создали объекты потенциальных покупателей машины
			UkrainianBuyer firstBuyer = new UkrainianBuyer("Petr Mikolaenko");
			UkrainianBuyer secondBuyer = new UkrainianBuyer("Oleg Kononenko");

			// покупатели интересуются конкретной машиной
			bmw.Attach(firstBuyer);
			bmw.Attach(secondBuyer);

			// снижение цены машины, заинтересованные покупатели тут же узнают об этом
			bmw.SetPrice(80000);
			bmw.SetPrice(70000);
			bmw.SetPrice(60000);
			
			bmw.Detach(secondBuyer);
			bmw.SetPrice(90000);
	
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
