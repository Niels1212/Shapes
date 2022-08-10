# Java Project "Shapes"
In this project, a hierarchy of Java classes is going to be created. The classes are 
going to be as follows:<br/>
<br/>
MyLine extends MyShape<br/>
MyRectangle extends MyShape<br/>
MyOval extends MyShape<br/>
<br/>
Also, a class MyPoint is used by the super class MyShape as well as all other child 
classes to create reference points for the Java display coordinate system.<br/>
An enum type MyColor will also be used by the super class My Shape and all 
other child classes to define the color of the shapes. This reference type defines a set of 
constant colors by their red, green, blue, and opacity.<br/>
Using all these classes the following image will be created:
<br/>
<p align="center">
  <img width="400" height="290" src="https://user-images.githubusercontent.com/74331905/183967233-b383f061-169b-4b45-abe8-511bb8f3aa5a.png">
</p>

## Solution Methods

In this section, all cases and methods used in the program are going to be 
explained.
First, the following classes are imported and used for this project. Each used class 
is explained in the respective method.<br/>
<br/>
import javafx.application.Application<br/>
import javafx.fxml.FXMLLoader<br/>
import javafx.scene.Group<br/>
import javafx.scene.Node<br/>
import javafx.scene.Scene<br/>
import javafx.scene.canvas.Canvas<br/>
import javafx.scene.canvas.GraphicsContext<br/>
import javafx.scene.layout.Pane<br/><br/>
import javafx.stage.Stage<br/>
import javafx.scene.paint.Color<br/>
import java.io.IOException<br/>
import java.util.Optional<br/>
import java.awt.Color<br/>

Also, note that method toString() gets @Override in super class MyShape and all 
child classes, and methods area(), perimeter(), and draw() in every child class.
This @Override feature allows child classes to provide specific implementation of 
a method used by a super class.

* **Class MyShape:**  this class is the superclass of the hierarchy. This class defines a 
reference point of the type MyPoint (explained later), and the color of the shape 
of the type MyColor(also explained in the next lines).
  * **Area Method:**  This method returns the area of the shape, in this case,
will return zero and will be overwritten by the subclasses of the hierarchy.
  * **Perimeter Method:**   Like the previous method, this method would return 0, 
and it will be overwritten by the subclasses of the hierarchy.
  * **Draw Method:**  This method draws the canvas using getWidth() and 
