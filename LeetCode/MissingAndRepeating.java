class Solution {
	ArrayList<Integer> findTwoElement(int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i<arr.length; i++) {
			if (set.contains(arr[i])) {
				ans.add(arr[i]);
			}
			set.add(arr[i]);
		}
		for (int i = 1; i<=arr.length; i++) {
			if (!set.contains(i)) {
				
				ans.add(i);
				break;
			}
		}
		return ans;
	}
}
