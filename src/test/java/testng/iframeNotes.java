package testng;

public class iframeNotes {
    /**
     * TESTNG
     * -> Annotations
     *     => controls the flow of the tests we write
     *     @BeforeClass
     *     @AfterClass
     *     @Test
     *     @Test
     *     @BeforeMethod
     *     @AfterMethod
     * ---------------------
     *     * By default TestNG @Test annotations run in alphabetical order.
     *     * To control the orders of @Test we use 'priority' feature.
     *     * @Test(priority = %integer)
     *     => %integer controls the orders. Less integer value is more priority.
     *     * When we want one @Test to be dependent from another we use 'dependsOnMethods' feature.
     *     Ex: @Test(dependsOnMethods = "otherMethodNameHere")
     *     -----------------------------------------------------
     *     POPUPS
     *     1. JavaScript alerts
     *         3 types
     *         a. warning/information message
     *         b. Confirmation alert
     *         c. Prompt alert
     *     2. HTML based
     *     -> Can be handled using regular findElement method.
     *     TC#1: JavaScript Alerts
     *     1. Go to http://the-internet.herokuapp.com/javascript_alerts
     *     2. Click on 'Click for JS Alert' button
     *     -------------------------------------
     *         IFRAME -> independent HTML code in another HTML code.
     *     HTML tag for Frames is <iframe>
     *     * Selenium can only focus on ONE HTML code.
     *     If HTML code has iframe in it then Selenium cannot find elements in inner iframe unless we switch into that frame.
     *     3 ways to switch to iframes:
     *     1 - locating iframe and using as regular webelement.
     *     2 - by index (Not recommended)
     *     3 - using name or id
     *     Syntax: driver.switchTo().frame(argument);
     *     ---------------------------------------------------
     *         SELENIUM WINDOW HANDLING
     *     * Selenium can only work with one window at a time.
     *     * If we have multiple window we need to explicitly switch to other windows using Window Handle.
     *     * Window handle -->  randomly generated unique ID for each tab.
     * CDwindow-10258207C047ABCFB987181855778F74
     *      Steps to handle multiple window: --->driver.getWindowHandle();
     *      1.Get current window ID
     *      2.Get all windowHandles-->driver.getWindowHandles();
     *      3.Switch to certain window using window ID: driver.switchTo().window(ID);
     *      ===>When having more than 2 tabs open, solution approach:
     *      1.Get target "Title"
     *      2.Get all window handles and store in List
     *      3.Loop each window handles and keep switching to each window
     *      4.Apply condition of checking title with target title
     *      5.Once you find target title break the loop
     *      *Now driver is focused to this certain tab.
     *
     */
}
