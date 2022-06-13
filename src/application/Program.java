package application;

import entities.Address;
import entities.Departament;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String dptName = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int dptDate = sc.nextInt();
        System.out.print("Email: ");
        String andressMail = sc.next();
        System.out.print("Telefone: ");
        String andressPhone = sc.next();
        Departament dept = new Departament(dptName, dptDate, new Address(andressMail, andressPhone));


        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Dados do funcionário " + i );
            System.out.print("Nome: ");
            sc.nextLine();
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double employyeSalary = sc.nextDouble();

            Employee employee = new Employee(employeeName, employyeSalary);
            dept.addEmployee(employee);
        }

        showReport(dept);
        sc.close();

    }
    public static void showReport(Departament dept) {
        System.out.println(dept.toString());
    }
}
