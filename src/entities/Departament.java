package entities;


import java.util.ArrayList;
import java.util.List;

public class Departament {
    private String name;
    private Integer payDay;

    private Address address;
    private List<Employee> employeeList = new ArrayList<>();

    public Departament(){

    }

    public Departament(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee list) {
        employeeList.add(list);
    }
    public void removeEmployee(Employee list) {
        employeeList.remove(list);
    }

    public double payRoll(){
        double sum = 0.0;
        for(Employee list : employeeList){
            sum += list.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder rpt = new StringBuilder();
        rpt.append("\nFOLHA DE PAGAMENTO:\n");
        rpt.append(String.format("Departamento %s = R$ %.2f\n", getName(), payRoll()));
        rpt.append("Pagamento realizado no dia ");
        rpt.append(getPayDay() + "\n");
        rpt.append("Funcionarios:\n");
        for (Employee list : employeeList) {
            rpt.append(list.getName() + "\n");
        }
        rpt.append("Para dúvidas favor entrar em contato: " + address.getEmail());
        return rpt.toString();
    }
}