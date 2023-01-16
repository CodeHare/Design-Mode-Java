public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 2000000000);

        Employee headSales = new Employee("Nicholas", "Head Sale", 25000000);
        Employee headMarketing = new Employee("Linda", "Head Market", 29000000);

        Employee clerk1 = new Employee("Mike", "Marketing", 28500000);
        Employee clerk2 = new Employee("Rose", "Marketing", 24400000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}