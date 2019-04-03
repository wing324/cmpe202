public class NumberDecorator implements IDisplayDecorator{
    String out;

    public NumberDecorator(){

    }

    public String decorator(String number){
        out = "" ;
        for(int i=0; i< number.length(); i++){
            if( i % 4 == 0 && i != 0){
                out += " ";
            }
            out += number.substring(i,i+1);
        }
        return out;
    }
}
