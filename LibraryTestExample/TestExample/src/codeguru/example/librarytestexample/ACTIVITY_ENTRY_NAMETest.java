package codeguru.example.librarytestexample;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class codeguru.example.librarytestexample.ACTIVITY_ENTRY_NAMETestTest \
 * codeguru.example.librarytestexample.tests/android.test.InstrumentationTestRunner
 */
public class ACTIVITY_ENTRY_NAMETestTest extends ActivityInstrumentationTestCase2<ACTIVITY_ENTRY_NAMETest> {

    public ACTIVITY_ENTRY_NAMETestTest() {
        super("codeguru.example.librarytestexample", ACTIVITY_ENTRY_NAMETest.class);
    }

}