getHeight(). Also, it gives the background color using, in this case,
getJavaFXColor() (in can also use getAWTColor().
  * **toString Method:**  This method returns the object’s description as a String. 
This method gets overwritten in each subclass of the hierarchy. For this 
class, it returns “This is my shape object”.

<br/>

* **enum MyColor:**   enum is a special data type used to represent a fixed set of 
constant values. In this project, it is used to store the values of the RGB colors 
that are going to be used to paint the shapes. The constructor takes four int 
parameters, r(red), g(green), b(blue), and a(opacity), and using set methods stores values ranging from 0 to 255 in each int variable. Also, MyColor has to get 
methos returning each r, g, b, and a variable.
  * **getHexColor Method:**   This method returns a String with the Hexadecimal 
color. It uses toHexString method taking argb as its only parameter.
  * **getAWTColor Method:**    It returns the color using the method decode from 
java.awt.Color package taking toString(argb) as parameter. For this 
project, this method was not used.
  * **getJavaFXColor Method:**   This method also returns the color and is the 
method used to get the colors for the shapes. The color gets returned
using rgb method from the javafx.scene.paint package taking three int 
parameters representing r(red), g(green), and b(blue) colors.
  * **print Method:**   Void Method that prints the following message “(value [r], 
value [g], value [b], value[a]) Hexadecimal Code: value[hexcode]”.

<br/>

* **Class MyPoint:**   This class is used by the class MyShape to define the reference 
point of the display coordinate system. Also, it is used by all subclasses in the 
hierarchy to define points. In this class, two double variables are defined 
representing the point in the coordinate system and color of MyColor type. The 
default constructor set the point to x=0 and y=0, and color blue. The 
parameterized constructor takes two double values and a MyColor color as 
parameters and sets the corresponding values. Also, it has another constructor 
that takes a MyPoint parameter instead of the two doubles variables to allocate 
the point in the coordinate system
  * **translate Method:**   It shifts a point of coordinates x and y to a given 
amount. It takes two parameters, int dx, and int dy, which are the values 
that the point is going to be shifted by. Returns the shifted values
  * **distanceFromOrigin Method:**   This method computes the distance between 
the origin and the point. It does it by calculating the square root of the 
sum of the squares of x and y. It uses Math.sqrt from java.lang package.
  * **distance Method:**  This method draws the canvas using getWidth() and 
getHeight(). Also, it gives the background color using, in this case,
getJavaFXColor() (in can also use getAWTColor().
  * **angleX Method:**  It calculates the angle between the x-axis and the line 
created by this point and the given point. It takes a MyPoint p and creates 
two temp variables: dx, dy, that calculates the distance between the two 
points (similarly to the distance method) and then by using Math.toDegrees from and Math.atan2 from java.lang, calculates the 
arctan of dy/dx resulting in the value of the angle in degrees.
  * **equals Method:**   This method returns a Boolean. It takes a point and 
compares if it is located at the same position as this point. If it is, returns 
true otherwise returns false.
  * **draw Method:**   This method draws the point in the canvas. It gets the color 
with setFill with color.getJavaFXColor() method.

<br/>

* **Class MyLine:**   This class extends the super class MyShape. The MyLine object is a 
straight line defined by two endpoints of the type MyPoint called p1 and p2. And 
it can be of any color of enum MyColor. The constructor takes the two MyPoint 
variables and the color (being blue the default color).
  * **angleX Method:**   This method returns a double with the angle of the line 
with de x-axis. It accomplishes this in a similar matter to the method 
angleX from the class MyPoint (refer to it in de description above: Class 
My Point -> angleX Method)
  * **length Method:**  It returns the length of the line. To do so, it uses 
Math.pow to calculate the sum of the square root of the x and y distances 
and Math.sqrt to take the square root of the result.
  * **area Method:** It returns the area. Since lines do not have an area, this 
method returns 0.
  * **perimeter Method:**  his method returns a double containing the result of 
the length method.
  * **toString Method:**  This method returns the object’s description as a String.
For this class, it returns “Line [p1,p2] Length [value of length]”.
  * **draw Method:**  This method draws the line on the canvas. It does this by 
getting the color with .setStroke taking color.getJavaFXColor() as argument 
and .strokeLine taking the coordinates of the endpoints.

<br/>

* **Class MyRectangle:**   This class extends the super class MyShape. The 
MyRectangle object is a rectangle of a top-right corner point p, and height h, 
width w and is filled with a color of enum reference type MyColor. The 
constructor takes the TLC point, width, height, and Color. If color is not given 
turquoise will be the default:
  * **getTLC/Width/Height/Color Method:**   The get methods return pTLC(top 
right corner point), width, height, and color respectively
  * **area Method:**  This method returns a double with the area of the rectangle. 
It performs it by multiplying width*height
  * **perimeter Method:**  It returns the perimeter of the MyRectangle object by 
performing the following equation: 2*(width*height).
  * **toString Method:**   This method returns a string representation of the 
MyRectangle object. The printed message is “Rectangle Top Left Corner 
value[pTLC] Width value[width] Height values[height] Perimeter 
perimeter() Area area()”.
  * **draw Method:** This method draws the rectangle on the canvas. It 
accomplishes it using .setFill taking .getJavaFXColor() as parameter for the 
color and .fillReact taking the coordinates of the top left corner and width 
and height.

<br/>

* **Class MyOval:**   This class extends the super class MyShape. The MyOval object is 
defined by ellipse within a rectangle of height variable called minor, and width 
variable called major. Also, it has a center point type MyPoint p, and a color from 
MyColor
  * **area Method:**   It returns the area of the MyOval object by performing 
Pi*(major)*(minor). The value of Pi is obtained with the java.lang.Math 
class.
  * **perimeter Method:**  This method returns the perimeter of the oval. It does 
it by using the following formula: 
(2*Pi)*sqrt(((major*major)+(minor*minor))/2). The square root is 
calculated in the same way as in previous methods.
  * **toString Method:**  This method returns a string representation of the 
MyOval object. The printed message is 
“Circle Center: (value[x], value[y])
Major-axis length: value[major]
Minor-axis length: value[minor]
Area: value[area]
Perimeter: value[perimeter]”
  * **draw Method:**  This method draws the oval on the canvas. It does it by 
using .setFill taking .getJavaFXColor a parameter for the color, and .fillOval 
taking the center point coordinates, and 2*major and 2*minor axis.

## Output
Three different outputs are provided showing how the shapes adapt to 
different sizes of the canvas. The code background is kept on the screen show to show 
the perspective of the different sizes.

* Canvas(130,100):
<p align="center">
  <img width="230" height="200" src="https://user-images.githubusercontent.com/74331905/183976889-9fdd8b55-ad9e-44f6-af5c-2dd265362dc5.png">
</p>

* Canvas(500,200):
<p align="center">
  <img width="500" height="300" src="https://user-images.githubusercontent.com/74331905/183976907-12d5aba2-45b9-4f80-8ee5-ea3f68247684.png">
</p>

* Canvas(500,750):
<p align="center">
  <img width="500" height="550" src="https://user-images.githubusercontent.com/74331905/183976916-140609ca-78c3-4bd0-9aae-067d06490044.png">
</p>

