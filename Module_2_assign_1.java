public class Module_2_assign_1 {
    public static void main(String[] args) {
        // Create two MyDate objects
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() +
                "/" + date1.getYear());
        System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() +
                "/" + date2.getYear());
    }
}