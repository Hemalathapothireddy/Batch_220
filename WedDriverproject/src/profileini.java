import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class profileini {

	public static void main(String[] args) {
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("default");
		FirefoxDriver driver=new FirefoxDriver(myprofile);
		driver.get("https://www.facebook.com/");

	}

}
