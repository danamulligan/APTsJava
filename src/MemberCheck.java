import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class MemberCheck {
	public String[] whosDishonest(String[] club1, String[] club2, String[] club3) 
	{
		System.out.println("new test!");
		HashSet<String> one = new HashSet<>();
		HashSet<String> two = new HashSet<>();
		HashSet<String> thr = new HashSet<>();

		// add visitors to each club's respective set
		for(String o : club1) {
			one.add(o);
		}
		for(String w : club2) {
			two.add(w);
		}
		for(String h : club3) {
			thr.add(h);
		}

		HashSet<String> cheat = new HashSet<>();
		
		// add cheaters to the set, get size of the set
		for(int k=0; k<club2.length; k++) {
			if(one.contains(club2[k])) {
				cheat.add(club2[k]);
			}
			if(thr.contains(club2[k])) {
				cheat.add(club2[k]);
			}
		}
		for(int k=0; k<club3.length; k++) {
			if(one.contains(club3[k])) {
				cheat.add(club3[k]);
			}
		}

		TreeSet<String> sorted = new TreeSet<>(cheat);
		HashSet<String> already = new HashSet<>();
		//ArrayList<String> ret = new ArrayList<>(sorted);
		
		String holder = "";
		int k = 0;
		String [] rete = new String[sorted.size()];
		for(String s : sorted)
		{
			holder = s;
			System.out.println(holder);
			rete[k] = s;
			k+=1;
		}
		
/*
		for(int k=0; k<count; k++) {
			for(String s : sorted)
			{
				holder = s;
				already.add(s);
				break;
			}
			for(String s : sorted)
			{
				rete[k] = s;
			}
		}
*/
		System.out.println("");
		return rete;
	}
}

