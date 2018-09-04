package 第五部分一致性.合成模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 17:23
 */


public class FileTreatmentException extends RuntimeException{
    public FileTreatmentException(){
    }

    public FileTreatmentException(String msg){
        super(msg);
    }
}
