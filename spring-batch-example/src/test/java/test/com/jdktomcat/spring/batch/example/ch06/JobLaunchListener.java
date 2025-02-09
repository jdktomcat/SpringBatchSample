/**
 * 
 */
package test.com.jdktomcat.spring.batch.example.ch06;

import java.util.Date;

import org.springframework.batch.core.JobParametersBuilder;

import test.com.jdktomcat.spring.batch.example.JobLaunchBase;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-8-16下午09:09:42
 */
public class JobLaunchListener extends JobLaunchBase {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		executeJob("ch06/job/job-listener.xml", "itemReadJob",
				new JobParametersBuilder().addDate("date", new Date()));
	}
}
