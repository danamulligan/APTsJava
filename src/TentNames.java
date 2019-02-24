public class TentNames {
	public int popular(String[] tents){
		String [] names = names(tents);
		int[] counts = occur(tents, names);
		int count = 0;

		for(int k=0; k<counts.length; k++)
		{
			if(counts[k] > count) {
				count = counts[k];
			}
		}

		return count;
	}
	public String[] names(String[] tents) 
	{
		String name = "";

		for(int k=0; k<tents.length; k++)
		{
			String[] holder = tents[k].split(" ");
			for(String s : holder)
			{
				if(!name.contains(s))
				{
					name = name + s + ":,";
				}
			}
		}

		return name.split(",");  
	}
	public int[] occur(String[] tents, String[] names)
	{
		int[] count = new int[names.length];

		for(String t : tents) {
			String[] tent = tentNames(t);
			for(int i=0; i<tent.length; i++) {
				for(int k=0; k<names.length; k++)
				{
					if(tent[i].contains(names[k]))
					{
						count[k]+=1;
					}
				}
			}
		}

		return count;
	}
	public String[] tentNames(String tent) 
	{

		String[] tentNames = tent.split(" ");
		String holder = "";

		for(int k=0; k<tentNames.length; k++) 
		{
			holder = holder + tentNames[k] + ":,";
		}

		return holder.split(",");

	}

	public static void main(String[] args) 
	{
		TentNames o = new TentNames();
		//define params
		String[] tents = {"mike michael mikey", "sue susan susie", "jeff jeffrey jeffie", "bob bobby robert", "tony anthony anton", "tom tommy thomas"};
		int result = o.popular(tents);
		System.out.println(result);
	}
}
