public class RandomSort {

    public int sort(int[] array){
        int counter=0;
        while (!isSorted(array)){
            shuffle(array);
            counter++;
        }
        return counter;
    }

    private boolean isSorted(int[] array){
        for(int i=0; i<array.length-1; ++i){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    private void shuffle(int[] array){
        for(int i=0; i<array.length-1; ++i){
            int index1 = (int) (Math.random()*array.length);
            int index2 = (int) (Math.random()*array.length);

            int tmp=array[index1];
            array[index1]=array[index2];
            array[index2]=tmp;
        }
    }
}
