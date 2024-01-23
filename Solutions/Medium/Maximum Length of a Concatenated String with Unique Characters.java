class Solution {
  public int maxLength(List<String> arr) {
    List<Integer> masks = new ArrayList<>();

    for (String s : arr) {
      int mask = getMask(s);
      if (mask != -1)
        masks.add(mask);
    }

    return dfs(masks, 0, /*used=*/0);
  }

  private int dfs(List<Integer> masks, int s, int used) {
    int res = Integer.bitCount(used);
    for (int i = s; i < masks.size(); ++i)
      if ((used & masks.get(i)) == 0)
        res = Math.max(res, dfs(masks, i + 1, used | masks.get(i)));
    return res;
  }

  private int getMask(String s) {
    int mask = 0;
    for (char c : s.toCharArray()) {
      int i = c - 'a';
      if ((mask & (1 << i)) != 0)
        return -1;
      mask |= 1 << i;
    }
    return mask;
  }
}
