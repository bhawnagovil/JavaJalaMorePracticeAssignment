package Exception_Practice;
/* StringIndexOutOfBoundsException :
It is thrown by String class methods to indicate that an index is
either negative or greater than the size of the string */

public class StringIndexOutOfBoundExcep {
    public static void main(String[] args) {
  try{
      stringClassExcep();
  }
  catch(StringIndexOutOfBoundsException e)
  {
      System.out.println();
      System.err.println("StringIndexOutOfBoundsException caught");
       /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
      e.printStackTrace();
  }
    }

    public static void stringClassExcep(){
        String str= "Kumar";
        // Trying to access at negative index
        char charAtNegativeIndex = str.charAt(-1);
        // tryig to access the value out tof string size
        char charAtoutOfstringlength= str.charAt(5);

    }
}
