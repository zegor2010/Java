public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV("Samsung");
        TV tv3 = new TV("LG", 123456);
        System.out.println(tv1);
        System.out.println(tv3.name + tv3.serialNumber);
        tv3.setVolume(20);
        System.out.println(tv3.volume);
        System.out.println();
        System.out.println(tv1.volume);
        System.out.println(tv1.chanel);
        System.out.println(tv1.isOn);
        System.out.println(tv1.name);
    }
}
