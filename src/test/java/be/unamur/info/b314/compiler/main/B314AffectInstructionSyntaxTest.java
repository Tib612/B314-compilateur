package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314AffectInstructionSyntaxTest {

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
    public void testAffectInstruction_type_mismatch_bool_intG_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/type_mismatch_bool_intG_ko.b314", testFolder.newFile(), false, "Affect instruction: Type mismatch between scalar variables of two sides");
    }

    @Test
    public void testAffectInstruction_TypeMismatchArrayArray_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/type_mismatch_array_arrayG_ko.b314", testFolder.newFile(), false, "Affect instruction: Type mismatch between array variables of two sides");
    }

    @Test
    public void testAffectInstruction_type_mismatch_int_square_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/type_mismatch_int_square_ko.b314", testFolder.newFile(), false, "Affect instruction: Type mismatch between array variables of two sides");
    }

    @Test
    public void testAffectInstruction_lhs_entire_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/lhs_entire_array_ko.b314", testFolder.newFile(), false, "Affect instruction: Array used in lhs expression");
    }

    @Test
    public void testAffectInstruction_rhs_entire_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/rhs_entire_array_ko.b314", testFolder.newFile(), false, "Affect instruction: Array used in rhs expression");
    }

    @Test
    public void testAffectInstruction_same_type_entire_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectInstructions/same_type_entire_array_ko.b314", testFolder.newFile(), false, "Affect instruction: Array used in both sides of the expression");
    }
    
}