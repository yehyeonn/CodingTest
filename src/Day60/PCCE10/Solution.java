package Day60.PCCE10;

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] arr = {"code","date","maximum","remain"};
        List<String> list = Arrays.asList(arr);

        int extIdx = list.indexOf(ext);
        int sortIdx = list.indexOf(sort_by);

        int[][] answer = Arrays.stream(data).filter(o1 -> o1[extIdx] < val_ext)
                .sorted((o1 ,o2) -> o1[sortIdx]-o2[sortIdx]).toArray(int[][]::new);

        return answer;
    }
}
