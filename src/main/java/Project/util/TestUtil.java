package Project.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Delivery.BaseClass.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void SwitchToFrame(){
		driver.switchTo().frame("mainpanel");
		}
	
	public static void TakeScreenShotEndOfTest() throws IOException{
		// TODO Auto-generated method stub
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/"+ System.currentTimeMillis()+".png"));
		
	}
}
