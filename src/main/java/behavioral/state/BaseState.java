package behavioral.state;

interface BaseState {
    void Handle(Context context);

    String GetNameOfState();
}
