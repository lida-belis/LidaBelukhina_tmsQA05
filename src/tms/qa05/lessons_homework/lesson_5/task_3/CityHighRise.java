package tms.qa05.lessons_homework.lesson_5.task_3;

public class CityHighRise implements House {
    private Integer numberOfFloors;
    private Boolean turnOnHeating;
    private Integer numberOfResidents;

    public CityHighRise() {
        this(5, true, 40);
    }

    public CityHighRise(int floors, boolean heating, int resident) {
        this.numberOfFloors = 5;
        this.turnOnHeating = true;
        this.numberOfResidents = 40;
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
        return "CityHighRise{" +
                "numberOfFloors=" + numberOfFloors +
                ", turnOnHeating=" + turnOnHeating +
                ", numberOfResident=" + numberOfResidents +
                '}';
    }
}
