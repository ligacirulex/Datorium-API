import com.datorium.Datorium.API.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DatoriumApiApplicationTests {
	// Hey, I need a method, that gives me my fullname
	@Test
	void WHEN_NameIsLīgaAndSurnameIsCīrule_THEN_Result_Līga_Cīrule() {
		//Arrange -> prepare data and services
		var userService = new UserService();

		//Act -> Do some action, usually call a method
		var fullname = userService.getFullName("Līga", "Cīrule");

		//Assert-> test if the result is correct
		Assert.isTrue(fullname.equals("Līga Cīrule"), "Hey, the name should be with a space inbetween and should contain both name and surname");
	}
}
