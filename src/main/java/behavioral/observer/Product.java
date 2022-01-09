package behavioral.observer;

import java.util.Vector;

class Product
{
	// название
	private String name;
	// цена
	private double price;
	private Vector<Buyer> buyers;

	public Product(String pName,double pPrice) {
		name = pName;
		price = pPrice;
		buyers = new Vector<Buyer>();
	}
	
	// добавление конкретного покупателя
	public void Attach(Buyer pBuyer) { 
		buyers.add(pBuyer);
	}
	// удаление конкретного покупателя
	public void Detach(Buyer pBuyer) {
		int index = buyers.indexOf(pBuyer);
		if(index != -1) {
			buyers.remove(index);
		}
	}
	// сообщение всем покупателям об изменении состояния
	public void Notify() {
		for(int i = 0; i < buyers.size(); i++) {
			buyers.get(i).Update(this);
		}
		System.out.print("\n");	
	}

	public String GetName(){
		return name;
	}

	double GetPrice(){
		return price;
	}
	// установка новой цены и информирование покупателей об этом
	void SetPrice(double pPrice){
		if(price != pPrice)
		{
			price = pPrice;
			Notify();
		}
	}
}
