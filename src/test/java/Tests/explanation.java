package Tests;

public class explanation {


    /**
     * Absolute Xpath : is locating the elements,moving with direct child. direcr child of body, head etc...Abso
     * Absolute Xpath uses "/" (Single slash). Absolute xpath find the direct child.
     *
     *
     * 2.Relative Xpath-->it uses "//" and it doesn't care if it is child or not.
     *
     * xpath with displayed text://E[.='textValue']
     *
     * xpath also can go backwards (from child to parent node/element:
     * ===> /.. means going back to direct parent
     *
     *      STATIC VS DYNAMIC VALUES FOR HTML TAG ATTRIBUTES.
     *      *Static value is when developer explicitly sets value that is unchangable
     *      *Dynamic valueas are commonly generated automatically and most likely gets changed on each session.
     *      if value looks unique and meaningful it's static.
     *      if value has combination of random numbers and letters it dynamic.
     *      ***Dynamic values SHOULD NOT be used in locators.
     *
     *    ========================================================================
     *    driver.findElement()  vs driver.findElements();
     *
     *    public WebElement findElement (By b) {
     *
     *    }
     *
     *    public List<WebElement>
     *
     *
     *
     *        *findElement throws NoSuchElementException when it does NOT find locator.
     *        *findElements()-->DOES NOT throw exception. it simply returns empty list of webelements.
     *
     *
     *        Select class is a way to handle dropdown in selenium
     *        Syntax: Select variableName=new Select(WebElement);
     *
     *        3 ways to select an option using select class.
     *
     *        1.selectByIndex-->select by index by order. If you pass 0(zero) it select first option and so on
     *        2.selectByValue-->select option by value attribute
     *        3.selectBy
     *
     *
     *
     *          */
}
