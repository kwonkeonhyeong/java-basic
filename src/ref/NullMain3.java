package src.ref;

public class NullMain3 {
    public static void main(String[] args) {
//        BigData bigData = new BigData();
//        System.out.println("bigData.count=" + bigData.count);
//        System.out.println("bigData.data=" + bigData.data);
//
//        //NullPointerException
//        System.out.println("bigData.data.value" + bigData.data.value);

        BigData bigData2 = new BigData();
        bigData2.data = new Data();
        System.out.println("bigData2.count=" + bigData2.count);
        System.out.println("bigData2.data=" + bigData2.data);

        //NullPointerException 발생 안함
        System.out.println("bigData.data.value" + bigData2.data.value);

    }
}
