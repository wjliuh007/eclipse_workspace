package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class Test {

	@SuppressWarnings("unused")
	private final Map<String, Object> location;

	public Test(Map<String, Object> location) {
		this.location = deepCopy(location);
	}

	private static Map<String, Object> deepCopy(Map<String, Object> location2) {

		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte[] m1 = new byte[] { 97, 99, 101, 103, 104, 100, 113, 116, 106 };
		byte[] result = doReverse(m1, 5);
		System.out.println(JSON.toJSON(m1));
		System.out.println(JSON.toJSON(result));

	}

	public static byte[] doReverse(byte[] orgin, int index) {
		int skipIndex = index;
		byte[] result = new byte[orgin.length];
		for (int i = 0; i < orgin.length; i++) {
			if (i < orgin.length - index) {
				result[i] = orgin[i + index];
			}
			if (i >= orgin.length - index) {
				result[i] = orgin[index - (skipIndex)];
				skipIndex--;
			}
		}

		return result;
	}

	private static void doTest() {
		int[] arry = new int[] { 9, 3, 35, 1, 68, 43, 2, 11, 7 };

		int min, max;
		min = max = arry[0];
		for (int i = 0; i < arry.length - 2; i++) {
			if (arry[i] < arry[i + 1]) {
				if (min >= arry[i]) {
					min = arry[i];
				}
				if (max <= arry[i + 1]) {
					max = arry[i + 1];
				}
			} else {
				if (max <= arry[i]) {
					max = arry[i];
				}
				if (min >= arry[i + 1]) {
					max = arry[i + 1];
				}
			}
		}
		System.out.println("min:" + min);
		System.out.println("max:" + max);
		reverseString();
		List<String> indexList = new ArrayList<String>();
		sort(arry, 0, arry.length - 1, indexList);
		for (String al : indexList) {
			System.out.print(al);
		}
	}

	public static void sort(int arr[], int low, int high, List<String> index) {
		int l = low;
		int h = high;
		int povit = arr[low];

		while (l < h) {
			while (l < h && arr[h] >= povit) {
				index.add("[" + (l + 1) + "=" + (h + 1) + "]");
				h--;
			}

			if (l < h) {
				index.add("[" + (l + 1) + "=" + (h + 1) + "]");
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}

			while (l < h && arr[l] <= povit) {
				index.add("[" + (l + 1) + "=" + (h + 1) + "]");
				l++;
			}
			if (l < h) {
				index.add("[" + (l + 1) + "=" + (h + 1) + "]");
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		if (l > low)
			sort(arr, low, l - 1, index);
		if (h < high)
			sort(arr, l + 1, high, index);
	}

	/**
	 * 左右对调字符
	 */
	public static void reverseString() {
		String reverse = "pharmacy";
		char[] strary = reverse.toCharArray();
		int s = 0;
		int e = strary.length - 1;
		while (s < e) {
			char temp = strary[s];
			strary[s] = strary[e];
			strary[e] = temp;
			s++;
			e--;
		}
		System.out.println(strary);
	}

}
