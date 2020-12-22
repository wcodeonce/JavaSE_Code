/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class GetMax02 {
    public static void main(String[] args) {

        //需求方法用于获取数组中元素的最大值,调用方法并输出结果

        //定义一个数组
        int[] arr = {12, 45, 98, 73, 60};

        //调用方法
        int nummber = getMax(arr);

        //结果输出
        System.out.println("number: " + nummber);

    }
    //定义一个方法
    public static int getMax(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
