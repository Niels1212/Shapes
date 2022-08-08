package com.example.shapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


import java.io.IOException;
import java.util.Optional;
//import java.awt.Color;

//Enum
enum MyColor{

    maroon(128,0,0,255),
    darkred(139,0,0,255),
    brown(165,42,42,255),
    firebrick(178,34,34,255),
    crimson(220,20,60,255),
    red(255,0,0,255),
    tomato(255,99,71,255),
    coral(255,127,80,255),
    indianred(205,92,92,255),
    lightcoral(240,128,128,255),
    darksalmon(233,150,122,255),
    salmon(250,128,114,255),
    lightsalmon(255,160,122,255),
    orangered(255,69,0,255),
    darkorange(255,140,0,255),
    orange(255,165,0,255),
    gold(255,215,0,255),
    darkgoldenrod(184,134,11,255),
    goldenrod(218,165,32,255),
    palegoldenrod(238,232,170,255),
    darkkhaki(189,183,107,255),
    khaki(240,230,140,255),
    olive(128,128,0,255),
    yellow(255,255,0,255),
    yellowgreen(154,205,50,255),
    darkolivegreen(85,107,47,255),
    olivedrab(107,142,35,255),
    lawngreen(124,252,0,255),
    chartreuse(127,255,0,255),
    greenyellow(173,255,47,255),
    darkgreen(0,100,0,255),
    green(0,128,0,255),
    forestgreen(34,139,34,255),
    lime(0,255,0,255),
    limegreen(50,205,50,255),
    lightgreen(144,238,144,255),
    palegree(152,251,152,255),
    darkseagreen(143,188,143,255),
    mediumspringgreen(0,250,154,255),
    springgreen(0,255,127,255),
    seagreen(46,139,87,255),
    mediumaquamarine(102,205,170,255),
    mediumseagreen(60,179,113,255),
    lightseagreen(32,178,170,255),
    darkslategray(47,79,79,255),
    teal(0,128,128,255),
    darkcyan(0,139,139,255),
    aqua(0,255,255,255),
    cyan(0,255,255,255),
    lightcyan(224,255,255,255),
    darkturquoise(0,206,209,255),
    turquoise(64,224,208,255),
    mediumturquoise(72,209,204,255),
    paleturquoise(175,238,238,255),
    aquamarine(127,255,212,255),
    powderblue(176,224,230,255),
    cadetblue(95,158,160,255),
    steelblue(70,130,180,255),
    cornflowerblue(100,149,237,255),
    deepskyblue(0,191,255,255),
    dodgerblue30(30,144,255,255),
    lightblue(173,216,230,255),
    skyblue(135,206,235,255),
    lightskyblue(135,206,250,255),
    midnightblue(25,25,112,255),
    navy(0,0,128,255),
    darkblue(0,0,139,255),
    mediumblue(0,0,205,255),
    blue(0,0,255,255),
    royalblue(65,105,225,255),
    blueviolet(138,43,226,255),
    indigo(75,0,130,255),
    darkslateblue(72,61,139,255),
    slateblue(106,90,205,255),
    mediumslateblue(123,104,238,255),
    mediumpurple(147,112,219,255),
    darkmagenta(139,0,139,255),
    darkviolet(148,0,211,255),
    darkorchid(153,50,204,255),
    mediumorchid(186,85,211,255),
    purple(128,0,128,255),
    thistle(216,191,216,255),
    plum(221,160,221,255),
    violet(238,130,238,255),
    magenta(255,0,255,255),
    orchid(218,112,214,255),
    mediumvioletred(199,21,133,255),
    palevioletred(219,112,147,255),
    deeppink(255,20,147,255),
    hotpink(255,105,180,255),
    lightpink(255,182,193,255),
    pink(255,192,203,255),
    antiquewhite(250,235,215,255),
    beige(245,245,220,255),
    bisque(255,228,196,255),
    blanched(255,235,205,255),
    wheat(245,222,179,255),
    corn(255,248,220,255),
    lemonchiffon(255,250,205,255),
    lightgoldenrodyellow(250,250,210,255),
    lightyellow(255,255,224,255),
    saddlebrown(139,69,19,255),
    sienna(160,82,45,255),
    chocolate(210,105,30,255),
    peru(205,133,63,255),
    sandybrown(244,164,96,255),
    burlywood(222,184,135,255),
    tan(210,180,140,255),
    rosybrown(188,143,143,255),
    moccasin(255,228,181,255),
    navajowhite(255,222,173,255),
    peachpuff(255,218,185,255),
    mistyrose(255,228,225,255),
    lavenderblush(255,240,245,255),
    linen(250,240,230,255),
    oldlace    (253,245,230,255),
    papayawhip(255,239,213,255),
    seashell(255,245,238,255),
    mintcream(245,255,250,255),
    slategray(112,128,144,255),
    lightslategray(119,136,153,255),
    lightsteelblue(176,196,222,255),
    lavender(230,230,250,255),
    floralwhite(255,250,240,255),
    aliceblue(240,248,255,255),
    ghostwhite(248,248,255,255),
    honeydew240(255,240,255,255),
    ivory(255,255,240,255),
    azure(240,255,255,255),
    snow(255,250,250,255),
    black(0,0,0,255),
    dimgray(105,105,105,255),
    gray(128,128,128,255),
    darkgray(169,169,169,255),
    silver(192,192,192,255),
    lightgray(211,211,211,255),
    gainsboro(220,220,220,255),
    whitesmoke(245,245,245,255),
    white(255,255,255,255);

