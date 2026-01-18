package annotations;

import java.lang.reflect.*;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface TaskInfo {
	String priority();
	String assignedTo();

}

class TaskManager {

    @TaskInfo(priority ="HIGH",assignedTo ="Shivam")
    public void completeTask() {}

    public static void main(String[] args) throws Exception {
    	
        Method method = TaskManager.class.getMethod("completeTask");
        
        TaskInfo info = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}
