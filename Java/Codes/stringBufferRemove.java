// remove chars from index 4 to 9 from reversed string using string buffer

public class stringBufferRemove {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        sb.delete(4, 9);

        System.out.println(sb);
    }
}