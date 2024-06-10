package org.labs.lab3;

public class JavaProgramLab3 {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто" + "\n");
        System.out.println(study.printCourse());

        Car car1 = new Car("red", 1000);
        car1.setName("audi");
        System.out.println(car1);
        Car car2 = new Car();
        car2.setName("KIA");
        car2.setColor("green");
        car2.setWeight(1200);
        System.out.println(car2 + "\n");

        House house1 = new House();
        house1.setDate(1980);
        house1.setName("Дом на холме");
        house1.setNumberOfFloors(5);
        System.out.println(house1);
        System.out.println("Количество лет с момента постройки: " + house1.getAge());
        House house2 = new House();
        house2.setDate(2020);
        house2.setName("Дом у воды");
        house2.setNumberOfFloors(13);
        System.out.println(house2);
        System.out.println("Количество лет с момента постройки: " + house2.getAge() + "\n");

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(10, "береза");
        Tree tree3 = new Tree(5, true, "дуб");
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);


    }
}
