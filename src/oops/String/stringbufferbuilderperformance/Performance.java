package oops.String.stringbufferbuilderperformance;

public class Performance
{
    static void main() {
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("placement");
        for(int i=0;i<10000000;i++){
            sbf.append("Tranning");
        }
        System.out.println("time taken by string buffer:"+(System.currentTimeMillis()-startTime)+"ms");
        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("placement");
        for(int i=0;i<10000000;i++){
            sbl.append("Tranning");
        }
        System.out.println("time taken by string builder:"+(System.currentTimeMillis()-startTime)+"ms");
    }
}//buffer should be greater
//builder is smaller
