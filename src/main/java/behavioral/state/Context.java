package behavioral.state;

// context class
// his inner state will change
class Context {
    // variable for internal state
    private BaseState pCurrent;

    public Context(BaseState pTemp) {
        pCurrent = pTemp;
    }

    // return the internal state
    public BaseState GetState() {
        return pCurrent;
    }

    // change the internal state
    public void SetState(BaseState pTemp) {
        pCurrent = pTemp;
    }

    // we perform some action as a result of which the internal state changes
    public void Request() {
        pCurrent.Handle(this);
    }
}