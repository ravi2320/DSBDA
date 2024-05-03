def palindromeCheck(st: String): Boolean = {
  return st == st.reverse
}

println(palindromeCheck("madam"))
println(palindromeCheck("abc"))