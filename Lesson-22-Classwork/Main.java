class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  String [] friends= {"Stacy", "Becky", "Liam", "Chester"};
    
    double [] ce = {23.15, 27, 20, 0};
    double [] convert = cToF(ce); 
  }

  double[] CtoF(double [] celsius){
    double [] farhenheit = new double[celsius.length];
    for(int x=0; x <= celsius.length-1; x++){
        farhenheit[x] = (celsius[x]);
    }
    return farhenheit;
}

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}