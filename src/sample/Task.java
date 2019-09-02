package sample;

import java.io.Serializable;
import java.util.Calendar;

public class Task implements Serializable {
    private String Name;
    private String Description;
    private Calendar StartDate;
    private Calendar EndDate;
    private Calendar PlannedStartDate;
    private Calendar PlannedEndDate;
    private int Status; // Values: 0 = pending, 1 = started, 2 = completed, 3 = canceled

    public Task() {
        Name = "";
        Description = "";
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
        EndDate.add(Calendar.DAY_OF_YEAR, 7);
        PlannedStartDate = Calendar.getInstance();
        PlannedStartDate.add(Calendar.DAY_OF_YEAR, 7);
        PlannedEndDate = Calendar.getInstance();
        PlannedEndDate.add(Calendar.DAY_OF_YEAR, 7);
        Status = 0;
    }

    public Task(String name, String description, Calendar startdate, Calendar enddate, Calendar plannedstartdate,
                Calendar plannedenddate, int status) {
        Name = name;
        Description = description;
        StartDate = startdate;
        EndDate = enddate;
        PlannedStartDate = plannedstartdate;
        PlannedEndDate = plannedenddate;
        Status = status;
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
}
