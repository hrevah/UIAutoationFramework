package com.ui.automation.elements.header;

import com.ui.automation.locator.Locator;
import com.ui.automation.elements.api.Element;
import com.ui.automation.elements.base.BaseElement;

/**
 * Created by Dana Shalev on 18/11/2015.
 */
public class NavigationMenu extends BaseElement {

    private Element navigationDropDownMenu = new BaseElement(Locator.className("mqm-masthead-modules-menu-dropdown"), this);

    public NavigationMenu(Locator locator, Element parent) {
        super(locator, parent);
    }

    public void navigateToAppModules() {
        navigate("product-overview");
    }

    public void navigate(String name) {
        // select drop down
        Element dropDownButton = new BaseElement(Locator.dataAid("main-menu-dropdown"), this);
        getDriver().actions().click(dropDownButton);

        // assure the menu is opened
        getDriver().expects().elementToBeVisible(navigationDropDownMenu);

        // select menu item
        Element navigationItem = new BaseElement(Locator.dataAid("main-menu-dropdown-platform-tree-module-" + name + "-main"), navigationDropDownMenu);
        getDriver().actions().click(navigationItem);
    }
}
