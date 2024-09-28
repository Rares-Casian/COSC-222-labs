import static org.junit.Assert.assertArrayEquals;
import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntSortTest {
		
	
	static int[] A = {10,0,1,9,7,4,3,8,5};
	static int[] Asorted = {0,1,3,4,5,7,8,9,10};
	static int[] Bsorted = {-9,-8,-7,-6,-5,-4,-1,0};
	static int[] B = {0,-5,-6,-4,-9,-8,-7,-1};
	static int[] C;
	static int[] D;
		
	@BeforeAll
	static void setup()
	{
		C = A.clone();
		Arrays.sort(C);
		D = B.clone();
		Arrays.sort(D);
	}
	
	
	@Test
	void testInsertionSort()
	{
		assertArrayEquals(Asorted, IntSort.InsertionSort(A));
		assertArrayEquals(Bsorted, IntSort.InsertionSort(B));
		assertArrayEquals(C, IntSort.InsertionSort(A));
		assertArrayEquals(D, IntSort.InsertionSort(B));
		
	}
	
	@Test
	void testCountingSort()
	{
		assertArrayEquals(Asorted, IntSort.CountingSort(A));
		assertArrayEquals(C, IntSort.CountingSort(A));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
