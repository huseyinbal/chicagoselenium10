package webtables;

import Utilities.TestBase;
import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



import java.util.List;

    public class SmartBear extends TestBase {

        @Test
        public void orderTables(){
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

            WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));

            int rowSize = orderTable.findElements(By.tagName("tr")).size();
            System.out.println(rowSize);

            List<WebElement> rows = orderTable.findElements(By.tagName("tr"));
            for(WebElement row: rows){
                List<WebElement> columns = row.findElements(By.tagName("td"));
                for(WebElement column: columns){
                    System.out.print(column.getText() + " | ");
                }
                System.out.println();
                System.out.println("---------------------------");
            }

            printData(6,4);
            printData(4,1);
            printData2(4,4);
        }

        /**
         * find the cell with given row number and column number
         * @param rowNum
         * @param colNum
         */
        public void printData(int rowNum, int colNum){
           String xpath="//table[@id='ctl00_MainContent_orderGrid']//tr["+(rowNum+1)+"]//td["+(colNum+1)+"]";//+1 is for skipping header

            WebElement data = driver.findElement(By.xpath(xpath));
            System.out.println(data.getText());
        }

        public void printData2(int row, int column){
            WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
            List<WebElement> rows=orderTable.findElements(By.tagName("tr"));
            List<WebElement> columns=rows.get(row).findElements(By.tagName("td"));
            WebElement target=columns.get(column);
            System.out.println(target.getText());
        }

    }

