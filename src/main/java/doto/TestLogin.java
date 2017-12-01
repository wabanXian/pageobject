package doto;



import domain.dxcsass;
import org.openqa.selenium.WebDriver;
import service.LoginPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 13:48
 */
public class TestLogin {
    LoginPage loginPage = new LoginPage();

    public boolean gettitle() {
     return   loginPage.gettitle();
    }

    public void login() throws InterruptedException  {
        loginPage.Login("18708151438", "zang1020330");
    }
   public String resultmsg(){
      return   loginPage.getErr();
   }
}
