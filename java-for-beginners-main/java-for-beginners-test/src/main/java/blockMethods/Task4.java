package blockMethods;

public class Task4 {
    public int[] stringLength(String[] strings)
    {
        int res[] = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            res[i] = strings[i].length();
        }
        return res;
    }
}
