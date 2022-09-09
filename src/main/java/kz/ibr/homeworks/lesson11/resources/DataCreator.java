package kz.ibr.homeworks.lesson11.resources;

public class DataCreator {
    int[] dataArray;
    public DataCreator(int elementsCount){
        this.dataArray = new int[elementsCount];
        for(int i=0; i < elementsCount; i++){
            dataArray[i] = (int) (Math.random() * 100);
        }
    }

    public int[] getDataArray(){
        return dataArray;
    }
}
