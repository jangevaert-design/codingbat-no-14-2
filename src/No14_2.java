public class No14_2 {
  public boolean no14(int[] nums) {
    int count1 = 0;
    int count4 = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count1++;
      }
      if (nums[i] == 4) {
        count4++;
      }
    }
    return (count1 == 0 || count4 == 0);
  }
}
