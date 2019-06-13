public class ModelDuck extends Duck {
    public ModelDuck() { //Запихиваем просто поведение в конструктор
        flyprop = new FlyNo(); //просто указываем ссыль на класс реализации!
        quackProp = new QuackNo();
    }
    public void display() {
        System.out.println("model");
    }
}
