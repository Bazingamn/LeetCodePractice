/**
 * 
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * 
 * 剑指offer58
 */
public class leftRotaionString {
    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        String result = new leftRotaionString().rotation1(str, k);
        System.out.println(result);
    }

    /**
     * 方法一：字符串拼接
     * @param str
     * @param index
     * @return
     */
    public String rotation1(String str, int index){
        String newstr = str.substring(index,str.length()) + str.substring(0, index);
        return newstr;
    }
}
