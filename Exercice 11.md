I changed the int type of the balance attribute to a double as it is considered as a double in the original project (and it is more realistic) :

Feature: Basic bank account behavior
  Scenario: A new account has zero balance
    Given I have a new bank account
    When I check its balance
    Then the balance should be 0.0

And the Then step becomes : 

@Then("the balance should be {double}")
    public void the_balance_should_be(Double expected) {
        // TODO: assert that observedBalance equals expected
        assertEquals(expected.doubleValue(), observedBalance, 0.00001); 
    }


Result of the tests **(cucumber scenario included)** : 

(base) PS C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application> mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.14:prepare-agent (default) @ bank-application ---
[INFO] argLine set to "-javaagent:C:\\Users\\arthu\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.14\\org.jacoco.agent-0.8.14-runtime.jar=destfile=C:\\Users\\arthu\\Bureau\\3A-2IA\\Qualité Logicielle\\Projet_Maven\\maven_bank_application\\ArthurWavreille_Exo6_QualiteLogicielle\\bank-application\\target\\jacoco.exec"
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\main\resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource from src\test\resources to target\test-classes
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!      
[INFO] Compiling 4 source files with javac [debug target 17] to target\test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running bankAccountApp.AllTests
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.109 s -- in bankAccountApp.AllTests
[INFO] Running bankAccountApp.BankAccountTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in bankAccountApp.BankAccountTest        
[INFO] Running test.java.bankAccountApp.bdd.RunBankAccountCucumberTest

Scenario: A new account has zero balance # src/test/resources/features/bank_account_basic.feature:2
  Given I have a new bank account        # test.java.bankAccountApp.bdd.BankAccountBasicSteps.i_have_a_new_bank_account()
  When I check its balance               # test.java.bankAccountApp.bdd.BankAccountBasicSteps.i_check_its_balance()    
  Then the balance should be 0.0         # test.java.bankAccountApp.bdd.BankAccountBasicSteps.the_balance_should_be(java.lang.Double)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.612 s -- in test.java.bankAccountApp.bdd.RunBankAccountCucumberTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.989 s
[INFO] Finished at: 2025-11-19T16:41:03+01:00
[INFO] ------------------------------------------------------------------------