package lyc221103;

public class Solution3 {
    public String simplifyPath(String path) {
        path.replaceAll("//","/");
        int n=path.length();
        if (path.charAt(n-1)=='/'){
            String substring = path.substring(0, n - 2);
        }
        return "";
    }
}
