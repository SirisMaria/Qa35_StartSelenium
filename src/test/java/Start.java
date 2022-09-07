import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {

    WebDriver wd;

    @Test
    public void goToPhoneBook() {
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

    @Test
    public void LoginTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //open loginPage :find loginTab + click
        //fill email : find Elementemail + type "email"
        //fill password : find Elementpassword + type "password"
        //login submit : find login button + click
        //Assert (ex res = ac res)


        WebElement element = wd.findElement(By.tagName("h1"));//phonebook
        element.click();

        List<WebElement> list = wd.findElements(By.tagName("h1"));
        WebElement element1 = list.get(1);
        element1.click();

        //By id
        wd.findElement(By.id("root"));
        //By class
        wd.findElement(By.className("container"));
        //By linkText
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));
        //By.name
        wd.findElement(By.name("name"));
        wd.findElement(By.name("surname"));

        //By.ccsSelector
        //by tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        //by class
        wd.findElement(By.cssSelector(".container"));
        //by attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href]"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']"));//start with /ha
        wd.findElement(By.cssSelector("[href *='om']"));//containce - om
        wd.findElement(By.cssSelector("[href $='me']"));//end of me

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        //By.xPath


        wd.quit();

    }

    @Test
    public void homework() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Tools/index.html");

//find items
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));

        //find element of form
        WebElement name = wd.findElement(By.name("name"));
        WebElement surname = wd.findElement(By.name("surename"));
        WebElement send = wd.findElement(By.className("btn"));
    }
}
