package behavioral.state;

class StateB implements BaseState {
    public StateB() {
    }

    // change the state to another
    public void Handle(Context context) {
        System.out.printf("%s\n", GetNameOfState());
        context.SetState(new StateA());
    }

    public String GetNameOfState() {
        return "StateB";
    }
}
