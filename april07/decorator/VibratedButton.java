package april07.decorator;

/**
 * Created by root on 07.04.17.
 */
public class VibratedButton extends DecoratedButton {

    public VibratedButton(Button button) {
        super(button);
    }

    @Override
    void push() {
        super.push();
        System.out.print(" и вибрирует");
    }
}
