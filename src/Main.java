
void main(String[] args) {

    /*
    Assuming:
     m = 0, n = 1, o = 2, p = 3, q = 4, r = 5, s = 6, t = 7, u = 8, v = 9, w = 10, x = 11, y = 12, z = 13
    */
    int[][] matrix = new int[14][14];
    Stack<Integer> stack = new Stack<>();

    for(int i = 0; i < matrix.length; i++)
    {
        for(int j = 0; j < matrix.length; j++) {
            matrix[i][j] = 0;
        }
    }

    //setting edges

    matrix[0][4] = 1;
    matrix[0][5] = 1;
    matrix[0][11] = 1;
    matrix[1][4] = 1;
    matrix[1][2] = 1;
    matrix[1][8] = 1;
    matrix[2][5] = 1;
    matrix[2][9] = 1;
    matrix[2][6] = 1;
    matrix[3][2] = 1;
    matrix[3][6] = 1;
    matrix[3][13] = 1;
    matrix[4][7] = 1;
    matrix[5][8] = 1;
    matrix[5][12] = 1;
    matrix[6][5] = 1;
    matrix[8][7] = 1;
    matrix[9][10] = 1;
    matrix[9][11] = 1;
    matrix[10][13] = 1;
    matrix[12][9] = 1;

    topologicalSort(matrix, stack);
}

public static void topologicalSort(int[][] matrix, Stack<Integer> stack) {

    boolean[] visited = new boolean[14];

    for(int i = 0; i < visited.length; i++) {
        if(!visited[i]) {
            DFS(i,visited, matrix, stack);
        }
    }

    while(!stack.empty()) {

        int n = stack.pop();
        if(n == 0) {
            System.out.println("m");
        } else if(n == 1) {
            System.out.println("n");
        } else if(n == 2) {
            System.out.println("o");
        } else if(n == 3) {
            System.out.println("p");
        } else if(n == 4) {
            System.out.println("q");
        } else if(n == 5) {
            System.out.println("r");
        } else if(n == 6) {
            System.out.println("s");
        } else if(n == 7) {
            System.out.println("t");
        } else if(n == 8) {
            System.out.println("u");
        } else if(n == 9) {
            System.out.println("v");
        } else if(n == 10) {
            System.out.println("w");
        } else if(n == 11) {
            System.out.println("x");
        } else if(n == 12) {
            System.out.println("y");
        } else if(n == 13) {
            System.out.println("z");
        }


    }
}

public static void DFS(int node, boolean[] visited, int[][] matrix, Stack<Integer> stack) {
    visited[node] = true;
    for(int i = 0; i < visited.length; i++) {
        if(matrix[node][i] == 1 && !visited[i])
        {
            DFS(i,visited,matrix, stack);
        }
    }

    stack.push(node);

}
