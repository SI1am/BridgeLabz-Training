package annotations;
import java.lang.annotation.*;


import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport{
	String description();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports{
	BugReport [] value();
}

public class BugTracker {

	// TODO Auto-generated method stub
		@BugReport(description = "Null pointer issue")
		@BugReport(description = "Performance issue")
		
		public void process() {}
		
		public static void main(String[] args) throws Exception {
			Method method = BugTracker.class.getMethod("process");
			BugReport[] reports = method.getAnnotationsByType(BugReport.class);
			
			for (BugReport report : reports) {
				System.out.println(report.description());
			}
		}
	
  }

