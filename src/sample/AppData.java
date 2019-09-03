package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class AppData implements Serializable {
    private ArrayList<Project> Projects;

    public AppData() {
        Projects = new ArrayList<>();
    }

    public AppData(ArrayList<Project> projects) {
        Projects = projects;
    }
}
