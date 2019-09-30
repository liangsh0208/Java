//反转排序
public class ReverseSort {
    public static void main(String[] args){
        int[] array = {10, 20, 30, 40, 50, 60};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
    }

    public void sort(int[] array){
        System.out.println("数组的原有内容: ");
        showArray(array);
        int temp;
        int len = array.length;
        for (int i=0; i< len/2 ;i++){
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        showArray(array);
    }

    public void showArray(int[] array){
        for (int i: array){
            System.out.print(" "+i);
        }
        System.out.println();
    }
}
