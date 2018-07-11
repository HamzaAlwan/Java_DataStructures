Stack and Queue

In this workshop, we'll implement and test two basic data structures:

1. Queue
A queue works like a line for an amusement park ride -- people enter at the end of the queue and leave from the front (FIFO: first in, first out).

Mainly the following  basic operations are performed on queue:
Enqueue: Adds an item to the queue. If the queue is full, then it is said to be an Overflow condition.
Dequeue: Removes an item from the queue. The items are popped in the same order in which they are pushed. If the queue is empty, then it is said to be an Underflow condition.

This property of Queue makes it also useful in following kind of scenarios.
1) When a resource is shared among multiple consumers. Examples include CPU scheduling, Disk Scheduling.
2) When data is transferred asynchronously (data not necessarily received at same rate as sent) between two processes. Examples include IO Buffers, pipes, file IO, etc.


Read me (instructions):

Make the size fixed , size=3.
Basic operations: implement Push() and Pop() methods.
Implement Display() method .
In StackQueue.java file you will find the test for the Queue 
Run this file after finish implementing queue, The result it should be like:


2. Stack
A stack works like a stack of plates -- plates are added and removed from the the top of the stack (LIFO: last in, first out).
Mainly the following  basic operations are performed in the stack:
Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.















Read me (instructions):

Make the size fixed , size=3.
Basic operations: implement Push() AND Pop() methods.
Implement PrintElements() method .
In StackQueue.java file you will find the test for the Stack 
Run this file after finish implementing queue, The result it should be like:
















LinkedList

A linked list is a dynamic data structure that allows for constant time insertion and removal at any point in the linked list (compare this to an array which on average has linear time insertion and removal operations). In exchange for this insertion and removal speed, linked lists are not indexed and any find operations on a link list require the linear time operation of traversing the entire linked-list from the beginning



A linked list would be great for….
An itinerary you expect to add and remove destinations to and from.
LinkedList contains Five methods:
addToTail(): method, takes a value and adds it to the list.

contains(): method, returns boolean reflecting whether or not the passed-in value is in the linked list.

removeHead(): method, removes the first node from the list and returns its value.

printList(): method, returns all the nodes values inside the list.

getHead(): method, returns the head of the list.

Remove(): method, accepts a node value and removes the node. 

Bare Minimum Requirements
Start by implementing Node class, it contains:
Next attribute ( what data type do you think it should be?)
Data attribute (integer)
Implement the following methods:
AddToTail()
Contains()
RemoveHead()
Extra Credit
Implement printlist(), and remove method().






















Tree:

A tree is a hierarchical data structure consisting of a node (potentially) with children. The children are trees unto themselves, that is, nodes with (potential) children. For this reason the tree is referred to as a recursive data structure.
 

 

Your mission is create:
A tree class with the following properties:
Node object, exists in your code file already.
.addChild() method, takes any value, sets that as the target of a node, and adds that node as a child of the tree
A .contains() method, takes any input and returns a boolean reflecting whether it can be found as the value of the target node or any descendant node
display() method, iterates through the tree nodes and displays them in the console.

Bare Minimum Requirements
Start by writing Node class with the following attributes:
Child (what datatype do you think it should be ?)
Value (Integer)
Implement tree methods addchild(), contains(), and display().









5. Hash Table
Hash tables (sometimes called hash maps) store key value pairs. They do so in a memory efficient way by using a 'hashing function' that translates keys into numerical indices located within a fixed block of memory (think about the contiguous blocks of memory used in arrays). Hash tables only increase their size in memory when necessary, and reduce their size in memory when possible.
 



There are variety of common ways to implement a hash table, but the basic parts of any hash table are the array(storage), the hash function, and handling collisions.
 
 
Bare Minimum Requirements
 
Take a look at your code, note that we used LinkedList to implement Hash Table, you can still use your own way.
 
Start by implementing Bucket class, it should contain:
A String Key
A String Value
 
Implement hashtable main methods:
An .insert() method
Handle collisions in your insert function
The point here that before adding a value to a bucket, check all the keys for that bucket , and overwrite the value of the key if it exists
 use hashfn to generate index “already provided”
 handle the case of if that index exist
 handle the case of if that index does not exist
 loop through the index value 
 check if the key exist and replace its value 
 if key doesn't exist add the pair of key value as an array
 
Read the following for better understanding of collisions. Here
 
A .retrieve() method
A .remove() method
you can use Bucket class to help you.
 

