package day15;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LearnDownload {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions()
				.setHeadless(false)
				);
		
		Page page = browser.newPage();
		page.navigate("https://letcode.in/file");
		
		Download download = page.waitForDownload(()->{
			page.locator("'Download Excel'").click();
		});
		System.out.println(download.path());
		System.out.println(download.url());
		System.out.println(download.failure());
		System.out.println(download.suggestedFilename());
		
		download.saveAs(Paths.get(download.suggestedFilename()));
		
		playwright.close();
		
	}
}
