package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOptionOne(){
        // Arrange
        DropDownPage dropDownPage = homePage.clickDropdownPage();
        String option = "Option 1";

        // Act
        dropDownPage.selectDropdownOption(option);
        var selectedDropdownOptions = dropDownPage.getSelectedOptions();

        // Assert
        assertTrue(selectedDropdownOptions.contains(option), "Option 1 is not selected");
    }

    @Test
    public void testSelectOptionTwo(){
        // Arrange
        DropDownPage dropDownPage = homePage.clickDropdownPage();
        String option = "Option 2";

        // Act
        dropDownPage.selectDropdownOption(option);
        var selectedDropdownOptions = dropDownPage.getSelectedOptions();

        // Assert
        assertTrue(selectedDropdownOptions.contains(option), "Option 2 is not selected");
    }



}
