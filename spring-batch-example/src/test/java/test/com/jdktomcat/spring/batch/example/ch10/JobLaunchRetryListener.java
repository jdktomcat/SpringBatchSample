/**
 * 
 */
package test.com.jdktomcat.spring.batch.example.ch10;

import java.util.Date;

import org.springframework.batch.core.JobParametersBuilder;

import test.com.jdktomcat.spring.batch.example.JobLaunchBase;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-10-21下午10:14:09
 */
public class JobLaunchRetryListener {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JobLaunchBase.executeJob("ch10/job/job-step-retry-listener.xml", "retryListener2Job",
				new JobParametersBuilder().addDate("date", new Date()));
	}
}
