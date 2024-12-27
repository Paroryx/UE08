package task;

import java.util.Arrays;

public class AssignedTask extends Task{
    private final String[] assignees;

    public AssignedTask(String title, String description, String... assignees){
        super(title, description);
        this.assignees = (String[]) assignees.clone();
    }
    public AssignedTask(String title, String... assignees){
        super(title);
        this.assignees = (String[]) assignees.clone();
    }

    public String[] getAssignees(){
        return (String[]) assignees.clone();
    }

    @Override
    public String toString() {
        return super.toString()+" "+Arrays.toString(assignees);
    }
}