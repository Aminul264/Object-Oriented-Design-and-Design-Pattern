<h1>Facade Design Pattern</h1>
<h2>Description</h2>
<p>I Have Implemented Facade design pattern.Which follows the  following steps:</p>
<pre>
1. Design the interface (IAccount).
2. Implement the IAccount interface with three classes (Chequing,Saving,Investment).
3. Create the façade class (BankService) and wrap the classes that
   implement the interface.
4. Use the façade class to access the subsystem(Customer Class)</pre>
<pre>

<h3>Step 1: Design the Interface</h3>
First, create an interface that will be implemented by the
different account classes(Saving,Chequing and Investmnet), but will not be known to the
Customer class.

<h3>Step 2: Implement the Interface with one or more
classes</h3>
Implement the interface with classes that will be wrapped with
the façade class. Note that in this simple example, only one
interface is being implemented and hidden, but in practice, a façade class can be used to wrap all the interfaces and classes
for a subsystem.

<h3>
Step 3: Create the façade class and wrap the
classes that implement the interface</h3>
The BankService class is the façade. Its public methods are
simple to use and show no hint of the underlying interface and
implementing classes. The information hiding principle is
used here to prevent client classes from “seeing” the account
objects, and how these accounts behave – note that access
modifiers for each Account have been set to private.

<h3>Step 4: Use the façade class to access the
subsystem
</h3>
With the façade class in place, the client class can access
accounts through the methods of the BankService class. The
BankService class will tell the client what type of actions it will
allow the client to call upon and then it will delegate that action
to the appropriate Account object.

</pre>
