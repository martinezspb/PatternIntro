public class FlyYes implements FlyProp { //в классе уже идет конкретизация возможности летания из абстракного интефейса
    @Override
    public void fly() {
        System.out.println("FLY!!!");
    }
}
