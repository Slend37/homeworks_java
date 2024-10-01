public String doubleChar(String str) {
  String b = new String();
  for (int i = 0; i < str.length(); i++){
    b = b + str.substring(i, i + 1)+str.substring(i, i + 1);
  }
  return b;
}
