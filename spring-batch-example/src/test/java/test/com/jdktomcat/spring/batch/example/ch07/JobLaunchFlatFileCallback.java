/**
 * 
 */
package test.com.jdktomcat.spring.batch.example.ch07;

import java.util.Date;

import org.springframework.batch.core.JobParametersBuilder;

import test.com.jdktomcat.spring.batch.example.JobLaunchBase;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-2-28下午08:34:48
 */
public class JobLaunchFlatFileCallback {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JobLaunchBase.executeJob("ch07/job/job-flatfile-callback.xml", "flatFileComplexJob",
				new JobParametersBuilder().addDate("date", new Date()));
	}
}
