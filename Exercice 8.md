Test class :

package bankAccountApp;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;

import bankAccountApp.BankAccount;
import org.junit.Test;

public class BankAccountTest {
	String name = "John";
	char gender = 'm';
	int age = 22;
	float weight = 190;
	float height = 172;
	String hairColor = "brown";
	String eyeColor = "green";
	String email = "jufm@gmail.com";

	int assignAccountNumber = 0;
	int accountNumberExists = 1;
	int initMoneyAmount = 5000;
	int withdrawLimit = 700;
	String dateCreated = "05/21/2019";
	BankAccount bankAccount = null;
	//String text = "C:\\Users\\jay4k\\Desktop\\stuff\\Bankaccountinfo\\BankAccountinfotext.text";
	String text = "This is text";
	Bank bank = null;
	Person accountHolder = null;
	String serializedPerson = null;

	@Before
	public void setup() {
		// Create Person
		try {
			accountHolder = new Person(name, gender, age, weight, height, hairColor, eyeColor, email);
			serializedPerson = name + Person.DELIM + gender + Person.DELIM + age + Person.DELIM + height + Person.DELIM
					+ weight + Person.DELIM + hairColor + Person.DELIM + eyeColor + Person.DELIM + email;
		} catch (Exception e) {
			System.out.print("Unexpected failure during test setup creating accountHolder");
			e.printStackTrace();
		}
		bank = new Bank();
		bankAccount = new BankAccount(initMoneyAmount, withdrawLimit, dateCreated, accountHolder);
	}

	@Test
	public void deposit_150_money() throws Exception{
		BankAccount acc1 = new BankAccount();
		bank.addAccount(acc1, assignAccountNumber);
		double depositAmount = 150;
		acc1.depositMoney(depositAmount);
	}

	@Test
	public void deposit_minus_150_money() throws Exception {
		BankAccount acc1 = new BankAccount();
		bank.addAccount(acc1, assignAccountNumber);
		double depositAmount = -150;
		acc1.depositMoney(depositAmount);
	}


}


Results : 

(base) PS C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application> mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
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
[INFO] skip non existing resourceDirectory C:\Users\arthu\Bureau\3A-2IA\Qualité Logicielle\Projet_Maven\maven_bank_application\ArthurWavreille_Exo6_QualiteLogicielle\bank-application\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1252, i.e. build is platform dependent!  
[INFO] Compiling 2 source files with javac [debug target 17] to target\test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running bankAccountApp.AllTests
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s -- in bankAccountApp.AllTests
[INFO] Running bankAccountApp.BankAccountTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in bankAccountApp.BankAccountTest    
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.838 s
[INFO] Finished at: 2025-11-19T15:30:45+01:00
[INFO] ------------------------------------------------------------------------