

public class Main {
    public static void printObject(Object temp) {
        System.out.println(temp.toString());
    }

    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Harry Potter", 17, 34, 33, 54, 8),
                new Gryffindor("Hermione Granger", 3, 9, 3, 9, 22),
                new Gryffindor("Ron Weasley", 12, 38, 41, 22, 55)
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Zachariah Smith", 12, 15, 43, 12, 77),
                new Puffenduy("Cedric Diggory", 31, 21, 33, 22, 14),
                new Puffenduy("Justin Finch-Fletcher", 33, 38, 65, 78, 34)
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou Chang", 13, 25, 34, 12, 77, 55),
                new Kogtevran("Padma Patil", 31, 21, 33, 22, 14, 66),
                new Kogtevran("Marcus Belby", 23, 77, 15, 78, 34, 89)
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 13, 25, 34, 12, 77, 55, 99),
                new Slytherin("Graham Montague", 44, 23, 33, 22, 14, 66, 78),
                new Slytherin("Gregory Goyle", 13, 17, 15, 78, 34, 89, 87)
        };

        Compare printMassage = new Compare();
        System.out.println("Сравнение учеников факультета Gryffindor");
        printMassage.printCompare(gryffindor);
        System.out.println("=============================================================================");
        System.out.println("Сравнение учеников факультета Puffenduys");
        printMassage.printCompare(puffenduys);
        System.out.println("=============================================================================");
        System.out.println("Сравнение учеников факультета Kogtevrans");
        printMassage.printCompare(kogtevrans);
        System.out.println("=============================================================================");
        System.out.println("Сравнение учеников факультета Slytherins");
        printMassage.printCompare(slytherins);
        System.out.println("=============================================================================");
        System.out.println("Сравнение 2х учеников Hogwarts");
        Hogwarts[] hogwarts = {gryffindor[0], slytherins[1]};
        printMassage.printCompare(hogwarts[0], hogwarts[1]);
        System.out.println("=============================================================================");
        System.out.println("Вывод на печать информации по 1 ученику с каждого факультета");
        printObject(gryffindor[0]);
        printObject(puffenduys[0]);
        printObject(kogtevrans[0]);
        printObject(slytherins[0]);
    }
}