class Quick {
	public void sort(int arr[], int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];
		while (l < h) {
			while (l < h && arr[h] >= povit)
				h--;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}
			while (l < h && arr[l] <= povit)
				l++;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
		if (l > low)
			sort(arr, low, l - 1);
		if (h < high)
			sort(arr, l + 1, high);
	}
}