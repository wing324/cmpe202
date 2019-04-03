public class ExpDecorator implements IDisplayDecorator{

    String out ;

    public ExpDecorator(){

    }

    public String decorator(String date){
        out = "";
        for(int i=0; i< date.length(); i++){
            if(i==2){
                out += "/";
            }
            out += date.substring(i,i+1);
        }
        return out;
    }

}
