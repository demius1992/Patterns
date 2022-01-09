package behavioral.observer;

// Класс ConcreteSubject
// Класс конкретного продукта
// В нашем случае машины
class Car extends Product
{
	public Car(String name, double price) {
		super(name, price);
	}
};