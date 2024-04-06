package array.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement element = new RemoveElement();
        int result = element.removeElement(nums, val);
        assertEquals(2, result);
    }
}