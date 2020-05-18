package tms.qa05.lessons_homework.lesson_5.task_3;

public class VacationHome implements House {

    private Integer numberOfFloors;
    private Boolean turnOnHeating;
    private Integer numberOfResidents;

    public VacationHome() {
        this(1, false, 4);
    }

    public VacationHome(int floors, boolean heating, int resident) {
        this.numberOfFloors = 1;
        this.turnOnHeating = false;
        this.numberOfResidents = 4;
    }

    @Override
    public void numberOfFloors() {
        System.out.println("Number of floors: " + numberOfFloors);
    }

    @Override
    public boolean turnOnHeating() {
        System.out.println("");
        return turnOnHeating;
    }

    @Override
    public void numberOfResidents() {
        System.out.println("Number of resident: " + numberOfResidents);
    }

    @Override
    public String toString() {
        return "VacationHome{" +
                "numberOfFloors=" + numberOfFloors +
                ", turnOnHeating=" + turnOnHeating +
                ", numberOfResidents=" + numberOfResidents +
                '}';
    }
}
