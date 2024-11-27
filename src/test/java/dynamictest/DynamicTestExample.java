package dynamictest;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTestExample {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Addition Test", () -> assertEquals(2, 1 + 1)),
                DynamicTest.dynamicTest("Multiplication Test", () -> assertEquals(4, 2 * 2))
        );
    }
}