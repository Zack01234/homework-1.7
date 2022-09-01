public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s.", fullName);
        System.out.println();

        //Задание 2
        String fullName1 = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s.", fullName1);
        System.out.println();

        //Задание 3
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        System.out.printf("Данные ФИО сотрудника — %s.", fullName2.replace('ё', 'е'));
        System.out.println();

    }
}
