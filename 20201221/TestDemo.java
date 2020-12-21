public class TestDemo {
    public static void main(String[] args) {

        //给定一个矩阵 A， 返回 A 的转置矩阵。
        //
        //矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
        //
        //示例 1：
        //
        //输入：[[1,2,3],[4,5,6],[7,8,9]]
        //输出：[[1,4,7],[2,5,8],[3,6,9]]
        //示例 2：
        //
        //输入：[[1,2,3],[4,5,6]]
        //输出：[[1,4],[2,5],[3,6]]
        int[][] arr = new int [][] {{1,2},{4,5},{7,8}};
        int[][] arr2 = transposition(arr);
        for(int row = 0;row < arr2.length;row++){
            for(int cow = 0;cow <arr2[row].length;cow++){
                System.out.printf("%d\t",arr2[row][cow]);
            }
            System.out.println(" ");
        }


        }
    public static int[][] transposition(int[][] A){
        int wid=A.length;
        int len=A[0].length;
        int[][]res=new int[len][wid];
        for(int j=0;j<len;j++){
            for(int i=0;i<wid;i++){
                res[j][i]=A[i][j];
            }
        }
        return res;
    }


    }


