/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.event.mutationtesting.p020;


import static java.lang.String.valueOf;
import static org.rapidpm.vaadin.addons.framework.ComponentIDGenerator.buttonID;
import static org.rapidpm.vaadin.addons.framework.ComponentIDGenerator.spanID;

import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class VaadinApp extends Composite<Div> implements HasLogger {

  public static final String BTN_CLICK_ME   = buttonID().apply(VaadinApp.class, "btn-click-me");
  public static final String LB_CLICK_COUNT = spanID().apply(VaadinApp.class, "lb-click-count");

  private final Button         btnClickMe   = new Button("click me");
  private final Span lbClickCount = new Span("0");
  private final VerticalLayout layout       = new VerticalLayout(btnClickMe, lbClickCount);

  private int clickcount = 0;

  public VaadinApp() {
    btnClickMe.setId(BTN_CLICK_ME);
    btnClickMe.addClickListener(event -> lbClickCount.setText(valueOf(++clickcount)));

    lbClickCount.setId(LB_CLICK_COUNT);

    //set the main Component
    logger().info("setting now the main ui content..");
    getContent().add(layout);

  }
}
