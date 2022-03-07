package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {

	
	@Test(priority = 0)
	public void startacar() {
		System.out.println("Start the Car");
	}
	@Test(priority=5,enabled = false)
	public void playmusic() {
		System.out.println("play the music");
	}
	@Test(priority = 1,inticative=2)
	public void putfirstgear() {
		System.out.println("shift to the first gear");
	}
	@Test(priority = 2)
	public void putsecondgear() {
		System.out.println("shift to the second gear");
	}
	@Test(priority = 3)
	public void putthirdgear() {
		System.out.println("shift to the third gear");
	}
	@Test(priority = 4)
	public void putforuthgear() {
		System.out.println("shift to the foruth gear");
	@Test(priority = 5)
	public void putfifthgear() {
		System.out.println("shift to the fifth gear");
	}
}
