package com.voya.samples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya"})
//@IncludePackages({"com.voya.testcases"})


//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
////@IncludePackages({"com.voya.testcases"})
//@ExcludePackages({"com.voya.testcases.trail"})

//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})

//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@ExcludePackages({"com.voya.testcases.greet"})
////@SelectClasses({CalculatorTest.class})


//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@IncludeTags({"first","simple","negative"})


//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@ExcludeTags({"first"})

@RunWith(Suite.class)
//@SuiteClasses({CalculatorTest.class,StudentDetailsTest.class})
@SelectPackages({"com.voya.testcases"})

public class AllTests {

}
