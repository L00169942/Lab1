package mvnLab1Proj;

import static org.junit.Assert.*;

import org.junit.Test;

import mvnLab1Proj.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testGreetingMessage() {
		assertEquals("Hello John Welcome to Java Programming", HelloWorld.getGreetingMessage("John"));
	}

}
