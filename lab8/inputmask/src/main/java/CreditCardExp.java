/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IDisplayDecorator wrapped = null ;
	private String date = "" ;

	public void wrapDecorator(IDisplayDecorator w) {
		this.wrapped = w;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" +  wrapped.decorator(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ){
			date += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	public void deleteKey(int cnt) {
		if ( cnt >= 17 && cnt <= 20 ){
			if(date.length()==0){

			}else{
				date = date.substring(0,date.length()-1) ;
			}
		} else if ( nextHandler != null )
			nextHandler.deleteKey(cnt) ;
	}


	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}