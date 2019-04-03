/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IDisplayDecorator wrapped = null ;
	private String number = "" ;

	public void wrapDecorator(IDisplayDecorator w) {
		this.wrapped = w;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
		if ( number.equals("") ){
			return "[4444 4444 4444 4444]" + "  " ;
		}
		else{
			return "[" + wrapped.decorator(number) + "]" + "  " ;
		}

	}

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			number += ch ;
		} else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	public void deleteKey(int cnt) {
		if ( cnt <= 16 ){
			if(number.length() == 0){
//				nothing to do
			}else{
				number = number.substring(0,number.length()-1) ;
			}

		} else if ( nextHandler != null )
			nextHandler.deleteKey(cnt) ;
	}



	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}