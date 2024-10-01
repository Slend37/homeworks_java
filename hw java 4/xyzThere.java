public boolean xyzThere(String str) {
  for (int i = 0; i<str.length()-2; i++){
    if (str.substring(i,i+3).equals("xyz")){
      if (i>0){
        if (str.substring(i-1,i).equals(".")){
          continue;
        }else{
          return true;
        }
      }else{
        return true;
      }
    }
  }
  return false;
}