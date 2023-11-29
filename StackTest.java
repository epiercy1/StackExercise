import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	public void testPushAndPop() {
		Stack<Integer>stack = new StackImplementation<Integer>();
		stack.push(10);
		int item = stack.pop();
		if(item != 10)
			fail("Added 10, popped " + item);
		if(!stack.isEmpty())
			fail("Added 10 and popped it, stack not empty");
	}

}
