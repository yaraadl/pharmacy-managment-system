# pharmacy-managment-system
 a pharmacy management system project  made with java   object oriented programming  applied
Pharmacy
 
Project is classified into 6 classes
 
Class 1: pharmacy
A class which makes an array list from another class of the type branches .this class is used to add more than one branch to our pharmacy. And get the product name needed from the specific branch 

Class 2: product
A class which is responsible for all the selling operations done in the pharmacy where you can sell the product by decreasing its quantity in the stock by the needed amount by customer while sending the amount he needed as a parameter to be decreased to be sold using the sell method in this class .then setting the quantity to be updated.  If we want to increase the quantity of this product we can use the increment quantity method by sending the q as a parameter which is the increased amount
Class 3: branches
A class which can store get you the name of your branch the number of the products or medicine affordable to be sold in this branch, it also can get the size of your products array list, it is responsible for adding a new product in your branch by adding it in your array list, it is responsible for adding a new customer or a new worker to your branch 
Class 4: person
It is an abstract class through which both classes customer and worker inherits its variables and methods   you are forced to implement the function salreceet in both classes but not in person.it is responsible for giving each of the worker and customer some info as his name gender address phone number.

Class 5: worker
A class which is considered to be one of the children of person class which is responsible for storing and calculating the worker’s salary which is totally dependent on his experience using the overridden method which is salereceet.

Class 6: customer
A class which is considered to be one of the children of person class which is responsible for storing and calculating the customer ‘s  sale done  on what he sold which is totally dependent on his total purchases   he used to buy from his specific branch using the overridden method which is salereceet.
Interface: sales
It is an interface that insures that a specific sale will be done on the cost before being paid by either the worker or the customer  using the salereceet 
method which uses the over ridden property while 
passing the cost double variable as 
a parameter to perform the sale 
