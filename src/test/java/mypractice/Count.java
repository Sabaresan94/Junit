package mypractice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Count {
	@Test
	public void result() {
		Result res=JUnitCore.runClasses(Hello.class,Hello1.class);
		System.out.println("Run count:"+res.getRunCount());
		System.out.println("fail count:"+res.getFailureCount());
		System.out.println("ignore count:"+res.getIgnoreCount());
		int passCount=res.getRunCount()-res.getFailureCount();
		System.out.println("passcount:"+passCount);
		System.out.println("run time:"+res.getRunTime());
		List<Failure> failures = res.getFailures();
		
		for (Failure x : failures) {
			System.out.println(x);
		}
		boolean wasSuccessful = res.wasSuccessful();
		System.out.println(wasSuccessful);
				}

}
