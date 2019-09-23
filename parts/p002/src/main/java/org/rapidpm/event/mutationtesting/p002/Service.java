package org.rapidpm.event.mutationtesting.p002;

/**
 * Create the best test coverage you can.
 * How many tests you will need?
 * What are the "good" tests?
 */
public class Service {

  public int add(int a , int b) {
    if (a < 2) {
      return (a + b) * - 1;
    } else {
      return a + b;
    }
  }

  public int subAbs(int a, int b) {
      int aAbs = Math.abs(a);
      int bAbs = Math.abs(b);
      return  a < b ? aAbs - bAbs : bAbs - aAbs;
  }
}