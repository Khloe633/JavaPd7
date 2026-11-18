class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  String [] friends= {"Stacy", "Becky", "Liam", "Chester"};
    
    double [] celsius = {23.15, 27, 20, 0};
    double [] cToF = celsiusToFarhenheit(celsius); 
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}