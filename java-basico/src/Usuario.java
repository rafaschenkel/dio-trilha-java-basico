public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.tvPower);
        System.out.println(smartTv.channel);
        System.out.println(smartTv.volume);

        smartTv.pressPowerButton();
        smartTv.upChannel();
        smartTv.upVolume();
        smartTv.upVolume();

        System.out.println("Tv ligada ? " + smartTv.tvPower);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.pressPowerButton();
        smartTv.downChannel();
        smartTv.downVolume();

        System.out.println("Tv ligada ? " + smartTv.tvPower);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.setChannel(12);

        System.out.println("Canal atual: " + smartTv.channel);
    }
}
