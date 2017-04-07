package april07.decorator;

public abstract class DecoratedButton extends Button {

    protected Button button;

    public DecoratedButton(Button button) {
        this.button = button;
    }

    @Override
    void push() {
        button.push();
    }

}
