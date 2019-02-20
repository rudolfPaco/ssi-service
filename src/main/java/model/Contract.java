package model;

public class Contract {
    private Employee employee;
    private Position position;
    private Datee initDate;
    private Datee endDate;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Datee getInitDate() {
        return initDate;
    }

    public void setInitDate(Datee initDate) {
        this.initDate = initDate;
    }

    public Datee getEndDate() {
        return endDate;
    }

    public void setEndDate(Datee endDate) {
        this.endDate = endDate;
    }
}
