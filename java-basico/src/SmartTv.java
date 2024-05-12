public class SmartTv {
    boolean tvPower = false;
    int channel = 5;
    int volume = 3;

    public void pressPowerButton() {
        tvPower = !tvPower;
    }

    public void upChannel() {
        channel++;
    }

    public void downChannel() {
        channel--;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void upVolume() {
        volume++;
    }

    public void downVolume() {
        volume--;
    }
}
