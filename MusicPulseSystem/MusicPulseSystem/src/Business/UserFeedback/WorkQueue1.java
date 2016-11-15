package Business.UserFeedback;

import java.util.ArrayList;

public class WorkQueue1 {

    private ArrayList<WorkRequest1> listOfWorkRequest1;
    
    public WorkQueue1() {
        listOfWorkRequest1 = new ArrayList<>();
    }

    public ArrayList<WorkRequest1> getListOfWorkRequest1() {
        return listOfWorkRequest1;
    }

    public void setListOfWorkRequest1(ArrayList<WorkRequest1> listOfWorkRequest1) {
        this.listOfWorkRequest1 = listOfWorkRequest1;
    }
    
}