    private int r;
    private int g;
    private int b;
    private int a;
    private int argb;

    MyColor(int r, int g, int b, int a){
        setR(r);
        setG(g);
        setB(b);
        setA(b);
        setARGB(r,g,b,a);
    }

    public void setR(int r){if(r>=0 && r<=255) this.r=r;}
    public void setG(int g){if(g>=0 && g<=255) this.g=g;}
    public void setB(int b){if(b>=0 && b<=255) this.b=b;}
    public void setA(int a){if(a>=0 && a<=255) this.a=a;}
    public void setARGB(int r, int g, int b, int a){
        this.argb = (a << 24) & 0xFF000000 |
                (r << 16) & 0x00FF0000 |
                (g << 8) & 0x0000FF00 |
                b;
    }

    public int getR(){ return r;}
    public int getG(){ return g;}
    public int getB(){ return b;}
    public int getA(){ return a;}
    public int getARBG(){ return argb;}

    public String getHexColor(){

        return "#" + Integer.toHexString(argb).toUpperCase();
    }/*
   public Color getAWTColor(){
        return Color.decode(Integer.toString(argb));
    }*/
    public Color getJavaFXColor(){return Color.rgb(r,g,b);}

    public static MyColor [] getMyColors(){
        return MyColor.values();
    }

    public void print(){
        System.out.println("(" + this.r + ", " + this.g + ", " + this.b + ", " + this.a + ")" + "Hexadecimal Code: " + this.getHexColor());
    }
}

//MyShapeClass

class MyShape {
    MyPoint p;
    MyColor color;

    //Constructor
    MyShape(MyPoint p, MyColor color) {
        this.p = p;
        this.color = Optional.ofNullable(color).orElse(MyColor.blue);
    }

    //Area and Perimeter methods
    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    //Draw Shape
    public void draw(GraphicsContext GC) {
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    }

    @Override
    public String toString() {
        return "This is my shape object";
    }


    static class MyPoint {
        double x, y;
        MyColor color;

        //Constructors
        MyPoint() {
            setPoint(0, 0);
            this.color = MyColor.blue;
        }//Default Constructor

        MyPoint(double x, double y, MyColor color) {
            setPoint(x, y);
            this.color = Optional.ofNullable(color).orElse(MyColor.blue);
        }

        MyPoint(MyPoint p, MyColor color) {
            setPoint(p);
            this.color = Optional.ofNullable(color).orElse(MyColor.yellow);
        }

        //Set Methods
        public void setPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setPoint(MyPoint p) {
            this.x = p.getX();
            this.y = p.getY();
        }

        //Get Methods
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public MyColor getColor() {
            return color;
        }

        //Move the Points x and y by given amounts
        public void translate(int dx, int dy) {
            setPoint(x + dx, y + dy);
        }

        //Compute the distance between point and origin
        public double distanceFromOrigin() {
            return Math.sqrt(x * x + y * y);
        }

        //Compute the distance between point and some other point
        public double distance(MyPoint p) {
            double dx = x - p.getX();
            double dy = y - p.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }

        //Compute angle between with x-axis
        public double angleX(MyPoint p) {
            double dx = (double) (p.getX() - x);
            double dy = (double) (p.getY() - y);
            return Math.toDegrees(Math.atan2(dy, dx));
        }

        //Are two points the same?
        public boolean equals(MyPoint p) {
            return x == p.getX() && y == p.getY();
        }

        //Draw a point on Canvas
        public void draw(GraphicsContext GC) {
            GC.setFill(color.getJavaFXColor());
            GC.fillRect(x, y, 1, 1);
        }

        @Override
        public String toString() {
            return "Point p(" + x + ", " + y + ")";
        }

    }
}

//Class MyLine Extends class MyShape
class MyLine extends MyShape {
    MyPoint p1, p2;
    MyPoint[] pLine = new MyPoint[2];
    MyColor color;

    MyLine(MyPoint p1, MyPoint p2, MyColor color) {
        super(new MyPoint(), null);
        this.p1 = p1;
        this.p2 = p2;
        pLine[0] = p1;
        pLine[1] = p2;
        this.color = Optional.ofNullable(color).orElse(MyColor.blue);
    }

    //Get Object
    public MyPoint[] getLine() {
        return pLine;
    }

    //Angle in degrees with the x-axes
    public double angleX() {
        return Math.toDegrees(Math.atan2((double) (p2.getX() - p1.getX()), (double) (p2.getY() - p1.getY())));
    }

