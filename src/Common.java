import java.util.Arrays;

public class Common {
	public int count (String aa, String bb) 
	{
		int count = 0;
		boolean statement = false;
		String[] a = aa.split("");
		String[] b = bb.split("");
		int la = a.length;
		int lb = b.length;


		for (int k=0; k<la; k++) 
		{
			for (int r=0; r<lb; r++) 
			{
				if (a[k].equals(b[r]) && !a[k].equals("!")) 
				{
    				//System.out.println("found a match with k and r");
    				//System.out.print("k: ");
    				//System.out.println(k);

    				//System.out.print("r: ");
    				//System.out.println(r);


					statement = true;
					a = change(a, k);
					b = change(b, r);
				}
				if (statement == true) 
				{
					count += 1;
				}
				statement = false;
			}
		}
		//System.out.println("");

		return count;
	}

	public String[] change(String[] string, int n) 
	{
		String re = "";
		for (int k=0; k<string.length; k++) 
		{
			if (k == n) 
			{
				re += "!";
			}
			else 
			{
				re += string[k];
			}
		}
		//System.out.print("re: ");
		//System.out.println(re);

		return re.split("");
	}
	
	
	
	
	
  }