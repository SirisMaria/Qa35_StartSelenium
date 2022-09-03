import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void goToPhoneBook()
    {
        //open browser
        wd = new ChromeDriver();
        //go to phonebook
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");// with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        
        //close browser
        wd.close();
        wd.quit();


    }
}
