public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println("Теперь количество собак стало " + dog);
        cat = cat + 4;
        System.out.println("Теперь количество кошек стало " + cat);
        paper = paper + 4;
        System.out.println("Теперь количество бумаги стало " + paper);

        dog = dog - 3.5;
        System.out.println("Теперь количество собак стало " + dog);
        cat = cat - 1.6;
        System.out.println("Теперь количество кошек стало " + cat);
        paper = paper - 7639;
        System.out.println("Теперь количество бумаги стало " + paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOneBoxer = 78.2;
        System.out.println("Масса одного боксера " + weightOneBoxer + " кг");
        var weightSecondBoxer = 82.7;
        System.out.println("Масса второго боксера " + weightSecondBoxer + " кг");
        var totalWeight = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");

        var weightOver = weightSecondBoxer % weightOneBoxer;
        System.out.println(weightOver);

        var totalWorkTime = 640;
        System.out.println(totalWorkTime);
        var workTimeOnePerson = 8;
        System.out.println(workTimeOnePerson);
        var numberPersons = totalWorkTime / workTimeOnePerson;
        System.out.println("Всего работников в компании-" + numberPersons + " человек");
        numberPersons = numberPersons + 94;
        System.out.println(numberPersons);
        totalWorkTime = numberPersons * workTimeOnePerson;
        System.out.println("Если в компании работает " + numberPersons + " человека, то всего " + totalWorkTime + " часа работы может быть поделено между сотрудниками");
    }
}