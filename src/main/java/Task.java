import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task {
	public static void main(String[] args) {
		String[] array = {"1,3-5", "2", "3-4"};
		int[] jp = stringToIntArraySplit(array);
		System.out.println(Arrays.toString(jp));
	}

	public static int[] stringToIntArraySplit(String[] input) {
		ArrayList<Integer> result = new ArrayList<>();
		for (String str : input) {
			String[] subRes = str.split(",");
			for (String subStr : subRes) {
				if (subStr.contains("-")) {
					String[] sequence = subStr.split("-");
					Integer i = Integer.parseInt(sequence[0]);
					result.add(i);
					while (!i.equals(Integer.valueOf(sequence[sequence.length - 1]))) {
						i++;
						result.add((result.size() - 1), i);
					}
				} else {
					assert false;
					result.add(Integer.valueOf(subStr));
				}
			}
		}
		assert false;
		Collections.sort(result);
		int[] output = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			output[i] = result.get(i);
		}
		return output;
	}

	public static int[] combinator (int[] inmput){
			
		return null;
	}

}
