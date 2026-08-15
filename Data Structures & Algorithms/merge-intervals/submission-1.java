class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = intervals.length;
        int l = intervals[0][0];
        int r = intervals[0][1];

        for (int i=1; i<n; i++) {

            if (r >= intervals[i][0]) {
                r = Math.max(r, intervals[i][1]);
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(l);
                arr.add(r);
                ans.add(arr);

                l = intervals[i][0];
                r = intervals[i][1];
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(l);
        arr.add(r);
        ans.add(arr);

        int k = ans.size();
        System.out.println(k);
        int[][] a = new int[k][2];

        for (int i=0; i<k; i++) {
            a[i][0] = ans.get(i).get(0);
            a[i][1] = ans.get(i).get(1);
        }

        return a;
    }
}
