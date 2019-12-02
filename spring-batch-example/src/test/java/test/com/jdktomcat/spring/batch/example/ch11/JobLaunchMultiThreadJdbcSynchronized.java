/**
 * 
 */
package test.com.jdktomcat.spring.batch.example.ch11;

import java.util.Date;

import org.springframework.batch.core.JobParametersBuilder;

import test.com.jdktomcat.spring.batch.example.JobLaunchBase;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-11-16下午10:59:46
 */
public class JobLaunchMultiThreadJdbcSynchronized {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JobLaunchBase.executeJob("ch11/job/job-multithreade-db.xml", "dbSynchronizedJob",
				new JobParametersBuilder().addDate("date", new Date()));
	}
}
