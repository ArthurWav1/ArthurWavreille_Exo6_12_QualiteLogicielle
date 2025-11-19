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
		BankAccount acc1 = bankAccount;
		bank.addAccount(acc1, assignAccountNumber);
		double depositAmount = 150;
		acc1.depositMoney(depositAmount);
	}

	@Test
	public void deposit_minus_150_money() throws Exception {
		BankAccount acc1 = bankAccount;
		bank.addAccount(acc1, assignAccountNumber);
		double depositAmount = -150;
		acc1.depositMoney(depositAmount);
	}


	@Test
	public void withdraw_moneyTest() throws Exception {
		BankAccount acc1 = bankAccount;
		bank.addAccount(acc1, assignAccountNumber);
		double withdrawAmount_1 = 20;
		boolean success_1 = acc1.withdrawMoney(withdrawAmount_1);
		acc1.setWithdrawLimit(5000);
		double withdrawAmount_2 = 5000;
		boolean success_2 = acc1.withdrawMoney(withdrawAmount_2);

		assertTrue(success_1);	
		assertTrue(!success_2);
	}

}
