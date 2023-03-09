package is.hi.hbv202g.ass5;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack = new IntStack();
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        IntStack stackFull = new IntStack();
        int x = stackFull.getCapacity();
        for (int i = 0; i < x; i++) {
            stackFull.push(i);
        }

        assertTrue(stackFull.isFull());
    }

    @Test
    public void testAlmostFullStackIsFull() {
        IntStack stackAlmostFull = new IntStack();
        int x = stackAlmostFull.getCapacity() - 1;
        for (int i = 0; i < x; i++) {
            stackAlmostFull.push(i);
        }

        assertFalse(stackAlmostFull.isFull());
    }


    @Test
    public void testPopReturnsPushedValue() {
        IntStack stackPushPop = new IntStack();
        int i = 5;
        stackPushPop.push(i);
        int x = stackPushPop.pop();
        assertEquals(i, x);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopEmpty() {
        IntStack stackPop = new IntStack();
        stackPop.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushedFull() {
        IntStack stackPush = new IntStack();
        int x = stackPush.getCapacity();
        for (int i = 0; i < x; i++) {
            stackPush.push(i);
        }
        stackPush.push(5);
    }

    @Test
    public void testNewStackIsEmpty() {
        IntStack stack = new IntStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmpty() {
        IntStack stack = new IntStack();
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

}
