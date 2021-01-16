package com.aplana.chameleon.element.custom;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DateInput extends WebElementFacade {
    public DateInput(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    @Override
    public void type(String value){
        clear();
        sendKeys(Keys.BACK_SPACE);
        sendKeys(value);
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
