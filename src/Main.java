//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задача 1
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        // задача 2
        byte temerature = 8;
        if (temerature > 5) {
            System.out.println("На улице " + temerature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temerature + " градусов, нужно надеть шапку");
        }
        // задача 3
        short speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        // задача 4
        byte alsoAge = 23;
        if (alsoAge >= 2 && alsoAge <= 6) {
            System.out.println("Если возраст человека равен " + alsoAge + ", то ему нужно ходить в детский садик");
        }
        if (alsoAge >= 7 && alsoAge <= 17) {
            System.out.println("Если возраст человека равен " + alsoAge + ", то ему нужно ходить в школу");
        }
        if (alsoAge >= 18 && alsoAge <= 24) {
            System.out.println("Если возраст человека равен " + alsoAge + ", то ему нужно ходить в университет");
        }
        if (alsoAge > 24) {
            System.out.println("Если возраст человека равен " + alsoAge + ", то ему нужно ходить на работу");
        }
        // задача 5
        byte childrenAge = 8;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childrenAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childrenAge >= 5 && childrenAge < 14) {
            System.out.println("Если возраст ребёнка равен " + childrenAge + ", то ему можно кататься на аттракционе только с сопровождением взрослых");
        }
        if (childrenAge >= 14) {
            System.out.println("Если возраст ребёнка равен " + childrenAge + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
        // задача 6
        byte passengerCapacity = 102;
        byte seats = 60;
        short amountOfPassengers = 105;
        if (amountOfPassengers < passengerCapacity && amountOfPassengers < seats) {
            System.out.println("В вагоне есть сидячие места");
        } else if (amountOfPassengers < passengerCapacity && amountOfPassengers > seats) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В этом вагоне нет мест, он полностью забит");
        }
        // задача 7
        int one = 4;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " является наибольшим");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " является наибольшим");
        } else {
            System.out.println("Число " + three + " является наибольшим");
        }



    }
}