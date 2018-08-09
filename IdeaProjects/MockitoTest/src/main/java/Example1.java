public class Example1 {
    private int attr;

    public Example1(int attr){
        this.attr = attr;
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
