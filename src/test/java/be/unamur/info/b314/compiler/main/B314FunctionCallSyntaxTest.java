package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314FunctionCallSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314FunctionCallSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    //
    // Serie FunctionCall OK
    //
    @Test
    public void testFunctionCall_sum_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ok/sum.b314", testFolder.newFile(), true, "FunctionCall: sum");
    }

    @Test
    public void testFunctionCall_factorial_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ok/factorial.b314", testFolder.newFile(), true, "FunctionCall: factorial");
    }

    //
    // Serie FunctionCall KO
    //
    @Test
    public void testFunctionCall_return_type_mismatch2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/return_type_mismatch2.b314", testFolder.newFile(), false, "FunctionCall: return_type_mismatch2");
    }

    @Test
    public void testFunctionCall_return_type_mismatch_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/return_type_mismatch.b314", testFolder.newFile(), false, "FunctionCall: return_type_mismatch");
    }

    @Test
    public void testFunctionCall_function_undefined_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/function_undefined.b314", testFolder.newFile(), false, "FunctionCall: function_undefined");
    }

    @Test
    public void testFunctionCall_param_type_mismatch_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/param_type_mismatch.b314", testFolder.newFile(), false, "FunctionCall: param_type_mismatch");
    }

    @Test
    public void testFunctionCall_number_params_mismatch2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/number_params_mismatch2.b314", testFolder.newFile(), false, "FunctionCall: number_params_mismatch2");
    }

    @Test
    public void testFunctionCall_number_params_mismatch_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/FunctionCall/ko/number_params_mismatch.b314", testFolder.newFile(), false, "FunctionCall: number_params_mismatch");
    }

}