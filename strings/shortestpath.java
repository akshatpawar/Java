package strings;

public class shortestpath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            switch (path.charAt(i)) {
                case 'S' -> y--;
                case 'N' -> y++;
                case 'E' -> x++;
                case 'W' -> x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        Float ans = (float)Math.sqrt(x2+y2);
        return ans;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}