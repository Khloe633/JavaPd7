class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
   
msg = Input.readFile("Original.txt");    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
String encode (String txt){
  String bld = "";
  for(int x = 0;  x < txt.length()-1; x++){
    char ch;
    int ascii;
    ch = txt.charAt(x);
    ascii = (int)ch;
    
    if(ascii == 90){
      ascii = 67;
    }
    else if(ascii == 122){
      ascii = 100;
    }
    else{
      ascii += 3;
    }
    bld += (char)ascii;
  }
  return bld;
}
  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}