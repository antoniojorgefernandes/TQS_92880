package TqsStack;


import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

public class TqsStackTests {


    @Test
    public void testSizeOnCreation(){
        TqsStack<String> stack = new TqsStack<String>();
        // Arrange
        final int expected = 0;
        // Act
        final int actual = stack.size();
  
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        TqsStack<String> stack = new TqsStack<String>();
        
        // Arrange
        final int expected_size_on_creation = 0;
        
        // Act
        final int actual_size_on_creation = stack.size();
  
        // Assert
        assertEquals(expected_size_on_creation, actual_size_on_creation);

        // Arrange
        final int expected_size_after_5_pushes = 5;
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        // Act
        final int actual_size_after_5_pushesl = stack.size();
  
        // Assert
        assertEquals(expected_size_after_5_pushes, actual_size_after_5_pushesl);
        assertEquals(stack.isEmpty(),false);
    }

    @Test
    public void testPushAndPop(){
        TqsStack<String> stack = new TqsStack<String>();
        // Arrange
        stack.push("1");
        final String expected = "Hello world";
        stack.push(expected);

        // Act
        final String actual = stack.pop();
  
        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testPushAndPeek(){
        TqsStack<String> stack = new TqsStack<String>();
        // Arrange
        stack.push("1");
        final String expected = "Hello world";
        stack.push(expected);
        final int expected_size = 2;

        // Act
        final String actual = stack.peek();
        final int actual_size = stack.size();
        // Assert
        assertEquals(expected, actual);
        assertEquals(expected_size, actual_size);
    }


    @Test
    public void testSizeAfterNPushesAndPops(){
        TqsStack<Integer> stack = new TqsStack<Integer>();
        // Arrange
        final int expected_size_after_10_pushes = 10;
        for (int i=0; i<10; i++){
            stack.push(i);
        }
        // Act
        final int size_after_10_pushes = stack.size();
        //Assert
        assertEquals(expected_size_after_10_pushes, size_after_10_pushes);

        // Arrange
        final int expected_size_after_10_pops = 0;
        for (int i=0; i<10; i++){
            stack.pop();
        }
        // Act
        final int size_after_10_pops = stack.size();
        //Assert
        assertEquals(expected_size_after_10_pops, size_after_10_pops);

    }
   
    @Test
    public void testPopEmptyStack(){
        TqsStack<String> stack = new TqsStack<String>();
        //assert
        assertThrows(NoSuchElementException.class, () -> {stack.pop();});
    }

    @Test
    public void testPeekEmptyStack(){
        TqsStack<String> stack = new TqsStack<String>();
        //assert
        assertThrows(NoSuchElementException.class, () -> {stack.peek();});
    }

    @Test
    public void testPop(){
        TqsStack<String> stack = new TqsStack<String>();
        // Arrange
        stack.push("hello world");
        final String expected = stack.peek();;
        
        // Act
        final String actual = stack.pop();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty(){
        TqsStack<String> stack = new TqsStack<String>();
        // Arrange
        final boolean expected = true;
  
        // Act
        final boolean actual = stack.isEmpty();
  
        // Assert
        assertEquals(expected, actual);
    }


}
