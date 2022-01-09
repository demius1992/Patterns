package behavioral.memento;

// класс CareTaker class
// used for a condition keeping
class MemoryState
{
	private Memento ptrMemento;
	public Memento GetMemento(){
		return ptrMemento;
	}
	public void SetMemento(Memento pMemento){
		ptrMemento = pMemento;
	}
}