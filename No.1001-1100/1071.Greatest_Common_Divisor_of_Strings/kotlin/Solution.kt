/**
@author Yu-Jing
@create 2023-06-11-下午 05:14
 */
class Solution1071 {
    fun gcdOfStrings(str1: String, str2: String): String {
        val minStr: String
        val maxStr: String
        var divide: String = ""
        if (str1.length < str2.length){
            minStr = str1
            maxStr = str2
        }else {
            minStr = str2
            maxStr = str1
        }

        divide = minStr
        while(divide.isNotEmpty()){
            val multipleMin = minStr.length / divide.length
            val multipleMax = maxStr.length / divide.length
            val restMin = minStr.length % divide.length
            val restMax = maxStr.length % divide.length

            if (restMin == 0 && restMax == 0 &&
                divide.repeat(multipleMin) == minStr && divide.repeat(multipleMax) == maxStr){
                return divide
            }
            divide = divide.dropLast(1)
        }

        return divide
    }
}