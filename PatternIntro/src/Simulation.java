public class Simulation {
    public static void main(String[] args) {
        Duck myduck = new MyDuck();
        myduck.performFly(); //Так как это объект класса дак, он передает управленние методам его класса, которые
        myduck.performQuack(); //делегируют выполнение кода конкретным реализацям, вызываемым согласно указанным в классе myduck
        Duck model = new ModelDuck();
        model.performFly(); //Так как это объект класса дак, он передает управленние методам его класса, которые
        model.performQuack(); //идет обращение к конструктору внутри класса объекта
        model.setQuackProp(new QuackSquezze()); //перепрограммируем с помощтю сеттера в даке возможность утки пищать
        model.performQuack(); //обращение к конструктору, который изменён

    }

}
