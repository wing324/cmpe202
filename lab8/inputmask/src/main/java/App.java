/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        num.wrapDecorator(new NumberDecorator());
        exp.wrapDecorator(new ExpDecorator());

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        ch = ch.trim() ;
        if( ch.equals("")){

        }else if(ch.toLowerCase().equals("x")){
            screen.deleteKey(count);
            if(count>0){
                count--;
            }
        }else{
            count++;
            screen.key(ch, count);
        }

    }

}

