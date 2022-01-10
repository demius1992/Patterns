package behavioral.state;

class StateA implements BaseState
{
	public StateA() {}
	
	// change the state to another
	public void Handle(Context context) {
		System.out.printf("%s\n",GetNameOfState());
		context.SetState(new StateB());

	}
	public String GetNameOfState() {
		return "StateA";
	}
}