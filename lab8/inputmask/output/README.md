## The screenshots of the App

![output](..\imgs\output.png)

## Design Pattern 

##### 1. Decorator Design Pattern

I used Decorator Design Pattern for display() method. Because we already had CreditCardNum and CreditCardExp objects to display the screen, so I add decorator design pattern to decorate the display() method to implement the screen we want. 



##### 2. Chain Of Responsibility Design Pattern

I used Chain Of Responsibility Design Pattern for deleteKey() method, this method helps the application to handle the key of  "x" or "X", I put CreditCardNum, CreditCardExp and CreditCardCVC into a chain, and I passed the request("count" variables)  along with the handler of chain,  each handler(CreditCardNum, CreditCardExp and CreditCardCVC) depends on the value of "count" to decide to process the request or pass it to the next handler in the chain.