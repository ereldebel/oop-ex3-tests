import org.junit.jupiter.api.Test;
import src.algo_questions.Solutions;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <B>Tests for the Solutions Class,</B>
 * featured in Exercise 3 part 2 of the new "Introduction to OOP" course,
 * HUJI, Winter 2021-2022 Semester.
 *
 * @author Erel Debel.
 *
 * Special thanks for Rani and Roi with their edge cases tips.
 */
class SolutionsTest {

	/**
	 *
	 */
	@Test
	public void alotStudyTimeTest() {
		assertEquals(3, Solutions.alotStudyTime(new int[]{2, 3, 1}, new int[]{1, 3, 2}));
		assertEquals(1, Solutions.alotStudyTime(new int[]{2, 3, 2}, new int[]{1, 7, 1}));
	}

	@Test
	public void minLeapTest() {
		assertEquals(0, Solutions.minLeap(new int[]{3}), "No leaps needed as n-1.");
		assertEquals(3, Solutions.minLeap(new int[]{1, 1, 1, 1}), "Only Option: 1,2,3,4");
		assertEquals(2, Solutions.minLeap(new int[]{1, 2, 1, 1}), "Best: 1,2,4");
		assertEquals(3, Solutions.minLeap(new int[]{1, 4, 6, 3, 1, 1, 1, 1, 1}), "Example: 1,2,3,9");
		assertEquals(3, Solutions.minLeap(new int[]{8, 4, 5, 8, 1, 5, 5, 2, 1, 1, 3, 1, 10}),
				"Example: 1,4,11,13");
		int[] depthArray = new int[100000000];
		Arrays.fill(depthArray, 1);
		assertEquals(depthArray.length - 1, Solutions.minLeap(depthArray),
				"Did you use recursion? keep in mind that recursive calls cost plenty of memory.");
		depthArray[124215] = 38;
		depthArray[89466461] = 1254;
		assertEquals(depthArray.length - depthArray[124215] - depthArray[89466461] + 1,
				Solutions.minLeap(depthArray));
	}

}