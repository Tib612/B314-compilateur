package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314ExprDSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314commentsSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    };

        
    // Serie comments OK


    // Serie comments KO
    @Test
    public void testExprD_int_wrong_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation(
            "/syntax/exprD/int_wrong_type_ko.b314", 
            testFolder.newFile(), 
            false, 
            "Right-hand-side wrong type expression: int = bool + int"
        );
    }

    @Test
    public void testExprD_int_wrong_type_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation(
            "/syntax/exprD/int_wrong_type_array_ko.b314", 
            testFolder.newFile(), 
            false, 
            "Right-hand-side wrong type expression: int = array + int"
        );
    }

    @Test
    public void testExprD_bool_wrong_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation(
            "/syntax/exprD/bool_wrong_type_ko.b314", 
            testFolder.newFile(), 
            false, 
            "Right-hand-side wrong type expression: bool = int or bool"
        );
    }

    @Test
    public void testExprD_square_wrong_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation(
            "/syntax/exprD/square_wrong_type_ko.b314", 
            testFolder.newFile(), 
            false, 
            "Right-hand-side wrong type expression: bool = int is square"
        );
    }
}