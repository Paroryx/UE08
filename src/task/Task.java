package task;
import io.Out;

public class Task{
    public final String title;
    private String description;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Task(String title){
        this(title,"No detailed description");
    }

    public String getDescription(){ 
        return description;
    }
    public void setDescription(String description){
        if(description != null) 
            this.description = description; 
    }

    public void execute(){
        Out.println("Executing task: "+this.toString());
    }

    @Override
    public String toString() {
        return title + " ("+description+")";
    }
}