public boolean endOther(String a, String b) {
  String main = new String();
  String adds = new String();
  
  if (a.length() > b.length()){
    main = a.toLowerCase();
    adds = b.toLowerCase();
  }else{
    main = b.toLowerCase();
    adds = a.toLowerCase();
  }
  
  if (main.substring(main.length()-adds.length(),main.length()).equals(adds)){
    return true;
  }else{
    return false;
  }
}
