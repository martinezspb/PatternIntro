/*

Паттерн проектирвоания программ - инкапсуляция поведения.
Задача: есть утка, но их херова туча типов, для нас надо грамотно
управлять свойствами, которыми может обладать утка. Здесь рассмотрено на примере кряканья и летания.

*/

public abstract class Duck {
    FlyProp flyprop; //образуем ссылочную переменную для свойств утки. Они лежат в интерфейсах.
    QuackProp quackProp;

    public Duck() {
    }
    public abstract void display();

    public void performFly() { //делегирование операции классам поведения.
        flyprop.fly();
    }

    public void performQuack() {
        quackProp.quack();
    }

    public void setFlyProp(FlyProp fp) {
        flyprop = fp;
    }
    public void setQuackProp(QuackProp qp) { //через этот сеттер мы можем назначить новое свойство в любом удобном нам месте
        quackProp = qp;
    }

}
