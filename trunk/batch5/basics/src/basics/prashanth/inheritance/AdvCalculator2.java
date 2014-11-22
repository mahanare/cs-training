package basics.prashanth.inheritance;

import basics.prashanth.Calculator;
// this is the subclass (child ) of Calculator (calculator is from different package called basics.prashanth)
public class AdvCalculator2 extends Calculator {
       AdvCalculator2 advCal2 = new AdvCalculator2();
       advCal2.addNumbers();
       // trying to access default method frm base class 
       advCal2.addNumber(5,3);
       // trying to access public method frm base class 
       advCal2.addNumbers(5,'3');
       // trying to access protected method frm base class
       advCal2.addNumbers(5);
       //trying to access private method from base class
    	   
       
       
}
