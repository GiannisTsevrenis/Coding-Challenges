class Solution {
  public int findComplement(int num) {
    for (long i = 1; i <= num; i <<= 1) // XOR from the right most bit, to the left
      num ^= i; 
    return num;
  }
}
