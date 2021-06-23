import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;
import java.util.Arrays;

public class HelloWorld implements BundleActivator {
    public void start(BundleContext ctx) {
        System.out.println("started");
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setArgs(Arrays.asList("--disable-web-security")));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        System.out.println("navigated");
        page.pdf(new Page.PdfOptions().setPath(Paths.get("./output.pdf")));
        System.out.println("printed");
    }
    public void stop(BundleContext bundleContext) {
        System.out.println("Goodbye world.");
    }
}