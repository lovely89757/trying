package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangletest {

	@Test
	public void validtriangleshouldhavepositiveside() {//不可小于0
		assertTrue(new triangle(2,4,5).isVald());
		assertFalse(new triangle(-2,4,5).isVald());
		assertFalse(new triangle(2,-10,5).isVald());
		assertFalse(new triangle(-1,-1,-1).isVald());
		assertFalse(new triangle(0,0,0).isVald());
	}
	
	@Test
	public void validtriangleshouldhaveSTGTOS() {//两边之和大于第三边
		assertTrue(new triangle(1,1,1).isVald());
		assertFalse(new triangle(2,4,10).isVald());
		assertFalse(new triangle(9,4,4).isVald());
		assertFalse(new triangle(2,8,5).isVald());
	}
	
	@Test
	public void islsosscelestriangle() {
		fail("Not yet implemented");
	}
	
	@Test
	public void isequllateraltriangle() {
		fail("Not yet implemented");
	}
}
