package task;
import io.Out;

public class TaskManager {

  private static final int INIT_CAPACITY = 5;

  private Task[] tasks;
  private int nTasks;

  public TaskManager() {
    tasks = new Task[INIT_CAPACITY];
    nTasks = 0;
  }

  public void addTask(Task process) {
    if (nTasks == tasks.length) {
      Task[] largerArr = new Task[nTasks * 2];
      for (int i = 0; i < tasks.length; i++) {
        largerArr[i] = tasks[i];
      }
      tasks = largerArr;
    }
    tasks[nTasks] = process;
    nTasks++;
  }

  public Task getTask(int nr) {
    if (nr < 1 || nr > nTasks) {
      return null;
    }
    return tasks[nr - 1];
  }

  public void print() {
    Out.println(nTasks + " tasks registered:");
    for (int i = 0; i < nTasks; i++) {
      Out.println("[" + (i + 1) + "] " + tasks[i].toString());
    }
  }
}
