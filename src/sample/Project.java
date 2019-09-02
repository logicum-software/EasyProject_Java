package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Project implements Serializable {
    private String Name;
    private String Description;
    private Calendar StartDate;
    private Calendar EndDate;
    private Calendar PlannedStartDate;
    private Calendar PlannedEndDate;
    private int Status; // Values: 0 = pending, 1 = started, 2 = completed, 3 = canceled
    private ArrayList<Task> Tasks;
    private ArrayList<Milestone> Milestones;

    public Project() {
        Name = "";
        Description = "";
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
        EndDate.add(Calendar.DAY_OF_YEAR, 7);
        PlannedStartDate = Calendar.getInstance();
        PlannedEndDate = Calendar.getInstance();
        PlannedEndDate.add(Calendar.DAY_OF_YEAR, 7);
        Status = 0;
        Tasks = new ArrayList<>();
        Milestones = new ArrayList<>();
    }

    public Project(String name, String description, Calendar startdate, Calendar enddate, Calendar plannedstartdate,
                   Calendar plannedenddate, int status, ArrayList<Task> tasks, ArrayList<Milestone> milestones) {
        Name = name;
        Description = description;
        StartDate = startdate;
        EndDate = enddate;
        PlannedStartDate = plannedstartdate;
        PlannedEndDate = plannedenddate;
        Status = status;
        Tasks = tasks;
        Milestones = milestones;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Calendar getStartDate() {
        return StartDate;
    }

    public void setStartDate(Calendar startdate) {
        StartDate = startdate;
    }

    public Calendar getEndDate() {
        return EndDate;
    }

    public void setEndDate(Calendar enddate) {
        EndDate = enddate;
    }

    public Calendar getPlannedStartDate() {
        return PlannedStartDate;
    }

    public void setPlannedStartDate(Calendar plannedstartdate) {
        PlannedStartDate = plannedstartdate;
    }

    public Calendar getPlannedEndDate() {
        return PlannedEndDate;
    }

    public void setPlannedEndDate(Calendar plannedenddate) {
        PlannedEndDate = plannedenddate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public ArrayList<Task> getTasks() {
        return Tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        Tasks = tasks;
    }

    public ArrayList<Milestone> getMilestones() {
        return Milestones;
    }

    public void setMilestones(ArrayList<Milestone> milestones) {
        Milestones = milestones;
    }

}
