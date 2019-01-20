package Tests;

public class explanation2 {
    /**
     * ABSOLUTE XPATH VS RELATIVE XPATH
     * --->is used for absolute xpath
     * ---> absolute xpath or using single slash means it tries to locate from Direct Child Only
     * ex:/a-->
     *
     * -->// is used for relative xpath.
     * -->ex:/a
     * </div>
     *      <input>
     *          <a> </a>
     *      </input>
     * </div>
     *
     *
     * ***  WEBELEMENT TYPE
     * --->Webelemnt is a class in selenium. We handle that using Webelement class.
     * --->Using that stored object/reference we can take any action which we do manually.
     *
     * GETTEXT VS GETATTRIBUTE
     * -->getText method returns text that is outside of diamond bracket.
     * -->getAttribute returns the value of given attribute.
     * findElement() vs findElements()
     * -->findElement-->finds the webelement and returns single element. if Locator is not found then it throws NoSuchElement exception.
     * -->findElements-->finds the webelements and return List of Webelements. If locator is not found it doesn't throw exception, it simply return empty list.
     *
     */
}
