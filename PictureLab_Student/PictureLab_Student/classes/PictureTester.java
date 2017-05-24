/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
<<<<<<< HEAD
    beach.explore();
    beach.zeroBlue();
=======
	beach.explore();
    beach.keepOnlyBlue();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    beach.explore();
  }
  
  public static void testNegate()
  {
	Picture beach = new Picture("beach.jpg");
<<<<<<< HEAD
    beach.explore();
    beach.zeroBlue();
=======
	beach.explore();
    beach.negate();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    beach.explore();
  }
  
  public static void testGrayscale()
  {
	Picture beach = new Picture("beach.jpg");
<<<<<<< HEAD
    beach.explore();
    beach.zeroBlue();
=======
	beach.explore();
    beach.grayscale();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
<<<<<<< HEAD
	Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
=======
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
<<<<<<< HEAD
	Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVertical();
=======
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
<<<<<<< HEAD
	Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVertical();
=======
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    redMotorcycle.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
<<<<<<< HEAD
	Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorVertical();
=======
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
<<<<<<< HEAD
	Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorVertical();
    seagull.explore();
  }
  
=======
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testCopy()
  {
	Picture adobada = new Picture("adobada.jpg");
	Picture smallAdobada = new Picture("smallAdobada.jpg");
	adobada.copy(adobada,1,2,3,4,5,6);
	adobada.explore();
  }
  
>>>>>>> e3c3dd7c499482bba1bc0856a5e17338611648d6
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas1 = new Picture("640x480.jpg");
    canvas1.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}