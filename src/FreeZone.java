public class FreeZone {
	public int[] uncovered(int zones, String[] covered){
		String un = "";
		int count = zones;

		for(int k=0; k<zones; k++) 
		{
			if(!good(k, zones, covered)) 
			{
				un = un + k + ",";
				count -= 1 ;
			}
		}
		
		if(count == zones) 
		{
			return new int[0];
		}
		else 
		{
			String[] unc = un.split(",");
			int[] result = new int[unc.length];

			for(int k=0; k<result.length; k++) 
			{
				result[k] = Integer.parseInt(unc[k]);
			}
			return result;
		}
	}

	public boolean good(int check, int zones, String[] covered) 
	{
		for(int i=0; i<covered.length; i++)
		{
			if(yes(check, covered[i])) 
			{
				return true;
			}
		}
		
		return false;
	}


	public boolean yes(int zone, String cov)
	{
		String[] num = cov.split(" ");
		int x = Integer.parseInt(num[0]);
		int y = Integer.parseInt(num[1]);
		
		if(zone >= x) 
		{
			if(zone <= y)
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		FreeZone o = new FreeZone();
		//define params
		int zones = 10;
		String[] covered = {"7 8", "7 8", "3 5", "6 9", "0 3"};
		int[] result = o.uncovered(zones, covered);
		for(int k=0; k<result.length; k++)
		{
			System.out.print(result[k]+" ");
		}
	}


}