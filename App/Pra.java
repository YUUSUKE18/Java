class Pra {

    public static double calcTrinangleArea(double bottom, double height){
        double TriangleArea = bottom * height / 2;
        return TriangleArea;
    }

    public static double calcCircleArea(double radius){
        double CircleArea = radius * radius * 3.14;
        return CircleArea;
    }

    public static void main(String args[]) {
        double TriangleArea = calcTrinangleArea(10, 5);
        double CircleArea = calcCircleArea(5);
        System.out.println(TriangleArea);
        System.out.println(CircleArea);
        
    }


}