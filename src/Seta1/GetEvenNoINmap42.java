package Seta1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetEvenNoINmap42 {

    public static void main(String[] args) {
    	int c = 0;
		float sum = 0;

		Map<Integer, Float> hm = new HashMap<Integer, Float>();

		hm.put(1, 4.2f);
		hm.put(2, 6.3f);
		hm.put(3, 7.4f);
		hm.put(4, 9.4f);

		hm.get(hm.keySet());
		hm.get(hm.values());

		Iterator<Integer> it = hm.keySet().iterator();

		while (it.hasNext()) {
			int b = it.next();

			if (b % 2== 0) {
				c++;

				sum = sum + hm.get(b);
			}
		}

		System.out.println("Output is-->> "+sum / c);

		System.out.println("sum is-> "+sum);
		System.out.println("Odd key couny are-> "+c);

       }
}