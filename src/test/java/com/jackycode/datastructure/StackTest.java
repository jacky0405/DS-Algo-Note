package com.jackycode.datastructure;

import com.jackycode.datastructure.stack.ArrayStack;
import com.jackycode.datastructure.stack.Calculator;
import com.jackycode.datastructure.stack.LinkedListStack;
import com.jackycode.datastructure.stack.ReversePolishCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    /**
     * 數組模擬棧測試
     */
    @Test
    public void stackTest1() {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.show();
    }

    /**
     *  單向鏈表模擬棧測試
     */
    @Test
    public void stackTest2() {
        LinkedListStack stack = new LinkedListStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.show();
    }

    /**
     * 中綴表達式測試
     */
    @Test
    public void calculatorTest1() {
        String exp = "30+2*6-2";
        Calculator cal = new Calculator();
        cal.scan(exp);
        Assertions.assertEquals(40, cal.getResult());
    }

    /**
     * ReversePolish測試
     */
    @Test
    public void calculatorTest2() {
        String exp = "4 5 * 8 - 60 + 8 2 / +";
        ReversePolishCalculator cal = new ReversePolishCalculator();
        Assertions.assertEquals(76, cal.getResult(exp));
    }

}
