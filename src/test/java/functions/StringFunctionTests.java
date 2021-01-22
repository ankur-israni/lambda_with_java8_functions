package functions;


import com.ankur.functions.StringFunctions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFunctionTests {
    private StringFunctions stringFunctions;

    @BeforeEach
    public void setup(){
        stringFunctions=new StringFunctions();
    }

    @Test
    public void toLowerCase(){
        Function<String,String> lowerCaseFunction = stringFunctions.toLowerCase();
        String lowerCase = lowerCaseFunction.apply("ANKUR");
        assertEquals("ankur",lowerCase);
    }


    @Test
    public void toUpperCase(){
        Function<String,String> upperCaseFunction = stringFunctions.toUpperCase();
        String upperCase = upperCaseFunction.apply("ankur");
        assertEquals("ANKUR",upperCase);
    }

    @Test
    public void reverse(){
        Function<String,String> reverseFunction = stringFunctions.reverse();
        String reversed = reverseFunction.apply("ankur");
        assertEquals("rukna",reversed);
    }

}
