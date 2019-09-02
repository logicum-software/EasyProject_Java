package sample;

import java.io.Serializable;

public class Milestone implements Serializable {
    private String Name;
    private int Status; // Values 0 = pending, 1 = achieved, 2 = canceled

    public Milestone() {
        Name = "";
        Status = 0;
    }

    public Milestone(String name, int status) {
        Name = name;
        Status = status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
