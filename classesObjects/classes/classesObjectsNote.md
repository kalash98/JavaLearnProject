# HERE IS README NOTE FOR THIS PACKAGE classes

##  Naming a Method
- Method name should be a verb in lowercase or multi-word name that begins by verb followed by adjective, nouns etc.
- With your method name we must imagine what your method does, so choose the good verb and good follow adjectives or nouns if necessary
 
## Local Class scope
- Has access to members of its enclosing class
- Has access final variable or effectively final variable of its enclosing bloc
- Has access to block parameters

  
#### Why we can not define static variable inside local class ?
- Because local class has access to instance variable and so it is implicitly non-static class
- but can declare constant variable