public class MyDuck extends Duck { //Конкретный тип утки, в котором идет сеттинг его поведения через классы реализации
    public MyDuck() { //Запихиваем просто поведение в конструктор
        flyprop = new FlyYes(); //просто указываем ссыль на класс реализации!
        quackProp = new QuackYes();
    }
    public void display() {
        System.out.println("Hello, I am your Duck, i can Quack and fly!");
    }

}
