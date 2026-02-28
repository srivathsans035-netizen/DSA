import java.util.ArrayList;
import java.util.List;

public class BitTemplates {

    public static int bitwiseSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    public static boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }

    public static boolean isPowerOfFour(int x) {
        return x > 0 && (x & (x - 1)) == 0 && (x & 0x55555555) != 0;
    }

    public static int countSetBits(int x) {
        int count = 0;
        while (x != 0) {
            x &= (x - 1);
            count++;
        }
        return count;
    }

    public static boolean isEven(int x) {
        return (x & 1) == 0;
    }

    public static int getKthBit(int x, int k) {
        return (x >> k) & 1;
    }

    public static int setKthBit(int x, int k) {
        return x | (1 << k);
    }

    public static int clearKthBit(int x, int k) {
        return x & ~(1 << k);
    }

    public static int toggleKthBit(int x, int k) {
        return x ^ (1 << k);
    }

    public static int lowbit(int x) {
        return x & -x;
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int value : nums) {
            result ^= value;
        }
        return result;
    }

    public static int[] twoSingleNumbers(int[] nums) {
        int xor = 0;
        for (int value : nums) {
            xor ^= value;
        }

        int lowBit = xor & -xor;
        int first = 0;
        int second = 0;

        for (int value : nums) {
            if ((value & lowBit) == 0) {
                first ^= value;
            } else {
                second ^= value;
            }
        }

        return new int[] {first, second};
    }

    public static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    public static int xor1ToN(int n) {
        int mod = n & 3;
        if (mod == 0) return n;
        if (mod == 1) return 1;
        if (mod == 2) return n + 1;
        return 0;
    }

    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }
        return result;
    }

    public static List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    subset.add(arr[i]);
                }
            }
            result.add(subset);
        }

        return result;
    }

    public static List<Integer> allSubmasks(int mask) {
        List<Integer> submasks = new ArrayList<>();
        for (int sub = mask; sub > 0; sub = (sub - 1) & mask) {
            submasks.add(sub);
        }
        submasks.add(0);
        return submasks;
    }
}
