class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> newlist = new ArrayList<>();

            newlist.add(1);

            for (int j = 1; j < i; j++) {
                int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                newlist.add(val);
            }
            if (i > 0) {
                newlist.add(1);
            }
            pascal.add(newlist);
        }

        return pascal;

    }
}

======================================================================================================================
  // My solution
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);

        list2.add(1);
        list2.add(1);
        if (numRows == 1) {
            lists.add(list1);
            return lists;
        }

        if (numRows == 2) {
            lists.add(list1);
            lists.add(list2);
            return lists;
        }

        lists.add(list1);
        lists.add(list2);
        for (int i = 2; i < numRows; i++) {
            List<Integer> list3 = new ArrayList<>();
            int sum = 0;
            List<Integer> prev = lists.get(i-1);
            list3.add(1);
            for (int j = 1; j < prev.size(); j++) {
                list3.add(prev.get(j - 1) + prev.get(j));
            }
            list3.add(1);
            lists.add(list3);
        }
        return lists;
    }
}
