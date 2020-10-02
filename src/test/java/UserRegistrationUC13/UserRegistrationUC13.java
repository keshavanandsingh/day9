package UserRegistrationUC13;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationUC13 {

	@Test
	public void testNameValidate() {
		// Valid names
		String[] validNames = { "keshav", "singh" };
		for (String name : validNames)
			assertTrue(UserRegistration.validateName.validate(name));
		// Invalid names
		String[] invalidNames = { "shav", "be", "kesh5v" };
		for (String name : invalidNames)
			assertFalse(UserRegistration.validateName.validate(name));
	}

	@Test
	public void testEmailValidate() {
		// Valid email
		String[] validEmails = { "xyz@yahoo.com", "xyz-100@yahoo.com", "xyz.100@yahoo.com", "xyz111@xyz.com",
				"xyz-100@xyz.net", "xyz.100@xyz.com.au", "xyz@1.com", "xyz@gmail.com.co", "xyz+100@gmail.com" };
		for (String email : validEmails)
			assertTrue(UserRegistration.validateEmail.validate(email));
		// Invalid email
		String[] invalidEmails = { "xyz", "xyz@.com.my", "xyz123@gmail.a", "xyz123@.com", "xyz123@.com.com",
				".xyz@xyz.com", "xyz()*@gmail.com", "xyz@%*.com", "xyz..2002@gmail.com", "xyz.@gmail.com",
				"xyz@xyz@gmail.com", "xyz@gmail.com.1a", "xyz@gmail.com.aa.au" };
		for (String email : invalidEmails)
			assertFalse((UserRegistration.validateEmail.validate(email)));
	}

	@Test
	public void testMobileValidate() {
		// Valid mobile numbers
		String[] validMobileNumbers = { "91 8292826716", "92 6178692797" };
		for (String mobileNumber : validMobileNumbers)
			assertTrue(UserRegistration.validateMobileNumer.validate(mobileNumber));
		// Invalid mobile numbers
		String[] invalidEmails = { "9 8292826716", "91 689926822" };
		for (String mobileNumber : invalidEmails)
			assertFalse(UserRegistration.validateMobileNumer.validate(mobileNumber));
	}

	@Test
	public void testPasswordValidate() {
		// Valid passwords
		String[] validPasswords = { "keshav123*", "keshav3Kabir/" };
		for (String password : validPasswords)
			assertTrue(UserRegistration.validatePassword.validate(password));
		// Invalid passwords
		String[] invalidPasswords = { "Keshav*98/", "keshavKon!", "keshavKon!", "keshavKon!" };
		for (String password : invalidPasswords)
			assertFalse(UserRegistration.validatePassword.validate(password));
	}

}
