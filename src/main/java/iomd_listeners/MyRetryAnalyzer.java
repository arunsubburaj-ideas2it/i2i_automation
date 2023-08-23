package iomd_listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{
	
	private int retryCount =0;
	private int maxRetryCount = 1;
	

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
			if(retryCount<maxRetryCount)
			{
				retryCount++;
				return true;
			
			}
		}
		return false;
	}
	
	
	

}
