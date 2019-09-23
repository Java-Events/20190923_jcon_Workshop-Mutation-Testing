package org.rapidpm.event.mutationtesting.p003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoService {

  public static final String PATTERN = "yyyy-MM-dd";
  private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);


  public Date convert(String dateText) throws ParseException {
    return simpleDateFormat.parse(dateText);
  }

}
