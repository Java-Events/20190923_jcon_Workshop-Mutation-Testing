/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package junit.org.rapidpm.vaadin.v10.tb.demo;

import static java.lang.Integer.valueOf;
import static org.rapidpm.event.mutationtesting.p020.VaadinApp.BTN_CLICK_ME;
import static org.rapidpm.event.mutationtesting.p020.VaadinApp.LB_CLICK_COUNT;

import org.openqa.selenium.WebDriver;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.container.ContainerInfo;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.SpanElement;

public class VaadinAppPageObject extends AbstractVaadinPageObject implements HasLogger {


  public VaadinAppPageObject(WebDriver webdriver , ContainerInfo containerInfo) {
    super(webdriver , containerInfo);
    logger().info("VaadinAppPageObject was created..");
  }

  public ButtonElement btnClickMe() {
    return btn().id(BTN_CLICK_ME);
  }

  public SpanElement lbClickCount() {
    return span().id(LB_CLICK_COUNT);
  }

  public void click() {
    btnClickMe().click();
  }

  public String clickCountAsString() {
    return lbClickCount().getText();
  }

  // no exception handling
  public int clickCount() {
    return valueOf(clickCountAsString());
  }

}
