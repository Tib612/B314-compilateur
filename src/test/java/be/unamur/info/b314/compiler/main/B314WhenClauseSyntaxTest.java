package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314WhenClauseSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314WhenClauseSyntaxTest.class);

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
    // Serie WhenClause OK
    //
    @Test
    public void testWhenClause_condition_bool_expr_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/WhenClause/ok/condition_bool_expr.b314", testFolder.newFile(), true, "WhenClause: condition_bool_expr");
    }

    @Test
    public void testWhenClause_condition_function_call_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/WhenClause/ok/condition_function_call.b314", testFolder.newFile(), true, "WhenClause: condition_function_call");
    }

    //
    // Serie WhenClause KO
    //
    @Test
    public void testWhenClause_condition_wrong_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/WhenClause/ko/condition_wrong_type.b314", testFolder.newFile(), false, "WhenClause: condition_wrong_type");
    }

    @Test
    public void testWhenClause_condition_function_wrong_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/WhenClause/ko/condition_function_wrong_type.b314", testFolder.newFile(), false, "WhenClause: condition_function_wrong_type");
    }
    
    @Test
    public void testWhenClause_multiple_default_clauses_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/WhenClause/ko/multiple_default_clauses.b314", testFolder.newFile(), false, "WhenClause: multiple_default_clauses");
    }

}