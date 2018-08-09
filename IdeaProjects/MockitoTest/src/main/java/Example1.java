public class Example1 {
    private int attr;

    public Example1(int attr){
        this.attr = attr;
    }

    //modificando para teste no git
    public void fazNada(){
        int a;
    }

    public String simpleMethod(){
        String stringReturn = null;
        if(attr < 10){
            stringReturn = "low";
        }else{
            stringReturn = "high";
        }

        return stringReturn;
    }
}
