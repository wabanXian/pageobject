package service;

import config.Driver;
import domain.dxcsass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/1
 * Time: 16:26
 */
public class OrderPage {
    WebDriver webDriver = Driver.htmlUnitDriver();
    LoginPage loginPage;
    dxcsass dxcsass = new dxcsass();
    domain.element element;

    {
        element = PageFactory.initElements(webDriver, domain.element.class);
    }

    public boolean lloginandorder() throws InterruptedException {
        boolean rel;
        webDriver.get(dxcsass.getWeburl());
        loginPage.Login(dxcsass.getUsrname(), dxcsass.getPassword());
        webDriver.get(dxcsass.getProducturl());
        rel = loginPage.checkmsg(webDriver.getTitle(), dxcsass.getProducttitle());
        if (rel == false) {
            loginPage.setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        } else {
            element.addcart();
            element.tocart();
        }
        return rel;
    }
}
