package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314ExprGSyntaxTest {

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
    public void testExprG_variable_undefined_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/exprG/variable_undefined_ko.b314", testFolder.newFile(), false, "Left-hand-side expression: variable undefined");
    }

    @Test
    public void testExprG_array_mismatch_dimensions_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/exprG/array_mismatch_dimensions_ko.b314", testFolder.newFile(), false, "Affect instruction: Dimension mismatch between array declaration and utilisation");
    }
    
}