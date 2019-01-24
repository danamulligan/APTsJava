
public class CirclesCountry {
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) 
	{
		int crosses = 0;
		for(int c=0; c<x.length; c++) 
		{
			if (isInside(x1, y1, x[c], y[c], r[c]) && ! isInside(x2, y2, x[c], y[c], r[c])) 
			{
				crosses += 1;
			}
			if (isInside(x2, y2, x[c], y[c], r[c]) && ! isInside(x1, y1, x[c], y[c], r[c])) 
			{
				crosses += 1;
			}
		}
		return crosses;
	}
	
	private boolean isInside(int x, int y, int cx, int cy, int r) 
	{

		int dist = (x-cx)*(x-cx) + (y-cy)*(y-cy);
		return dist < r*r;
	}


}
