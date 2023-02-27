public class Main {
    public static void main(String[] args) {

        System.out.println("Задачи 1 и 2");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName;
            fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника — " + fullName);

            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");
            String fullName1 = "Иванов Семён Семёнович";
            String fullName1True = fullName1.replace("ё", "е");
            System.out.println(fullName1True);
    }
}