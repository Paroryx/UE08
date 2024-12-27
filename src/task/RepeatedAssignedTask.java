package task;

public class RepeatedAssignedTask extends AssignedTask{
    public final int nRepetitions;
    public RepeatedAssignedTask(String title, String description, String[] assignees, int nRepetitions){
        super(title,description,assignees);
        this.nRepetitions = nRepetitions;
    }

    @Override
    public void execute() {
        for (int i = 0; i < nRepetitions; i++) {
            super.execute();
        }
    }
    @Override
    public String toString() {
        return super.toString()+" x"+nRepetitions;
    }
}
