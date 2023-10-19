import org.example.HWMeth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HWMethTests {
    private HWMeth hw;
    @BeforeEach
    void initService() {
        HWMeth hw = new HWMeth();
        this.hw = hw;
    }
    @ParameterizedTest
    @ValueSource(ints = {2,3})
    void EvenOddNumberTest(int num) {
        if(num == 2)
            assert hw.evenOddNumber(num) == true;
        else if(num == 3)
            assert hw.evenOddNumber(num) == false;
    }

    @ParameterizedTest
    @ValueSource(ints = {10,30,120})
    void numberInIntervalTest(int num) {
        if(num < 25)
            assert hw.numberInInterval(num) == false;
        else if(num > 100)
            assert hw.numberInInterval(num) == false;
        else
            assert hw.numberInInterval(num) == true;
    }
}
