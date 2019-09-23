package org.rapidpm.event.mutationtesting.p002;

/**
 * Create the best test coverage you can.
 * How many tests you will need?
 * What are the "good" tests?
 */
public class Service {

  public int add(int a , int b) {
    if (a < 2) {
      return (a + b) * - 1 ;
    } else {
      return a + b;
    }
  }

  public int tuWas(int a, int b, int c){
    int ergebnis = 0;
    for(int i=0; i<c; i++){
      if(a<b){
        ergebnis +=  a * i - b;
      } else {
        ergebnis +=  a + b + i;
      }
    }
    return ergebnis;
  }
}