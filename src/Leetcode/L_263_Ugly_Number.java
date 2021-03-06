package Leetcode;

/**
 * Created by sqfan on 8/10/17.
 */
public class L_263_Ugly_Number {
  public boolean isUgly(int num) {
    if (num <= 0) return false;
    while (num % 2 == 0) num >>= 2;
    while (num % 3 == 0) num /= 3;
    while (num % 5 == 0) num /= 5;
    return num == 1;
  }
}
