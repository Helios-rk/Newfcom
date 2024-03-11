@AfterMethod
	public void resultanalysis(ITestResult result)
	{
		String methodname = result.getMethod().getMethodName();
		if(result.isSuccess())
		{
			Screenshotutility.getScreenshot(methodname, "passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshotutility.getScreenshot(methodname, "failed");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Screenshotutility.getScreenshot(methodname, "Skip");
		}
	}