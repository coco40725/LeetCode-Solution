/**
@author Yu-Jing
@create 2023-10-01-下午 05:52
 */
class Solution1732(){
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var sum = 0
        gain.forEach { it ->
            sum += it
            if (sum > max) max = sum
        }
          return max
    }
}