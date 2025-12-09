
public class PerformanceTest {
	
	private static final long MEGABYTE = 1024L * 1024L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] numbers = new double [1000000];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Math.random();
		}
		
		//create a java runtime object
		
		Runtime rt = Runtime.getRuntime();
		
		//run the garbage collector
		
		rt.gc();
		
		//calculate the used memory
		
		long memory = rt.totalMemory() - rt.freeMemory();
		
		System.out.println("Total memory available (Mbytes): " + bytesToMegabytes(rt.totalMemory()));
		System.out.println("Total memory used (Mbytes): " + bytesToMegabytes(memory));		
		System.out.println("Total free memory (Mbytes): " + bytesToMegabytes(rt.freeMemory()));		
	}

	public static long bytesToMegabytes(long bytes)
	{
		return bytes/ MEGABYTE;
	}
}
