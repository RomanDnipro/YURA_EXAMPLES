package april07.decorator;

public class Test {

    public static void main(String[] args) {

        Button button = new Button();
        button.push();
        System.out.println();

        button = new SoundButton(button);
        button.push();
        System.out.println();

        button = new VibratedButton(
                new LightedButton(
                        new VibratedButton(
                                new SoundButton(
                                        new VibratedButton(button)))));
        button.push();
    }

}