package StepDefinations;

import Utilities.Textcontextsetup;
import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.AfterTest;

import java.io.IOException;

public class Hooks {
    public Textcontextsetup textcontextsetup;
    public Hooks(Textcontextsetup textcontextsetup)
    {
        this.textcontextsetup=textcontextsetup;
    }

    @AfterTest
    public void afterTest() throws IOException {
        textcontextsetup.driverManager.Driveropen().quit();

    }
}
