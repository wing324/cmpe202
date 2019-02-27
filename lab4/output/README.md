I used state and chain of responsibility design patterns to the Din Tai Fung design. Let me explain why I used those two design patterns.

- State pattern
  - Why  
    Table has two states: available or occupied, so I choose state design pattern to define two separate state objects and encapsulate specific state behavior for every state.
  - Participant  
    Table class plays a "Context" role to present a single interface to the outside world.
    TableState class plays a base class role.
    TableAvailable and TableOccupied are the individual state.
- Chain of responsibility pattern
  - Why  
    I want to decouple sender and receiver.
  - Participant  
    WaitlistMessage, ReadyMessage, ConfirmMessage, CancellMessage are processing elements or ConcreteHandler. 
    AbstractMessage is Handler to sorts the processing elements above, setting who is who's next processing.
    Customer and Waitlist classes are Client.