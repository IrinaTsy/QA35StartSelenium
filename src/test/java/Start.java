import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){

        //open browser
        wd = new ChromeDriver();

        //go to Phonebook
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //without saving history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/"); //with saving history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        //close browser
        //wd.close(); //close active window
        wd.quit(); //close browser
    }

    @Test
    public void loginTest(){

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        //open loginPage: find loginTab --> click on LoginTab
        //fill Email: find element Email --> type "Email"
        //fill password: find element Password --> type "Password"
        //login submit: find button Login --> click on Login button
        //class Assert: expected result = actual result
        wd.quit();
    }
}



























