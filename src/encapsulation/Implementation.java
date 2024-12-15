package encapsulation;

public class Implementation {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Петро Іванов",
                "Програміст",
                "petro.ivanov@gmail.com",
                "+380975556667",
                33
        );
        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Вік: " + employee.getAge());

        Car car = new Car();
        car.start();
    }
}

