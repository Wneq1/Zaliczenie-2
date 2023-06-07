//Napisz program, który zastąpi wszystkie znaki „d" znakami „f" we wprowadzonym łańcuchu.


class Main {
  public static void main(String[] args) {
 
    String string =" dase dobry den  !";
    System.out.println("String"+ string);

    char findChar = 'd';
    int count =0; 
    
    for(int i =0; i<string.length();i++){
if(string.charAt(i)==findChar){
  count ++;
}      
    }
    System.out.println("Ilosc zamienianej zmiennej "+ count);
    System.out.println(string.replace('d', 'f'));
  }
}