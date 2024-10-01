public boolean catDog(String str) {
  int k_cat = 0;
  int k_dog = 0;
  
  for (int i = 0; i < str.length() - 2; i++){
    if (str.substring(i, i + 3).equals("cat")){
      k_cat++;
    } else if (str.substring(i, i + 3).equals("dog")){
      k_dog++;
    }
  }
  return k_cat == k_dog;
}
