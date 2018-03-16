package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314commentsSyntaxTest {

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

    @Test
    public void testcomments_comments_everywhere_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comments_everywhere.b314", testFolder.newFile(), true, "comments: comments_everywhere");
    }

    @Test
    public void testcomments_empty_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/empty.b314", testFolder.newFile(), true, "comments: empty");
    }

    @Test
    public void testcomments_empty_multiple_lines_and_tab_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/empty_multiple_lines_and_tab.b314", testFolder.newFile(), true, "comments: empty_multiple_lines_and_tab");
    }

    // par tndao
    @Test
    public void test_example_description_monde_ok() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/description_monde.b314", testFolder.newFile(), true, "Description du monde");
    }

    // par tndao
    @Test
    public void test_parentheses_ok() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/parentheses_intExp.b314", testFolder.newFile(), true, "Strategy");
    }

    // par Thibaut
    @Test
    public void test_symbolTable() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/symbolTable.b314", testFolder.newFile(), true, "symbolTable");
    }

    // Serie comments KO

    @Test
    public void testcomments_at_least_one_instruction_in_default_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/at_least_one_instruction_in_default.b314", testFolder.newFile(), false, "comments: at_least_one_instruction_in_default");
    }

    @Test
    public void testcomments_missing_declare_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_declare_bloc.b314", testFolder.newFile(), false, "comments: missing_declare_bloc");
    }

    @Test
    public void testcomments_missing_default_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_default_bloc.b314", testFolder.newFile(), false, "comments: missing_default_bloc");
    }

    //ajouté par Thibaut
    @Test
    public void testcomments_wrong_array_size_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/wrong_array_size_ko.b314", testFolder.newFile(), false, "comments: wrong_array_size");
    }
    
}