    //Length
    public double length() {
        return (int) (Math.sqrt((Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2))));
    }

    @Override
    //Area = 0
    public double area() {
        return 0;
    }

    @Override
    //Perimeter = Length
    public double perimeter() {
        return length();
    }

    @Override
    public void draw(GraphicsContext GC) {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    @Override
    public String toString() {
        return "Line [" + p1 + ", " + p2 + "] Length " + length();
    }

}

//Class MyRectangle Extends class MyShape
class MyRectangle extends MyShape {
    MyPoint pTLC; //TopLeftCorner of Rectangle
    double width, height; //With and Height of Rectangle
    MyColor color;

    MyRectangle(MyPoint p, double w, double h, MyColor color) {
        super(new MyPoint(), null);
        this.pTLC = p;
        this.width = w;
        this.height = h;
        this.color = Optional.ofNullable(color).orElse(MyColor.turquoise);
    }

    //Get Methods
    public MyPoint getTLC() {
        return pTLC;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public MyColor getColor() {
        return color;
    }

    @Override
    //Area
    public double area() {
        return width * height;
    }

    @Override
    //Perimeter
    public double perimeter() {
        return 2 * (width * height);
    }

    @Override
    public void draw(GraphicsContext GC) {
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(pTLC.getX(), pTLC.getY(), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle Top Left Corner " + pTLC + " Width: " + width + " Height: " + height + " Perimeter: " + perimeter() + "Area: " + area();
    }
}

//Class MyOval
class MyOval extends MyShape {
    MyPoint center;
    double major;
    double minor;
    MyColor color;

    MyOval(MyPoint p, double max,double min, MyColor color) {
        super(new MyPoint(), null);
        this.center = p;
        this.major = max;
        this.minor = min;
        this.color = Optional.ofNullable(color).orElse(MyColor.azure);
    }

    //Get Methods
    public MyPoint getCenter() {
        return center;
    }
    public double getMajorAxis(){
        return major;
    }

    public double getMinorAxis() {
        return minor;
    }

    public MyColor getColor() {
        return color;
    }

    @Override
    public double area() {
        return 2 * (int) (Math.PI * (major/2) * (minor/2) );
    }


    public double perimeter() {
        return (2*Math.PI)*(Math.sqrt(((major*major)+(minor*minor))/2));
    }


    @Override
    public void draw(GraphicsContext GC) {
        GC.setFill(color.getJavaFXColor());
        GC.fillOval(center.getX() - major, center.getY() - minor, 2.0 * major, 2.0 * minor);
    }

    @Override
    public String toString() {
        return "Circle Center: (" + center.getX() + ", " + center.getY() + ")" + "\n" + " Major-axis length: " + major + "\n"+ " Minor-axis length: " + minor + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter();

    }

}

public class HelloApplication extends Application {
    @Override
    public void start(Stage PS){
        int widthCV=400;
        int heightCV=200;
        Canvas CV = new Canvas(widthCV,heightCV);
        GraphicsContext GC = CV.getGraphicsContext2D();

        Pane Root = new Pane();
        Root.setPrefSize(widthCV,heightCV);

        MyShape.MyPoint p = new MyShape.MyPoint(widthCV/4.0,heightCV/4.0,null);
        MyShape.MyPoint a = new MyShape.MyPoint(widthCV/3.100775,heightCV/3.100775,null);
        MyShape.MyPoint b = new MyShape.MyPoint(widthCV/2.657807,heightCV/2.657807,null);
        MyShape.MyPoint q = new MyShape.MyPoint(widthCV/2.0,heightCV/2.0,null);
        MyShape.MyPoint r = new MyShape.MyPoint(widthCV,heightCV,null);
        MyShape [] myShapes = new MyShape[7];

        myShapes[0] = new MyRectangle(p,widthCV/2.0,heightCV/2.0,MyColor.hotpink);
        myShapes[1] = new MyOval(q,widthCV/4.0,heightCV/4.0,MyColor.forestgreen);
        myShapes[2] = new MyRectangle(a,widthCV/2.846975,heightCV/2.846975,MyColor.blueviolet);
        myShapes[3] = new MyOval(q,widthCV/5.693950178,heightCV/5.693950178,MyColor.blanched);
        myShapes[4] = new MyRectangle(b,widthCV/4.0609137,heightCV/4.0609137,MyColor.darkkhaki);
        myShapes[5] = new MyOval(q,widthCV/8.121827411,heightCV/8.121827411,MyColor.chartreuse);
        myShapes[6] = new MyLine(new MyShape.MyPoint(), r, MyColor.black);

        for (MyShape shape : myShapes){
            shape.draw(GC);
        }

        Root.getChildren().add(CV);


        Scene SC = new Scene(Root,widthCV,heightCV,MyColor.white.getJavaFXColor());
        PS.setTitle("Project Shapes");
        PS.setScene(SC);
        PS.show();



    }
    public static void main(String[] args) {
        launch(args);
    }
}
