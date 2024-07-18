package Day07.programmers;
class Solution {

    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;
        int width = park.length;
        int height = park[0].length();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] r = route.split(" ");
            String op = r[0];
            int step = Integer.parseInt(r[1]);

            int opX = 0, opY = 0;
            switch (op) {
                case "N":
                    opX = -1;
                    break;
                case "S":
                    opX = 1;
                    break;
                case "W":
                    opY = -1;
                    break;
                case "E":
                    opY = 1;
                    break;
            }

            int moveX = x, moveY = y;
            boolean flag = true;
            for(int i = 0; i < step; i++) {
                moveX += opX;
                moveY += opY;

                if(moveX < 0 || moveX >= width || moveY < 0 || moveY >= height || park[moveX].charAt(moveY) == 'X') {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                x = moveX;
                y = moveY;
            }
        }

        int[] answer = new int[]{x, y};
        return answer;
    }
}
