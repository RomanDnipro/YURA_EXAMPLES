package april07.adapter;

public class DviToVga extends VGA {

    private DVI dvi;

    public DviToVga(DVI dvi) {
        this.dvi = dvi;
    }

    @Override
    void getPicture() {
        dvi.getPicture();
    }
}
