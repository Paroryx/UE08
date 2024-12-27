package task;
import io.In;
import io.Out;

public class TaskManagerApplication {
  public static void main(String[] args) {
    TaskManager tm = new TaskManager();
    char c;
    do {
      Out.print("Command ([c] create task, [e] execute task, [s] print summary, [q] exit]: ");
      c = In.readChar();
      In.readLine(); // To remove newline from input stream
      switch (c) {
        case 'c':
          tm.addTask(createTaskFromInput());
          break;
        case 'e':
          Out.print("Task to execute: ");
          int taskNr = In.readInt();
          In.readLine(); // To remove newline from input stream
          Task t = tm.getTask(taskNr);
          if (t != null) {
            t.execute();
          } else {
            Out.println("Could not execute task! Invalid task number " + taskNr);
          }
          break;
        case 's':
          tm.print();
          break;
        case 'q':
          break;
        default:
          Out.println("Invalid command: " + c);
      }
      Out.println();
    } while (c != 'q');
    Out.println("Task manager shutdown");
  }

  public static String[] createAssigneesFromInput() {
    Out.print("# of Assignees: ");
    int nAssignees = In.readInt();
    In.readLine(); // To remove newline from input stream
    String[] assignees = new String[nAssignees];
    for (int i = 0; i < nAssignees; i++) {
      Out.print(String.format("Assignee %d: ", (i + 1)));
      assignees[i] = In.readLine();
    }
    return assignees;
  }

  public static Task createTaskFromInput() {
    Out.println("Creating new task:");
    Out.print("Type ([1] default, [2] assigned, [3] repeated): ");
    int type = In.readInt();
    In.readLine();
    String title;
    char withDescription;
    String description;
    switch (type) {
      case 1:
        // Task
        Out.print("Title: ");
        title = In.readLine();
        Out.print("With description? (y/n) ");
        withDescription = In.readChar();
        if(Character.toLowerCase(withDescription) == 'y') {
          Out.print("Description: ");
          //In.readLine();
          description = In.readLine();
          return new Task(title, description);
        }
        return new Task(title);        
      case 2:
        // AssignedTask
        Out.print("Title: ");
        title = In.readLine();        
        Out.print("With description? (y/n) ");
        withDescription = In.readChar();
        if(Character.toLowerCase(withDescription) == 'y') {
          Out.print("Description: ");
          In.readLine();
          description = In.readLine();
          return new AssignedTask(title, description, createAssigneesFromInput());
        }
        return new AssignedTask(title, createAssigneesFromInput());
      case 3:
        // RepeatedAssignedTask
        Out.print("Title: ");
        title = In.readLine();
        Out.print("Description: ");
        description = In.readLine();
        String[] assignees = createAssigneesFromInput();
        Out.print("# of repetitions: ");
        int nRepetitions = In.readInt();
        In.readLine(); // To remove newline from input stream
        return new RepeatedAssignedTask(title, description, assignees, nRepetitions);
      default:
        Out.println("Invalid input!");
        return null;
    }
  }
}
