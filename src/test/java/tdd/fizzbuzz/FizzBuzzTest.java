package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number__when_input_normal_number() throws Exception {
        //Given
        int input = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expectResult = "1";
        //When
        String result = fizzbuzz.countOff(input);
        //Then
        assertEquals(expectResult, result);
    }



}
